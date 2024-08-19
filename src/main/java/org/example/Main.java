package org.example;

public class Main {
    public static void main(String[] args) {}
    //sum of two integers
    public static int add(int a, int b) {
        return a + b;
    }
    //is the given number even?
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    //product out of two integers
    public static int product(int a, int b) {
        return a * b;
    }
    //converts a given string to uppercase
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }
    //is the given number positive?
    public static boolean checkIfPositive(int number) {
        return number > 0;
    }
}
