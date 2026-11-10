package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {
        //crate a room
        Room room1 = new Room(27, 2, 65);
        //create check in
        room1.checkIn();
        //crate check out
        room1.checkOut();
        //housekeeper cleans the room
        room1.cleanRoom();
        //I can crate other guest check in
        room1.checkIn();
        //create employee object
        Employee employee1 = new Employee(4254, "Mohamed", "IT deparment", 400);
        //first call: pinch in at 10 AM
        employee1.punchTimeCard(10);
        //second call: pinch out at 6 PM
        employee1.punchTimeCard(18);

        //display the employee information
        System.out.println(employee1);

        System.out.println("============Thank You for using the hotel app================");


    }
}
