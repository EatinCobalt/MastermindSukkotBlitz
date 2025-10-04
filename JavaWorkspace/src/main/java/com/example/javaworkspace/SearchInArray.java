package com.example.javaworkspace;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        String[] words = {
                "robot", "motor", "gamepad", "field", "artifact", "limelight"
        };
        System.out.println("enter a word to check if its in the array. context: ftc, example: robot");
        Scanner sc = new Scanner(System.in);
        String search;
        while (true) {
            search = sc.next();
            if (Arrays.asList(words).contains(search)) {
                System.out.println("word " + search + " is in the array");
            }
            else {
                System.out.println("word " + search + " is NOT in the array");
            }
        }
    }
}
