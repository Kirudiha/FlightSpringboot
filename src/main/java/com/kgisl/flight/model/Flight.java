package com.kgisl.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long flightId;
    @Column
    private String flightname;
    @Column
    private String source;
    @Column
    private String destination;
    @Column
    private String availability;
    @Column
    private double amount;
   
    public double getAmount() {
        return amount;
    }
    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }
    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }
   /**
    * @param destination the destination to set
    */
   public void setDestination(String destination) {
       this.destination = destination;
   }
    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }
    public String getAvailability() {
        return availability;
    }
    
   

    public Long getFlightId() {
        return flightId;
    }
   
    public String getFlightname() {
        return flightname;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
   
    public void setAvailability(String availability) {
        this.availability = availability;
    }
   
    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }
   
    public void setFlightName(String flightname) {
        this.flightname = flightname;
    }
    @Override
    public String toString() {
        return "["+flightId+" "+flightname+" "+source+" "+destination+" "+availability+" "+amount+"]";
    }
}