package com.odeanmaye.model;

public enum Suit {

    SPADES ("Spades"),

    DIAMONDS ("Diamonds"),

    CLUBS ("Clubs"),

    HEARTS ("Hearts"),

    JOKER ("Joker");

    private String suit;

    Suit (String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
