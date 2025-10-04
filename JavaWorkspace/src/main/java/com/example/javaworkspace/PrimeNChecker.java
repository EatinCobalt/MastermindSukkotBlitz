package com.example.javaworkspace;

import java.util.Scanner;

public class PrimeNChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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