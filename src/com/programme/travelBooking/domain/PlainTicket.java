package com.programme.travelBooking.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PlainTicket extends TravelTicket{
    private Integer travelClass;
    private Integer sealNumber;
    private Integer stopOvers;

    public PlainTicket(){
        super();
    }
    public PlainTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, Integer travelClass, Integer sealNumber, Integer stopOvers) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.sealNumber = sealNumber;
        this.stopOvers = stopOvers;
    }

    public Integer getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(Integer travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getSealNumber() {
        return sealNumber;
    }

    public void setSealNumber(Integer sealNumber) {
        this.sealNumber = sealNumber;
    }

    public Integer getStopOvers() {
        return stopOvers;
    }

    public void setStopOvers(Integer stopOvers) {
        this.stopOvers = stopOvers;
    }
    public void upgrade(){
        if(travelClass!=1){
            this.travelClass=1;
            System.out.println("Your travelClass is upgraded");
        }
        else{
            System.out.println("You are already in 1st travel class");
        }
    }
    public void addStopOver(){
        this.stopOvers++;
        System.out.println("You have"+stopOvers+"stop overs");
    }
}
