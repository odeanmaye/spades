package com.odeanmaye;

import com.odeanmaye.model.Card;
import com.odeanmaye.model.Player;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Dealer {
    
    public static List<Card> shuffle(List<Card> deck) {

        List<Card> shuffledDeck = new ArrayList<>();

        while(deck.size() > 0) {
            Random random = new Random();
            int index = random.nextInt(deck.size());

            shuffledDeck.add(deck.get(index));
            deck.remove(deck.get(index));
        }
        return shuffledDeck;
    }

    public static List<Player> deal(List<Card> deck, List<Player> players) {

        Iterator<Card> iterator = deck.iterator();

        while(iterator.hasNext()) {
            for(Player player: players) {
                player.addCardToHand(iterator.next());
            }
        }

        return players;
    }
}
