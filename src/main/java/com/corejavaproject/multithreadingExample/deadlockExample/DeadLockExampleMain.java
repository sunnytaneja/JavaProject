package com.corejavaproject.multithreadingExample.deadlockExample;

public class DeadLockExampleMain {

    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();
        DeadLockExample deadLockExample1 = new DeadLockExample();

        Runnable runnable = deadLockExample::deadLockExample;

        Runnable runnable1 = deadLockExample1::createDeadLock;

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
