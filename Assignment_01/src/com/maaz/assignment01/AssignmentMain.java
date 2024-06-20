package com.maaz.assignment01;

public class AssignmentMain {

    public static void main(String[] args) {
        // Creating an instance of an Employee (e.g., Developer)
        Employees employee = new Employees("Maaz", 1001, 500000);

        // Output current details
        System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.getSalary());

        // Using the Utilities class to increase the salary by 10%
        Utilities.increaseSalary(employee, 10); // Pass int for percentage

        // Output updated details
        System.out.println("Updated Salary: " + employee.getSalary());
    }
}

