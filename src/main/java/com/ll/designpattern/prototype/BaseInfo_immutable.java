package com.ll.designpattern.prototype;

import java.io.Serializable;

public final class BaseInfo_immutable implements Cloneable, Serializable {

    static final long serialVersionUID = 123455123L;

    @Override
    public String toString() {
        return "Object hashCode is :" + this.hashCode();
    }

    @Override
    protected BaseInfo_immutable clone() throws CloneNotSupportedException {
        return (BaseInfo_immutable) super.clone();
    }
}
