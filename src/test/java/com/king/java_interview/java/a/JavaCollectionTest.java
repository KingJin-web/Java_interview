package com.king.java_interview.java.a;

import org.junit.jupiter.api.Test;
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

    @Test
    public void Test1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //第一种遍历方法使用 For-Each 遍历 List
        for (Integer str : list) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
            System.out.println(str);
        }
        list.forEach(System.out::println);

        //第二种遍历，把链表变为数组相关的内容进行遍历
        Integer[] strArray = new Integer[list.size()];
        list.toArray(strArray);

        for (Integer s : strArray) { //这里也可以改写为      for(int i=0;i<strArray.length;i++) 这种形式
            System.out.println(s);
        }

        //第三种遍历 使用迭代器进行相关遍历
        Iterator<Integer> ite = list.iterator();
        while (ite.hasNext()) {//判断下一个元素之后有值
            System.out.println(ite.next());
        }

    }

    @Test
    public void test2(){

    }
}