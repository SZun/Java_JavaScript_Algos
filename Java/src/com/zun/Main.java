package com.zun;

public class Main {

    public static void main(String[] args) {
        String[] arr1 = {"Google", "Apple", "Microsoft"};
        String[] arr2 = {"Leonardo", "Michelangelo", "Raphael", "Donatello"};
        String[] arr3 = {"Turing", "Einstein", "Jung"};

        print(bubbleSort(arr1));
        print(bubbleSort(arr2));
        print(bubbleSort(arr3));
    }

    private static String[] bubbleSort(String[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    private static void print(String[] arr) {

        System.out.print("[");

        for(String i : arr){
            System.out.print(" '" + i + "', ");
        }

        System.out.print("]\n");
    }

}
