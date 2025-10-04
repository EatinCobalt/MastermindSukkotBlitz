package com.example.javaworkspace.payrollsim;
abstract class Employee implements IPayable {
    String name;
    String desc;
    double worked;
    double salary;
    enum Type {PART_TIME, FULL_TIME}
    void displayPay() {
        System.out.println("Pay = " + calcPay() + " shekels");
    }
    void displayDesc() {
        System.out.println(getDesc());
    }
}
