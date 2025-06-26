package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void minus(int first, int second) {
       int result = first - second;
        System.out.println(result);
    }

    public static void minus(int number) {
        int result = number - x;
        System.out.println(result);
    }

    public void divide(int number) {
        int result = number / x;
        System.out.println(result);
    }

    public void sumAllOperation(int number) {
        minus(number);
        divide(number);
    }

    public static void main(String[] args) {
        plus(1, 2);
       plus(10, 11);
       minus(7, 3);
       minus(2, 6);
       minus(12);
       Calculator calculator = new Calculator();
       calculator.divide(12);
       calculator.sumAllOperation(12);
   }
}


