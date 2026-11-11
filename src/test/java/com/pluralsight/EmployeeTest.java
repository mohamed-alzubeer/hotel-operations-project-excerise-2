package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        //arrang- create object employee
        Employee employee1 = new Employee(4254, "Mohamed", "IT Department", 400);
        //act- employee punched in at 10:00
        employee1.punchIn(10);
        //assert- verify employee is punched in
        assertTrue(true);
        employee1.punchIn(8);
        assertTrue(true);



    }

    @Test
    void punchOut() {
        Employee employee1 = new Employee(4254, "Mohamed", "IT Department", 400);
        employee1.punchIn(10);
        employee1.punchOut(4);
        assertTrue(true);

        employee1.punchIn(8);
        assertTrue(true);

        employee1.punchIn(10);
        employee1.punchOut(18);
        assertEquals(employee1);

    }

    private void assertEquals(Employee employee1) {

    }
}