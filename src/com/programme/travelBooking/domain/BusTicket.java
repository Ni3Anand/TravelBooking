package com.programme.travelBooking.domain;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class BusTicket extends TravelTicket {
    private String[] permittedProviders;

    public BusTicket(){
        super();
    }


    public BusTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, String[] permittedProviders) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.permittedProviders = permittedProviders;
    }

    public String[] getPermittedProviders() {
        return permittedProviders;
    }

    public void setPermittedProviders(String[] permittedProviders) {
        this.permittedProviders = permittedProviders;
    }

    @Override
    public void cancel() {
        Duration duration = Duration.between(LocalDateTime.now(),getDepartureTime());
        Long days = duration.toDays();
        if(days>30L){
            super.cancel();
        }
        else{
            System.out.println("Your ticket can't be cancelled.");
        }
    }



}
