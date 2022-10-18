package com.programme.travelBooking;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

public class RegisterEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("For Booking Type Press 1 --> BusTicket, Press 2 --> TrainTicket, Press 3 --> PlainTicket ");
        Integer num=scanner.nextInt();

        System.out.println("Type Booking Reference");
        Long bookingRef=scanner.nextLong(); 
        scanner.nextLine();

        System.out.println("Type the Pickup Station");
        String origin=scanner.nextLine();

        System.out.println("Type the destination");
        String destination=scanner.nextLine();

        System.out.println("Type the Price");
        BigDecimal price=scanner.nextBigDecimal();
        scanner.nextLine();

        System.out.println("Type the Departure Time");
        String dTime=scanner.nextLine();

        System.out.println("Type the arrival time");
        String aTime=scanner.nextLine();


    }
}
