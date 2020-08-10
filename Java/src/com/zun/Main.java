package com.zun;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        System.out.println(addTheIndex(arr));
    }

    private static List<Integer> addTheIndex(List<Integer> arr) {

        for(int i = 0; i < arr.size(); i++){
            arr.set(i, arr.get(i) + i);
        }

        return arr;
    }
}
