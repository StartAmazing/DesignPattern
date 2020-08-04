package com.ll.designpattern.singleton.hungrysinglton;

public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance == instance2); // true
    }

    public static class HungrySingleton {
        private static HungrySingleton instance = new HungrySingleton();

        private HungrySingleton() {
            // 保证反射不被破坏
            if (instance != null) {
                throw new RuntimeException("I guess you're trying to create more than one instance here.");
            }
        }

        public static HungrySingleton getInstance() {
            return instance;
        }
    }

}
