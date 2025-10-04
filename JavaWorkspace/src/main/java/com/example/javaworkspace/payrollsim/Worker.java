package com.example.javaworkspace.payrollsim;
public class Worker extends Employee{
    Type type;
    public Worker (String name, Type type, String description, double worked, double salary) {
        this.name = name;
        this.desc = description;
        this.worked = worked;
        this.salary = salary;
        this.type = type;
    }
    void promote() {
        if (type == Type.PART_TIME) {
            type = Type.FULL_TIME;
            worked = 1;
            salary *= 230;
            System.out.println(name + " was just promoted");
        }
    }
    @Override
    public String getDesc() {
        String currentType;
        if (type.name().equals("FULL_TIME")) {
            currentType = "full time";
        }
        else {currentType = "part time";}
        return name + ", " + currentType + ", " + desc;
    }
    @Override
    public double calcPay() {
        return worked * salary;
    }
}
