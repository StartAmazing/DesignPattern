package com.ll.designpattern.singleton.innerclasssingleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * 线程安全以及反射安全
 */
public class InnerClassSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
//        InnerClassSingleton instance = InnerClassSingleton.getInstance();
//        InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
//        System.out.println(instance == instance2); // true
//
//        new Thread(() -> {
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            InnerClassSingleton instance3 = InnerClassSingleton.getInstance();
//            System.out.println(Thread.currentThread().getId() + "----" + instance3);
//        }).start();
//
//        new Thread(() -> {
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            InnerClassSingleton instance3 = InnerClassSingleton.getInstance();
//            System.out.println(Thread.currentThread().getId() + "----" + instance3);
//        }).start()

//        反射攻击
//        Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();
//
//        InnerClassSingleton instance = InnerClassSingleton.getInstance();
//        System.out.println(innerClassSingleton == instance); // false

//        序列化攻击
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testSerializable"));
        oos.writeObject(instance1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testSerializable"));
        InnerClassSingleton instance2 = (InnerClassSingleton) ois.readObject();
        InnerClassSingleton instance3 = InnerClassSingleton.getInstance();
//        System.out.println(instance == instance1);  // false without readResolve method
//        System.out.println(instance2 == instance3);  // without serialVersionUID  --> java.io.InvalidClassException: com.ll.designpattern.singleton.innerclasssingleton.InnerClassSingleton; loc ...
        System.out.println(instance2 == instance3);  //  true
    }
}

class InnerClassSingleton implements Serializable {
    // jvm序列化的时候通过这个版本号来判断文件反序列化后的对象进行识别兼容
    private static final long serialVersionUID = 12354L;

    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
        // 保证反射不会破坏
        if (InnerClassHolder.instance != null) {
            throw new RuntimeException("I guess you're trying to create more than one instance here.");
        }
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

    public Object readResolve() throws ObjectStreamException {
        return InnerClassHolder.instance;
    }
}
