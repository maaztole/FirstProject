package com.tnsif.assignment04;

public class movie {
    // Static variable to keep track of available seats
    private static int seats = 100;

    // Instance variables
    private String movieName;
    private String showTime;
    private String personName;

    // Constructor to book a seat and initialize the instance variables
    public movie(String movieName, String showTime, String personName) {
        if (seats > 0) {
            this.movieName = movieName;
            this.showTime = showTime;
            this.personName = personName;
            seats--;
            System.out.println("Seat booked successfully for " + personName);
        } else {
            System.out.println("Sorry, no seats available for " + personName);
        }
    }

    // Getter methods
    public String getMovieName() {
        return movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public String getPersonName() {
        return personName;
    }

    // Static method to get the remaining seats
    public static int getRemainingSeats() {
        return seats;
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        movie movie1 = new movie("Inception", "7:00 PM", "Maaz");
        movie movie2 = new movie("Inception", "7:00 PM", "Kaif");
        movie movie3 = new movie("Inception", "7:00 PM", "Irfan");

        System.out.println("Remaining seats: " + movie.getRemainingSeats());

        movie movie4 = new movie("Inception", "7:00 PM", "Adnan");
        System.out.println("Remaining seats: " + movie.getRemainingSeats());
    }
}