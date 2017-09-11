package com.odeanmaye.model;

import com.odeanmaye.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private Strategy strategy;

    private List<Card> hand;

    public Player (String name, Strategy strategy) {
        hand = new ArrayList<>();
        this.name = name;
        this.strategy = strategy;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void removeCardFromHand(Card card) {
        int index = hand.indexOf(card);

        if (index >= 0) {
            hand.remove(index);
        }
    }

    public Card play(List<Card> round) {
        return strategy.execute(this.hand, round);
    }

    public String toString() {
        return name + ":" + hand.toString();
    }
}
