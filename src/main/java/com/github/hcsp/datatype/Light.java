package com.github.hcsp.datatype;

import java.util.Objects;

public class Light {         //light类
    // 一盏灯可能有三种状态：
    // 亮 -> true
    // 灭 -> off
    // 未知 -> null
    Boolean on;      //light的成员变量on是布尔值类型

    public Light(Boolean on) {     //构造器
        this.on = on;
    }

    // 当灯亮时返回true，灭和未知状态返回false
    public boolean isOn() {
        return Boolean.TRUE.equals(on);
    }


    public Boolean isOnRawValue() {

        return null;
    }
}
