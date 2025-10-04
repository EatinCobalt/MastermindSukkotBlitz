package com.example.javaworkspace.payrollsim;
public class Manager extends Employee {
    double bonus;
    public Manager (String name, String description, double worked, double salary, double bonus) {
        this.name = name;
        this.desc = description;
        this.worked = worked;
        this.salary = salary;
        this.bonus= bonus;
    }
    @Override
    public String getDesc() {
        return name + ", full time, " + desc;
    }
    @Override
    public double calcPay() {
        return worked * salary + bonus;
    }
}
