package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("d:/test1.txt", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("alex");
            user1.setLastName("mak");
            user1.setMale(true);
            user1.setBirthDate(new Date());
            user1.setCountry(User.Country.UKRAINE);

            User user2 = new User();
            user2.setFirstName("alex2");
            user2.setLastName("mak2");
            user2.setMale(false);
            user2.setBirthDate(new Date());
            user2.setCountry(User.Country.RUSSIA);

            javaRush.users.add(user1);
            javaRush.users.add(user2);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            for (User user : loadedObject.users) {
                System.out.println(
                        user.getFirstName() + " " + user.getLastName() + " " + user.isMale() + " " +
                                user.getBirthDate() + " " + user.getCountry());
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод

            BufferedWriter fWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            for (int i = 0; i < users.size(); i++) {
                fWriter.write("USER");
                fWriter.newLine();
                fWriter.write("\tFirstName:" + users.get(i).getFirstName());
                fWriter.newLine();
                fWriter.write("\tLastName:" + users.get(i).getLastName());
                fWriter.newLine();
                fWriter.write("\tMale:" + users.get(i).isMale());
                fWriter.newLine();
                fWriter.write("\tBD:" + users.get(i).getBirthDate().getTime());
                fWriter.newLine();
                fWriter.write("\tCountry:" + users.get(i).getCountry());
                fWriter.newLine();
            }
            fWriter.close();

        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader fReader = new BufferedReader(new InputStreamReader(inputStream));
            User user;
            while ("USER".equals(fReader.readLine())) {
                user = new User();
                user.setFirstName(fReader.readLine().replace("\tFirstName:", ""));
                user.setLastName(fReader.readLine().replace("\tLastName:", ""));
                user.setMale(Boolean.valueOf(fReader.readLine().replace("\tMale:", "")));
                user.setBirthDate(new Date(Long.parseLong(fReader.readLine().replace("\tBD:", ""))));
                User.Country country;
                switch (fReader.readLine().replace("\tCountry:", "")) {
                    case "UKRAINE" :
                        country = User.Country.UKRAINE;
                        break;
                    case "RUSSIA" :
                        country = User.Country.RUSSIA;
                        break;
                    case "OTHER" :
                        country = User.Country.OTHER;
                        break;
                    default:
                        country = null;
                }
                user.setCountry(country);
                users.add(user);
            }
            fReader.close();

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
