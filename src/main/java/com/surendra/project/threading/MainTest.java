package com.surendra.project.threading;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 10 , 20);

        List<Integer> lists = list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(lists);
    }
}
