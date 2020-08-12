package com.zun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4};
        Integer[] ints2 = {1, 4, 4, 4, 4, 4, 3, 2, 1, 2};
        Integer[] ints3 = {6, 7, 3, 2, 1};

        print(uniqueSort(ints));
        print(uniqueSort(ints2));
        print(uniqueSort(ints3));
    }

    private static Object[] uniqueSort(Integer[] arr){

        return new ArrayList<Integer>(
                                        new HashSet<>(
                                                Arrays.asList(arr)
                                        )
                                      ).toArray();
    }

    private static void print(Object[] arr) {
        System.out.print("[");

        for(Object i : arr){
            System.out.print(" " + i.toString() + ", ");
        }

        System.out.print("]\n");
    }
}
