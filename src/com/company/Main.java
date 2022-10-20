package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListResult = new ArrayList<>();
        for (int v : intList) {
            if (v > 0 && v % 2 == 0) intListResult.add(v);
        }
        for (int val : intListResult) {
            System.out.println(val);
        }
    }
}