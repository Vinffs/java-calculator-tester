package org.learning.calculator;

public class Ticket {

    private final int age;
    private final int km;

    public Ticket(int km, int age) throws IllegalArgumentException {
        if(km <= 0 || age <= 0) {
            throw new IllegalArgumentException("Km or Age must be > 0");
        }

        this.km = km;
        this.age = age;
    }

    public double calculateTicketPrice() {
        double ticketPrice = km * 0.21;

        if (age < 18) {
            return ticketPrice * 0.8;
        } else if (age >= 65 ) {
            return ticketPrice * 0.60;
        } else {
            return ticketPrice;
        }
    }
}
