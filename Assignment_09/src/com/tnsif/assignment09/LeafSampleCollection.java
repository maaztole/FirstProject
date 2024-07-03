package com.tnsif.assignment09;

import java.util.Scanner;

public class LeafSampleCollection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSamplesCollected = 0;
        int rounds = 0;

        while (totalSamplesCollected < 30) {
            System.out.print("The leaf samples collected in Round " + (rounds + 1 ) + ": ");
            int samplesInRound = scanner.nextInt();
            totalSamplesCollected += samplesInRound;
            rounds++;
        }

        System.out.println("\nAsif collected a total of " + totalSamplesCollected + " leaf samples.");
        System.out.println("He took " + rounds + " rounds around the park to collect these samples.");

        scanner.close();
    }
}
