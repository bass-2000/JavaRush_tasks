package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    Thread tr;
    @Override
    public void run() {
        try {
            while (!tr.isInterrupted()) {
                Thread.sleep(0);
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
        }
    }

    @Override
    public void start(String threadName) {
        this.tr = new Thread(this);
        this.tr.setName(threadName);
        this.tr.start();
    }

    @Override
    public void stop() {
        tr.interrupt();

    }
}
