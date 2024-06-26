package com.maaz.assignment02;

import java.util.Scanner;

public class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        this.phone = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        this.salesAmount = scanner.nextDouble();
        scanner.close();
    }

    public void calculateCommission() {
        double commissionRate = 0;

        if (salesAmount >= 100000) {
            commissionRate = 0.10; // 10%
        } else if (salesAmount >= 50000) {
            commissionRate = 0.05; // 5%
        } else if (salesAmount >= 30000) {
            commissionRate = 0.03; // 3%
        } else {
            commissionRate = 0; // No commission
        }

        double commission = salesAmount * commissionRate;
        System.out.println("Commission: " + commission);
    }

    public static void main(String[] args) {
        Commission salesPerson = new Commission();
        salesPerson.acceptDetails();
        salesPerson.calculateCommission();
    }
}