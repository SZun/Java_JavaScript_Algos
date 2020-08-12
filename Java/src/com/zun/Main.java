package com.zun;

public class Main {

    public static void main(String[] args) {

        double[] arr = {2, 100, 0, 0};
        double[] arr2 = {0, 0, 20, 5};
        double[] arr3 = {30, 40, 20, 5};
        double[] arr4 = {10, 0, 0, 50};
        double[] arr5 = {1, 0, 5, 219};

        String prompt = "I have enough change?: ";
        System.out.println(prompt + isEnoughChange(arr, 14.11));
        System.out.println(prompt + isEnoughChange(arr2, 0.75));
        System.out.println(prompt + isEnoughChange(arr3, 12.55));
        System.out.println(prompt + isEnoughChange(arr4, 3.85));
        System.out.println(prompt + isEnoughChange(arr5, 19.99));

    }

    private static boolean isEnoughChange(double[] arr, double price){
        double total = (arr[0] * 0.25) + (arr[1] * 0.10) + (arr[2] * 0.05) + (arr[3] * 0.01);
        return total >= price;
    }
}
