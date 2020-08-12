package com.zun;

public class Main {

    public static void main(String[] args) {
        System.out.println(XO("ooxx"));
        System.out.println(XO("xooxx"));
        System.out.println(XO("ooxXm"));
        System.out.println(XO("zpzpzpp"));
        System.out.println(XO("zzoo"));
    }

    private static boolean XO(String str) {
        int xCount = 0;
        int oCount = 0;

        char[] strArr = str.toCharArray();

        for(char i : strArr){
            if(Character.toLowerCase(i) == 'x') xCount++;
            if(Character.toLowerCase(i) == 'o') oCount++;
        }

        return xCount == oCount;
    }
}
