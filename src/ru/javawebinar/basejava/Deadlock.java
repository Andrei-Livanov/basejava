package ru.javawebinar.basejava;

public class Deadlock {
    public static void main(String[] args) {
        final String lockOne = "lock1";
        final String lockTwo = "lock2";
        startThread(lockOne, lockTwo);
        startThread(lockTwo, lockOne);
    }

    private static void startThread(Object lockOne, Object lockTwo) {
        new Thread(() -> {
            System.out.println("Waiting " + lockOne);
            synchronized (lockOne) {
                System.out.println("Holding " + lockOne);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Waiting " + lockTwo);
                synchronized (lockTwo) {
                    System.out.println("Holding " + lockTwo);
                }
            }
        }).start();
    }
}
