package com.example.javaworkspace;
public class StudentGrades {
    public static void main(String[] args) {
        int[] andrew = {80, 95, 67, 100, 82, 89};
        int[] james = {66, 58, 67, 70, 60};
        int[] emily = {88, 92, 79, 95};
        int[] michael = {72, 85, 91, 68, 77};
        int[] sophia = {96, 99};
        int[] daniel = {63, 75, 80, 71};
        System.out.println(average(andrew));
        System.out.println(average(james));
        System.out.println(average(emily));
        System.out.println(average(michael));
        System.out.println(average(sophia));
        System.out.println(average(daniel));
    }
    public static int average(int[] grades) {
        int sum = 0;
        for (int i = grades.length - 1; i >= 0; i--) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
}