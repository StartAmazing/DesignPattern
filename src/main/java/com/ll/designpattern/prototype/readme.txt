Prototype
涉及知识点：
1. Cloneable接口/Object#clone方法详解
2. 浅拷贝/深拷贝
3. 序列化机制实现深拷贝

模式定义：
指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象

应用场景：
当代码不应该依赖于需要复制的对象的具体类的时候，请使用Prototype模式

优点：
1. 可以不耦合具体类的情况下克隆对象；
2. 避免重复的初始化代码；
3. 更方便的构造复杂对象

Spring源码中的应用
org.springframework.beans.factory.support.AbstractBeanDefinition
java.util.Arrays