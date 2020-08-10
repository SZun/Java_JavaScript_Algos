package com.zun;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z"};
        System.out.println(getMapp(arr).toString());
    }

    private static Map<String,String> getMapp(String[] arr) {
        Map<String,String> toReturn = new HashMap<>();

        for(String i : arr){
            toReturn.put(i, i.toUpperCase());
        }

        return toReturn;
    }
}
