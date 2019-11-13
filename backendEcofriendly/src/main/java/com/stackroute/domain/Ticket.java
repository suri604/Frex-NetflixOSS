package com.stackroute.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Ticket {
    @Id
    private int ticketNumber;
    private int price;
    private String date;
    private int distance;

    public Ticket(int ticketNumber, int price, String date, int distance) {
        this.ticketNumber = ticketNumber;
        this.price = price;
        this.date = date;
        this.distance = distance;
    }

    public Ticket() {
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber=" + ticketNumber +
                ", price=" + price +
                ", date=" + date +
                ", distance=" + distance +
                '}';
    }
}
