package com.zun;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] strArr = {"1", "2", "3", "4", "5"};
        Integer[] intArr = {1,2,3,4,5};


        revArr(intArr);
        System.out.println("\n========");
        revArr(strArr);
    }

    private static void revArr(Object[] arr) {
        List<Object> arrList = Arrays.asList(arr);
        Collections.reverse(arrList);
        print(arrList.toArray());
   }

   private static void print(Object[] arr) {
       System.out.print("[");

       for(int i = 0; i < arr.length; i++){

           String item = arr[i].toString();

           if(arr[i] instanceof String) item = "'" + item + "'";

           System.out.print(i != arr.length - 1 ? " " +  item + "," : " " + item + " ");

       }

       System.out.print("]");
   }
}
