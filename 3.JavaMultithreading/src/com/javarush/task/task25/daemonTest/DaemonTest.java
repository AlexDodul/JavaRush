package com.javarush.task.task25.daemonTest;

public class DaemonTest {

    public static void main(String[] args) {
        new WorkerThread().start();

        try {
            Thread.sleep(9500);
        } catch (InterruptedException e) {
        }

        System.out.println("Main Thread ending") ;
    }

}

class WorkerThread extends Thread {

    public WorkerThread() {
        setDaemon(true);
    }

    public void run() {
        int count = 0;

        while (true) {

            System.out.println("Hello from Worker "+count++);

            try {
                sleep(3000);
            } catch (InterruptedException e) {
            }
        }
    }
}
