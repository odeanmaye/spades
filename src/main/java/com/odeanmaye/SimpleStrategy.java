package com.odeanmaye;

import com.odeanmaye.model.Card;
import com.odeanmaye.model.Rank;

import java.util.List;

public class SimpleStrategy implements Strategy {

    @Override
    public Card execute(List<Card> hand, List<Card> round) {
        Rank currentRank = round.get(0).getRank();
        Card bestPlay = null;

        for(Card card: hand) {
            if (card.getRank() == currentRank) {

            }
        }
        return hand.get(0);


    }
}
