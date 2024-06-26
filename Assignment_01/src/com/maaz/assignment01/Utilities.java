package com.maaz.assignment01;

public class Utilities {
    
   
    public static void increaseSalary(Employees employee, int percentage) {
        double currentSalary = employee.getSalary();
        double increment = currentSalary * (percentage / 100.0 ); // Use 100.0 to ensure division is double
        employee.setSalary(currentSalary + increment);
    }
}
