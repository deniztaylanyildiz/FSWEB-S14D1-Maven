package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(int id, String name, double salary) {
        super(id, name, salary);

        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        setSalary(getSalary() + 5000);
        System.out.println("HRManager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper dev) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = dev;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper dev) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = dev;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper dev) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = dev;
            } else {
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }
}