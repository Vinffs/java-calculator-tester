package org.learning.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    private static Ticket ticket;

    @BeforeAll
    @DisplayName("Ticket Initialization")
    static void init() {
        ticket = new Ticket(100,25);
    }

    @Test
    @DisplayName("Adult ticket")
    void calculateAdultPrice() {
        assertEquals(21.00, ticket.calculateTicketPrice(), 0.001);
    }

    @Test
    @DisplayName("Minor ticket")
    void calculateMinorTicket() {
        Ticket minor = new Ticket(100,17);
        assertEquals(16.80, minor.calculateTicketPrice(), 0.001);
    }

    @Test
    @DisplayName("Senior ticket")
    void calculateSeniorTicket() {
        Ticket senior = new Ticket(100,65);
        assertEquals(12.60, senior.calculateTicketPrice(), 0.001);
    }

    @Test
    @DisplayName("Testing Exceptions")
    void verifyExceptions() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, -25));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-100, 25));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-100, -25));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 25));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(25, 0));
        assertThrows(IllegalArgumentException.class, () -> new Ticket(0, 0));
    }
}