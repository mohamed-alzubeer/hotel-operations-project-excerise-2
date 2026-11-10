package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {

        // Create a room object
        Room room1 = new Room(27, 2, 65);

        room1.checkIn(); // I am checks the guest in of room
        room1.checkOut();// I am cheks the guest out of room
        room1.cleanRoom();// clean the room
        room1.checkIn(); // allow for new guest to check into the cleaned room

        // Create employee object
        Employee employee1 = new Employee(4254, "Mohamed", "IT Department", 400);

        employee1.punchTimeCard(10); // employee punches in at 10:00
        employee1.punchTimeCard(18);// punched out in 18:00(6PM)
         //call the employee
        System.out.println(employee1);

        // Create hotel object name
        Hotel hotel = new Hotel("Bilal Hotel", 5, 20);
        //display the information
        System.out.println("\n=== HOTEL INFORMATION ===");
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());

        boolean bookedSuite = hotel.bookRoom(2, true);
        System.out.println("Suite Booking Successful: " + bookedSuite);

        boolean bookedRoom = hotel.bookRoom(3, false);
        System.out.println("Basic Room Booking Successful: " + bookedRoom);

        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());

        System.out.println("\n============ Thank You for using the Hotel App ============");
    }
}