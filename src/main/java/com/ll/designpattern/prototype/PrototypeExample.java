package com.ll.designpattern.prototype;

public class PrototypeExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        BaseInfo_mutable baseInfoMutable = new BaseInfo_mutable("FaceBook");
//        BaseInfo_immutable baseInfoImmutable = new BaseInfo_immutable("FaceBookCode");
        BaseInfo_immutable baseInfoImmutable = new BaseInfo_immutable();
        int[] intArr = new int[]{1,23,4};
        BaseInfo_mutable[] baseInfo_mutablesArr = new BaseInfo_mutable[]{new BaseInfo_mutable("FaceBook")};
        Product product = new Product("part1", "part2", 3, 4, 5, baseInfoMutable, baseInfoImmutable, intArr, baseInfo_mutablesArr);

        // 传统模式   new Product ....

        // 原型模式， java中提供的clone模式,深拷贝
        Product clone = product.clone();
        System.out.println("original: " + product);
        System.out.println("clone: " + clone);
        System.out.println("=============After change reference==============");
        product.getBaseInfoMutable().setCompanyName("Alibaba");
        product.setPart1("Part1");
//        product.getBaseInfoImmutable().setCompanyCode("AlibabaCode");
        System.out.println("original: " + product);
        System.out.println("clone: " + clone);
    }

}
