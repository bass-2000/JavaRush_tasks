package com.javarush.task.task27.task2707;

/*
Определяем порядок захвата монитора
*/
public class Solution {
    public static boolean isNormalLockOrder(final Solution solution, final Object o1, final Object o2) throws Exception {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o1) {
                    try {
                        Thread.currentThread().sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (o2) {

                    }
                }
            }
        });
        t1.start();
        try {
            t1.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                solution.someMethodWithSynchronizedBlocks(o1, o2);
            }
        });
        t2.start();
        t2.sleep(100);
        return (!Thread.State.BLOCKED.equals(t2.getState()));


    }

    public static void main(String[] args) throws Exception {
        final Solution solution = new Solution();
        final Object o1 = new Object();
        final Object o2 = new Object();
        while (true) {
            System.out.println(isNormalLockOrder(solution, o1, o2));
        }
    }

    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
        synchronized (obj1) {
            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }
}