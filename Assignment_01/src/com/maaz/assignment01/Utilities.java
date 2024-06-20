package com.maaz.assignment01;

public class Utilities {
    
    /**
     * Increases the salary of an employee by a specified percentage.
     * @param employee The employee whose salary needs to be increased.
     * @param percentage The percentage by which to increase the salary.
     */
    public static void increaseSalary(Employees employee, int percentage) {
        double currentSalary = employee.getSalary();
        double increment = currentSalary * (percentage / 100.0); // Use 100.0 to ensure division is double
        employee.setSalary(currentSalary + increment);
    }
}
