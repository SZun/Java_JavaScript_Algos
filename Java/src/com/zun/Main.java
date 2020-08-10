package com.zun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(findNumVowels("hello"));
        System.out.println(findNumVowels("why"));
    }

    private static int findNumVowels(String str) {
        int count = 0;
        List<Character> arr = Arrays.asList('a', 'e', 'i', 'o', 'u');

        char[] chars = str.toCharArray();

        for(char i : chars) {
            count = arr.contains(i) ? count + 1 : count;
        }

        return count;
    }

}
