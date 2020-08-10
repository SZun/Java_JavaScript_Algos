package com.zun;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        fizzBuzz(getArr());
    }

    private static void fizzBuzz(List<Integer> arr) {
        arr.forEach(i -> {
                if(i % 5 == 0 && i % 3 == 0) System.out.println("fizzbuzz");
                else if(i % 5 == 0) System.out.println("fizz");
                else if(i % 3 == 0) System.out.println("buzz");
                else System.out.println(i);
        });
    }

    private static List<Integer> getArr() {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i < 31; i++){
            arr.add(i);
        }
        return arr;
    }
}
