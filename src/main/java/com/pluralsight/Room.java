package com.pluralsight;

public class Room {
    //create room information
    private int roomNumber;
    private int numberOfBeds;
    private double price;

    //create room staus
    private boolean occupied;
    private boolean dirty;

    //create constructor
    public Room(int roomNumber, int numberOfBeds, double price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }



    //crate checkIn() method
    public void checkIn(){

        if(occupied){
            System.out.println("Room is occupied");
        }
        else if(dirty){
            System.out.println("The room is need to clean");
        }
        else{
            occupied = true;
            dirty =  true;

            System.out.println("The guest checked successfully");
        }
    }

    //create  checkOut () method
    public void checkOut(){
        if(occupied){
            occupied = false;
            dirty = true;
            System.out.println("Guest checked out successfully");
            System.out.println("The room needs to clean");


        }else {

            System.out.println("The room is already empty");
        }
    }

    //create a cleanRoom() method
    public void cleanRoom(){
        if(!occupied){
            dirty = false;
            System.out.println("Room has been cleaned");
        }else  {
            System.out.println("Can not clean occupied room");
        }
    }
// i create this methods because I will need it in Room test to know the room is occupied or dirty
    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }
}


