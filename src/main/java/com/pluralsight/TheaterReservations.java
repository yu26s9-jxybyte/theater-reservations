package com.pluralsight;

import java.lang.classfile.instruction.LabelTarget;
import java.util.Scanner;

public class TheaterReservations {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is you full name?: ");
        String fullName = input.nextLine();
        fullName = fullName.trim();
        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.println("What is the date of your show?:  ");
        String dateInput = input.nextLine();
        String[] dateParts = dateInput.split("/");

        String month = dateParts[0];
        String day = dateParts[1];
        String year = dateParts[2];

        String formattedDate = dateParts[0] + "/" + dateParts[1] + "/" + dateParts[2];


        System.out.println("What is the number of tickets you'd like?: ");
        int tickets = input.nextInt();

        String ticketType;
        if (tickets == 1){
            ticketType = "ticket";
        } else {
            ticketType = "tickets";
        }

        System.out.println(tickets + " " + ticketType + " booked for " + formattedDate + " under the name " + firstName + " " + lastName);
    }
}
