package com.zun;

public class Main {

    public static void main(String[] args) {
        String str = "banan";
        char[] strArr = str.toCharArray();
        String x = String.valueOf(strArr[0]) + String.valueOf(strArr[1]) + "..";
        System.out.println(x);
        System.out.println(x);
        System.out.println(str);
    }
}
