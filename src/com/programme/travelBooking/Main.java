package com.programme.travelBooking;

import com.programme.travelBooking.domain.BusTicket;
import com.programme.travelBooking.domain.TrainTicket;
import com.programme.travelBooking.domain.TravelTicket;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TrainTicket trainTicket = new TrainTicket();
        trainTicket.cancel();

        TrainTicket trainTicket1 = new TrainTicket(121L, "Jasidih", "Patna", new BigDecimal("670"),
                LocalDateTime.of(2022, 2, 10, 16, 2, 54),
                LocalDateTime.of(2022, 2, 10, 21, 2, 33),
                2, 32, 45);
        System.out.println(trainTicket1.getDepartureTime());
        String[] providers={"Ashirwad Travels","Bengal Tiger"};
        BusTicket busTicket = new BusTicket(122L, "Godda", "Patna", new BigDecimal("550"),
                LocalDateTime.of(2022, 12, 21, 10, 20, 10),
                LocalDateTime.of(2022, 2, 11, 20, 3, 11),providers
                );
        System.out.println(busTicket.getDepartureTime());
        busTicket.cancel();
    }
}