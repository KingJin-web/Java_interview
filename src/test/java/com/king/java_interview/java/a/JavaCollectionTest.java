package com.king.java_interview.java.a;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

//https://www.cnblogs.com/bingyimeiling/p/10255037.html
@SpringBootTest
public class JavaCollectionTest {

    public void testList() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();
    }

    public void testSet() {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();
        Set<SeasonEnum> set4 = EnumSet.noneOf(SeasonEnum.class);
    }
}