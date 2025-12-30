package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 5000);
        System.out.println(getName() + " (Mid) starts to working. Salary updated.");
    }
}