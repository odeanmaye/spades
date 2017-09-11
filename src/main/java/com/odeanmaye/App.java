package com.odeanmaye;

import com.odeanmaye.model.Card;
import com.odeanmaye.model.Player;
import com.odeanmaye.model.Rank;
import com.odeanmaye.model.Suit;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static final int CARD_DECK_SIZE = 52;

    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>(CARD_DECK_SIZE);

        deck.add(new Card(Suit.SPADES, Rank.ACE));
        deck.add(new Card(Suit.SPADES, Rank.TWO));
        deck.add(new Card(Suit.SPADES, Rank.THREE));
        deck.add(new Card(Suit.SPADES, Rank.FOUR));
        deck.add(new Card(Suit.SPADES, Rank.FIVE));
        deck.add(new Card(Suit.SPADES, Rank.SIX));
        deck.add(new Card(Suit.SPADES, Rank.SEVEN));
        deck.add(new Card(Suit.SPADES, Rank.EIGHT));
        deck.add(new Card(Suit.SPADES, Rank.NINE));
        deck.add(new Card(Suit.SPADES, Rank.TEN));
        deck.add(new Card(Suit.SPADES, Rank.JACK));
        deck.add(new Card(Suit.SPADES, Rank.QUEEN));
        deck.add(new Card(Suit.SPADES, Rank.KING));

        deck.add(new Card(Suit.DIAMONDS, Rank.ACE));
        deck.add(new Card(Suit.DIAMONDS, Rank.THREE));
        deck.add(new Card(Suit.DIAMONDS, Rank.FOUR));
        deck.add(new Card(Suit.DIAMONDS, Rank.FIVE));
        deck.add(new Card(Suit.DIAMONDS, Rank.SIX));
        deck.add(new Card(Suit.DIAMONDS, Rank.SEVEN));
        deck.add(new Card(Suit.DIAMONDS, Rank.EIGHT));
        deck.add(new Card(Suit.DIAMONDS, Rank.NINE));
        deck.add(new Card(Suit.DIAMONDS, Rank.TEN));
        deck.add(new Card(Suit.DIAMONDS, Rank.JACK));
        deck.add(new Card(Suit.DIAMONDS, Rank.QUEEN));
        deck.add(new Card(Suit.DIAMONDS, Rank.KING));

        deck.add(new Card(Suit.HEARTS, Rank.ACE));
        deck.add(new Card(Suit.HEARTS, Rank.TWO));
        deck.add(new Card(Suit.HEARTS, Rank.THREE));
        deck.add(new Card(Suit.HEARTS, Rank.FOUR));
        deck.add(new Card(Suit.HEARTS, Rank.FIVE));
        deck.add(new Card(Suit.HEARTS, Rank.SIX));
        deck.add(new Card(Suit.HEARTS, Rank.SEVEN));
        deck.add(new Card(Suit.HEARTS, Rank.EIGHT));
        deck.add(new Card(Suit.HEARTS, Rank.NINE));
        deck.add(new Card(Suit.HEARTS, Rank.TEN));
        deck.add(new Card(Suit.HEARTS, Rank.JACK));
        deck.add(new Card(Suit.HEARTS, Rank.QUEEN));
        deck.add(new Card(Suit.HEARTS, Rank.KING));

        deck.add(new Card(Suit.CLUBS, Rank.ACE));
        deck.add(new Card(Suit.CLUBS, Rank.THREE));
        deck.add(new Card(Suit.CLUBS, Rank.FOUR));
        deck.add(new Card(Suit.CLUBS, Rank.FIVE));
        deck.add(new Card(Suit.CLUBS, Rank.SIX));
        deck.add(new Card(Suit.CLUBS, Rank.SEVEN));
        deck.add(new Card(Suit.CLUBS, Rank.EIGHT));
        deck.add(new Card(Suit.CLUBS, Rank.NINE));
        deck.add(new Card(Suit.CLUBS, Rank.TEN));
        deck.add(new Card(Suit.CLUBS, Rank.JACK));
        deck.add(new Card(Suit.CLUBS, Rank.QUEEN));
        deck.add(new Card(Suit.CLUBS, Rank.KING));

        deck.add(new Card(Suit.JOKER, Rank.BIG));
        deck.add(new Card(Suit.JOKER, Rank.LITTLE));

        List<Player> players = new ArrayList<>();
        players.add(new Player("Dean", new SimpleStrategy()));
        players.add(new Player("Tasha", new SimpleStrategy()));
        players.add(new Player("Genelle", new SimpleStrategy()));
        players.add(new Player("George", new SimpleStrategy()));

        players = Dealer.deal(Dealer.shuffle(deck), players);

        System.out.println(players.get(0));
        System.out.println(players.get(1));
        System.out.println(players.get(2));
        System.out.println(players.get(3));

        List<List<Card>> rounds = new ArrayList<>();

        for (int i=0; i<13; i++) {
            List<Card> round = new ArrayList<>();
            for (Player player: players) {
                Card card = player.play(round);
                player.removeCardFromHand(card);
                round.add(card);
            }
            rounds.add(round);
            System.out.println(round);
        }

        System.out.println(players.get(0));
        System.out.println(players.get(1));
        System.out.println(players.get(2));
        System.out.println(players.get(3));

    }
}
