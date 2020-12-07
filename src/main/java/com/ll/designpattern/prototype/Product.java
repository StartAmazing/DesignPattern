package com.ll.designpattern.prototype;

import java.io.*;
import java.util.Arrays;

/**
 * 例子对象. 模拟复杂对象, 实现cloneable方法,如果不实现这个方法会抛出
 * CloneNotSupportedException 标记方法, 需要重写clone()
 */
public class Product implements Cloneable, Serializable{

    static final long serialVersionUID = 23455123L;

    private String part1;
    private String part2;
    private Integer part3;
    private Integer part4;
    private Integer part5;
    private BaseInfo_mutable baseInfoMutable;
    private BaseInfo_immutable baseInfoImmutable;
    private int[] intArr;
    private BaseInfo_mutable[] baseInfoMutablesArr;

    public Product() {
    }

    public Product(String part1,
                   String part2,
                   Integer part3,
                   Integer part4,
                   Integer part5,
                   BaseInfo_mutable baseInfoMutable,
                   BaseInfo_immutable baseInfo_immutable,
                   int[] intArr,
                   BaseInfo_mutable[] baseInfoMutablesArr) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;
        this.part5 = part5;
        this.baseInfoMutable = baseInfoMutable;
        this.baseInfoImmutable = baseInfo_immutable;
        this.intArr = intArr;
        this.baseInfoMutablesArr = baseInfoMutablesArr;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public Integer getPart3() {
        return part3;
    }

    public void setPart3(Integer part3) {
        this.part3 = part3;
    }

    public Integer getPart4() {
        return part4;
    }

    public void setPart4(Integer part4) {
        this.part4 = part4;
    }

    public Integer getPart5() {
        return part5;
    }

    public void setPart5(Integer part5) {
        this.part5 = part5;
    }

    public BaseInfo_mutable getBaseInfoMutable() {
        return baseInfoMutable;
    }

    public void setBaseInfoMutable(BaseInfo_mutable baseInfoMutable) {
        this.baseInfoMutable = baseInfoMutable;
    }

    public BaseInfo_immutable getBaseInfoImmutable() {
        return baseInfoImmutable;
    }

    public void setBaseInfoImmutable(BaseInfo_immutable baseInfoImmutable) {
        this.baseInfoImmutable = baseInfoImmutable;
    }

    public int[] getIntArr() {
        return intArr;
    }

    public void setIntArr(int[] intArr) {
        this.intArr = intArr;
    }

    public BaseInfo_mutable[] getBaseInfoMutablesArr() {
        return baseInfoMutablesArr;
    }

    public void setBaseInfoMutablesArr(BaseInfo_mutable[] baseInfoMutablesArr) {
        this.baseInfoMutablesArr = baseInfoMutablesArr;
    }

    // 重写clone方法
    @Override
    protected Product clone() throws CloneNotSupportedException {

        // clone()方法 deep copy
//        Product clone = (Product) super.clone();// native方法
//        clone.setBaseInfoMutable(this.getBaseInfoMutable().clone());
//        clone.setBaseInfoImmutable(this.getBaseInfoImmutable().clone());
//        clone.setIntArr(this.getIntArr().clone());
//        clone.setBaseInfoMutablesArr(this.getBaseInfoMutablesArr().clone());
//        return clone;

        // 序列化方式 不推荐，性能会比较差
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)){
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        try(ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream)) {
            Product object = (Product) ois.readObject();

            return object;
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String toString() {
        return super.hashCode() + "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                ", part3=" + part3 +
                ", part4=" + part4 +
                ", part5=" + part5 +
                ", baseInfoMutable=" + baseInfoMutable +
                ", baseInfoImmutable=" + baseInfoImmutable +
                ", intArr Hashcode=" + Arrays.hashCode(intArr) +
                ", baseInfoMutableArr Hashcode=" + Arrays.hashCode(baseInfoMutablesArr) +
                '}';
    }
}
