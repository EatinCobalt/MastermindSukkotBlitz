package com.example.javaworkspace.payrollsim;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Worker jack = new Worker(
                "Jack", Employee.Type.PART_TIME, "loader, healthy and strong",
                4, 35
        );
        Worker lucy = new Worker(
                "Lucy", Employee.Type.FULL_TIME, "cashier, sometimes mean to clients",
                1, 7000
        );
        Worker paul = new Worker(
                "Paul", Employee.Type.PART_TIME, "cleaner, nothing special",
                6, 30
        );
        Manager eve = new Manager(
                "Eve", "supply manager, very efficient",
                1, 14000, 2000
        );
        Employee[] employees = {jack, lucy, paul, eve};
        output(employees);
        separate();
        jack.promote();
        jack.displayDesc();
        jack.displayPay();
        separate();
        Arrays.sort(employees, Comparator.comparingDouble(Employee::calcPay));
        output(employees);
    }
    static void separate() {
        for (int i = 0; i < 3; i++) {
            System.out.println(".");
        }
    }
    static void output(Employee[] array) {
        for (Employee currentEmp : array) {
            currentEmp.displayDesc();
            currentEmp.displayPay();
        }
    }
}
