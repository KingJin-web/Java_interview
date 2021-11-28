package com.king.java_interview.java.a;

import lombok.Data;

/**
 * @program: java_interview
 * @description:
 * @author: King
 * @create: 2021-11-28 04:40
 */

public enum SeasonEnum {
    SPRING("春天"), SUMMER("夏天"), FALL("秋天"), WINTER("冬天");

    private final String name;

    private SeasonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
