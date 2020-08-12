package com.zun;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator(10,5);

        System.out.println(calc.add());
        System.out.println(calc.subtract());
        System.out.println(calc.multiply());
        System.out.println(calc.divide());
    }

    public static class Calculator {

        private final int num1;
        private final int num2;

        public Calculator(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public int add(){
            return num1 + num2;
        }

        public int subtract(){
            return num1 - num2;
        }

        public int multiply(){
            return num1 * num2;
        }

        public int divide(){
            return num1 / num2;
        }
    }

}
