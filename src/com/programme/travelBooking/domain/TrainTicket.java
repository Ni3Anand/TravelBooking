package com.programme.travelBooking.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TrainTicket extends TravelTicket{
    private Integer travelClass;
    private Integer carriageNumber;
    private Integer sealNumber;

    public TrainTicket(){
        super();
    }
    public TrainTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime, LocalDateTime arrivalTime, Integer travelClass, Integer carriageNumber, Integer sealNumber) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.carriageNumber = carriageNumber;
        this.sealNumber = sealNumber;
    }

    public Integer getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(Integer travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(Integer carriageNumber) {
        this.carriageNumber = carriageNumber;
    }

    public Integer getSealNumber() {
        return sealNumber;
    }

    public void setSealNumber(Integer sealNumber) {
        this.sealNumber = sealNumber;
    }

    public void upgrade(){
        if(this.travelClass!=1){
            this.travelClass=1;
            System.out.println("Your Travel class is upgraded to 1st class");
        }
        else{
            System.out.println("You are already in 1st class");
        }
    }

}
