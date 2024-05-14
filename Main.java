package com.assignment.abhi;

class Employee {
    double salary;
    int hoursPerDay;

    public void getInfo(double salary, int hoursPerDay) {
        this.salary = salary;
        this.hoursPerDay = hoursPerDay;
    }

    public void addSal() {
        if (salary < 1500) {
            salary += 1000;
        }
    }

    public void addWork() {
        if (hoursPerDay > 6) {
            salary += 500;
        }
    }

    public void printFinalSalary() {
        System.out.println("Final Salary of Employee " + this.salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.getInfo(1400, 9);
        em.addSal();
        em.addWork();
        em.printFinalSalary();
    }
}
