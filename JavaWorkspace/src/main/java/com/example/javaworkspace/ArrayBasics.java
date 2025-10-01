package com.example.javaworkspace;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 11};
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println(nums[i]);
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
