package com.zun;

public class Main {

    public static void main(String[] args) {
        isPalindrome(getAllPalindromes());
        System.out.println("====================");
        isPalindrome(getAllNonPalidromes());
    }

    private static void isPalindrome(String[] arr){
        for(String i : arr) {
            String iLower = i.toLowerCase();

            StringBuilder input = new StringBuilder();
            input.append(iLower);

            String iReversed = input.reverse().toString();

            System.out.println(i + " is a Palindrome ?: " + iLower.equals(iReversed));
        }
    }

    private static String[] getAllPalindromes() {
        String[] arr = {"Anna",
                "Civic",
                "Kayak",
                "Level",
                "Madam",
                "Mom",
                "Noon",
                "Racecar"
        };

        return arr;
    }

    private static String[] getAllNonPalidromes() {
        String[] arr = {
                "scrape",
                "minimum",
                "circle",
                "eject",
                "glacier",
                "cover",
                "digital",
                "pull",
                "bark",
                "fair"
        };

        return arr;
    }

}
