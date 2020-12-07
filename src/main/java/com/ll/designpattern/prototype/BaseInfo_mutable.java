package com.ll.designpattern.prototype;

import java.io.Serializable;

public class BaseInfo_mutable implements Cloneable , Serializable {
    static final long serialVersionUID = 234551231L;

    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BaseInfo_mutable() {
    }

    public BaseInfo_mutable(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Object hashCode is :" + this.hashCode() +" BaseInfo{" +
                "companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    protected BaseInfo_mutable clone() throws CloneNotSupportedException {
        return (BaseInfo_mutable) super.clone();
    }
}
