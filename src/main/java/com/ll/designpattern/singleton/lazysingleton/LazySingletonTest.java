package com.ll.designpattern.singleton.lazysingleton;

/**
 * 线程安全但是反射不安全
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getId() + "---- " + instance);
        new Thread(() -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LazySingleton instance2 = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getId() + "---- " + instance2);
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LazySingleton instance2 = LazySingleton.getInstance();
            System.out.println(Thread.currentThread().getId() + "---- " + instance2);
        }).start();
    }

    public static class LazySingleton {
        private static volatile LazySingleton instance;

        private LazySingleton() {

        }

        public static LazySingleton getInstance() {
            if (instance == null) {
                synchronized (LazySingleton.class) {
                    if (instance == null) {
                        instance = new LazySingleton();
                    }
                }
            }

            return instance;
        }
    }

}
