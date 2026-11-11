package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_test_the_room_occupied_or_directy(){
        //arrang- create a room object
        Room room1 = new Room(27, 2, 65);
        //act-check the quest
        room1.cleanRoom();
        assertFalse(room1.isDirty());
        room1.checkIn();

        //assert- verify the room is occupied or dirty
        assertTrue(room1.isOccupied());
        assertTrue(room1.isDirty());
        room1.checkOut();

        //assert- verify the room is occupied or dirty
        assertFalse(room1.isOccupied());
        assertTrue(room1.isDirty());
        room1.cleanRoom();
        assertFalse(room1.isDirty());

    }

}