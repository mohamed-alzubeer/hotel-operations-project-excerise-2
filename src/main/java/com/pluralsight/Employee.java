package com.pluralsight;

import java.sql.SQLOutput;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;

    private double hoursWorked;

    private int startTime;

    private boolean checkedIn;

    //crate constructor

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.checkedIn = false;

    }

    //create the punchIn() method
    public void puchIn(int time) {
        if (checkedIn) {
            System.out.println("Employee is already punch in ");
        } else {
            startTime = time;
            checkedIn = true;

            System.out.println(name + " punched in at " + time + ":00");
        }


    }

    //crate punchedout() method
    public void puchOut(int time) {
        if (!checkedIn) {
            System.out.println(name + "must puch in first.");
            return;


        }
        //I want to make sure punch out time is not earlier than punch in time
        if (time < startTime) {
            System.out.println("punch out time can not be earkier than punch in time.");
            return;
        }
        //calculate the worked
        int shifHours = time - startTime;

        //add hours to total hours worked
        hoursWorked += shifHours;

        //employee is no clock in
        checkedIn = false;

        System.out.println(name + " work " + shifHours + " hours. ");
        System.out.println("Total hours worked: " + hoursWorked);

    }

    //create punchTimeCard() method
    public void punchTimeCard(int startTime) {
        if (checkedIn) {
            puchOut(startTime);
        } else {
            puchIn(startTime);
        }
    }

    @Override
    public String toString() {
        return "Employee Information" +
                "\n------------------------" +
                "\nEmployee ID: " + employeeId +
                "\nName: " + name +
                "\nDepartment: " + department +
                "\nPay Rate: $" + String.format("%.2f", payRate) +
                "\nHours Worked: " + hoursWorked +
                "\nStart Time: " + startTime + ":00" +
                "\nChecked In: " + checkedIn;
    }
}
