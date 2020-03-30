package com.company;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryInTotal;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryInTotal = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalaryInTotal() {
        return salaryInTotal;
    }

    public void setSalaryInTotal(int salaryInTotal) {
        this.salaryInTotal = salaryInTotal;
    }

    public void recivedSalary(int salary) {
        salaryInTotal += salary;
        School.updateTotalMoneySpent(salaryInTotal);
    }

    @Override
    public String toString() {
        return "I am a teacher, my name is " + name + '\'' +
                ", i earn " + salary + "\n";
    }
}
