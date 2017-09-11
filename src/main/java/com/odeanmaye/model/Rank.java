package com.odeanmaye.model;

public enum Rank {

    BIG ("Big"),

    LITTLE ("Little"),

    ACE("ACE"),

    KING("KING"),

    QUEEN("QUEEN"),

    JACK("JACK"),

    TEN ("10"),

    NINE ("9"),

    EIGHT ("8"),

    SEVEN ("7"),

    SIX ("6"),

    FIVE ("5"),

    FOUR ("4"),

    THREE ("3"),

    TWO ("2");

    private String rank;

    Rank (String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
