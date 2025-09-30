package com.example.javaworkspace;


public class Task4 {
    public static void main(String[] args) {
        //scanner doesnt work for some reason so number is entered here
        int n = 17;
        if (isPrime(n)) {
            System.out.println("number is prime");
        }
        else {
            System.out.println("number isnt prime");
        }
    }
    private static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        else if (number == 2 || number == 3) {
            return true;
        }
        else if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        else {
            for (int i = 5; i <= (int) Math.sqrt(number); i++) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}