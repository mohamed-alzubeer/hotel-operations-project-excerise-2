package com.pluralsight;

public class Reservation {

    private String guestName;
    private String roomType;
    private int numberOfNights;
    private double nightlyRate;

    // Constructor
    public Reservation(String guestName, String roomType,
                       int numberOfNights, double nightlyRate) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.nightlyRate = nightlyRate;
    }

    // Calculate total cost
    public double getReservationTotal() {
        return numberOfNights * nightlyRate;
    }

    // Getters
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    @Override
    public String toString() {
        return "\n=== RESERVATION DETAILS ===" +
                "\nGuest Name: " + guestName +
                "\nRoom Type: " + roomType +
                "\nNumber of Nights: " + numberOfNights +
                "\nNightly Rate: $" + nightlyRate +
                "\nTotal Cost: $" + getReservationTotal();
    }
}