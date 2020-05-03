package com.javarush.task.task24.task2409;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Util {
    protected static Collection<Object[]> jeansArray = new LinkedList<>();

    static {
        jeansArray.add(new Object[]{1, Company.Levis, 34, 6, 150.0});
        jeansArray.add(new Object[]{2, Company.Denim, 35, 8, 154.0});
        jeansArray.add(new Object[]{3, Company.Colins, 32, 6, 120.0});
        jeansArray.add(new Object[]{4, Company.CalvinKleinJeans, 31, 8, 125.0});
    }

    public static List<Jeans> getAllJeans() {

        //add your code here

        abstract class AbstractJeans implements Jeans{
            private int id, length, size;
            private double price;

            public AbstractJeans(int id, int length, int size, double price) {
                this.id = id;
                this.length = length;
                this.size = size;
                this.price = price;
            }

            @Override
            public String toString() {
                return String.format(Locale.ENGLISH, "%s{id=%d, length=%d, size=%d, price=%.1f}", getTM(), id, length, size, price);
            }

            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public int getSize() {
                return 0;
            }
        }

        class Levis extends AbstractJeans {
            public Levis(int id, int length, int size, double price) {
                super(id, length, size, price);
            }

            @Override
            public int getId() {
                return 0;
            }

            @Override
            public double getPrice() {
                return 0;
            }

            @Override
            public String getTM() {
                return this.getClass().getSimpleName();
            }
        }

        class Denim extends AbstractJeans{
            public Denim(int id, int length, int size, double price) {
                super(id, length, size, price);
            }

            @Override
            public int getId() {
                return 0;
            }

            @Override
            public double getPrice() {
                return 0;
            }

            @Override
            public String getTM() {
                return this.getClass().getSimpleName();
            }
        }

        List<Jeans> allJeans = new LinkedList<>();

        for (Object[] obj : getJeansArray()) {
            int id = (int) obj[0];
            final Company company = (Company) obj[1];
            int length = (int) obj[2];
            int size = (int) obj[3];
            double price = (double) obj[4];

            Jeans jeans = null;
            if (Company.Levis == company) {
                jeans = new Levis(id, length, size, price);
            } else if (Company.Denim == company) {
                jeans = new Denim(id, length, size, price);
            } else {
                jeans = new AbstractJeans(id, length, size, price) {
                    @Override
                    public int getId() {
                        return 0;
                    }

                    @Override
                    public double getPrice() {
                        return 0;
                    }

                    public String getTM() {
                        return company.fullName;
                    }
                };
            }
            allJeans.add(jeans);
        }
        return allJeans;
    }

    public static Collection<Object[]> getJeansArray() {
        return jeansArray;
    }

    static enum Company {
        Levis("Levi's"),
        Denim("Denim"),
        Colins("COLIN'S"),
        CalvinKleinJeans("Calvin Klein Jeans");

        final String fullName;

        Company(String name) {
            this.fullName = name;
        }
    }
}