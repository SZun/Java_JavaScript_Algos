package com.zun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 6, 3, 23, 17));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 10, 20, 42));


        print(standInLine(list1, 1));
        print(standInLine(list2, 10));
        print(standInLine(list3, 6));
        print(standInLine(new ArrayList<>(), 6));
    }

    private static List<Integer> standInLine(List<Integer> list, Integer finalItem)  {

        list.add(finalItem);
        list.remove(0);

        return list;
    }

    private static void print(List<Integer> list){
        if(!list.isEmpty()){
            System.out.print("[");

            list.forEach(i -> System.out.print(" " +  i + ", "));

            System.out.print("]\n");
        } else {
            System.out.println("No list has been selected");
        }

    }
}
