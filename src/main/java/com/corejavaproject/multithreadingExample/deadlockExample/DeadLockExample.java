package com.corejavaproject.multithreadingExample.deadlockExample;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DeadLockExample {
    public void deadLockExample() {
        synchronized (String.class) {
            log.info("{} Start", Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("{} End", Thread.currentThread().getName());
        }

        synchronized (Integer.class) {
            log.info("{} Start", Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("{} End", Thread.currentThread().getName());
        }
    }

    public void createDeadLock() {
        synchronized (Integer.class) {
            log.info("{} Start", Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("{} End", Thread.currentThread().getName());
        }

        synchronized (String.class) {
            log.info("{} Start", Thread.currentThread().getName());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("{} End", Thread.currentThread().getName());
        }
    }
}

