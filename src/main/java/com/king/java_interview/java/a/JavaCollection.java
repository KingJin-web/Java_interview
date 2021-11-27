package com.king.java_interview.java.a;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @program: java_interview
 * @description:
 * @author: King
 * @create: 2021-11-28 03:19
 */
@Data
public class JavaCollection {
    private List<?> list;
    private Set<?> set;
    private Queue<?> queue;
    private Map<?, ?> map;
}
