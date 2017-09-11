package com.odeanmaye.model;

public class Card {

    private Suit suit;

    private Rank rank;

    public Card (Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String toString() {
        return this.suit + ":" + this.rank;
    }

    public boolean equals(Object obj) {
        Card that = (Card) obj;

        return (that.suit == this.suit && that.rank == this.rank);
    }
}
