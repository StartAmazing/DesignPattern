package com.ll.designpattern.singleton.enumsingleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * 线程安全以及反射安全, Enum天然支持（反）序列化
 */
public enum EnumSingleton {
    INSTANCE;

    public void print() {
        System.out.println(this.hashCode());
    }
}

class EnumTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
//        EnumSingleton instance = EnumSingleton.INSTANCE;
//        EnumSingleton instance2 = EnumSingleton.INSTANCE;
//        System.out.println(instance == instance2); // true
//        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
//        EnumSingleton enumSingleton = declaredConstructor.newInstance("INSTANCE", 0); // Exception in thread "main" java.lang.IllegalAccessException: Class com.ll.designpattern.singleton.enumsingleton.EnumTest can not access a member of class com.ll.designpattern.singleton.enumsingleton.EnumSingleton with modifiers "private"

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enumSerializable"));
//        oos.writeObject(EnumSingleton.INSTANCE);
//        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enumSerializable"));
        Object instance = (EnumSingleton) ois.readObject();
        System.out.println(instance == EnumSingleton.INSTANCE);
    }
}
