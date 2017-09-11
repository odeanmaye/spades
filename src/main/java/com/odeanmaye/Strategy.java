package com.odeanmaye;

import com.odeanmaye.model.Card;

import java.util.List;

public interface Strategy {
    Card execute(List<Card> hand, List<Card> round);
}
