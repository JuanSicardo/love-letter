package Deck;

import Card.Card;
import org.apache.commons.lang3.tuple.Pair;

interface Deck {
    Card[] toCardArray();

    Deck copy();

    //Get cards without taking them out of the deck
    Card getTopCard() throws EmptyDeckException;

    Card getBottomCard() throws EmptyDeckException;

    Card getCardAt(int index);

    Card getRandomCard() throws EmptyDeckException;

    Card[] getNCards(int offset, int numberOfCards);

    Card[] getNRandomCards(int numberOfCards);

    //Take cards from the deck and look at them
    Card takeTopCard();

    Card takeBottomCard();

    Card takeCardAt(int index);

    Card takeRandomCard();

    Deck takeNCards(int offset, int numberOfCards);

    Deck takeNRandomCards(int numberOfCards);

    Deck putCardOnTop();

    Deck putCardBellowBottom();

    Deck putCard(int cardIndex);

    Deck putCardRandomly();

    Deck putNCardsOnTop(Card[] cards);

    Deck putNCardsOnTheBottom(Card[] cards);

    Deck putNCardsAt(int index, Card[] cards);

    Deck putNCardsRandomly(Card[] cards);

    Deck putDeckOnTop(Deck deck);

    Deck putDeckOnTheBottom(Deck deck);

    Deck mergeDeckAt(int index, Deck deck);

    Deck mergeDeckRandomly(Deck deck);

    Deck removeTopCard();

    Deck removeBottomCard();

    Deck removeCardAt(int index);

    Deck removeRandomCard();

    Deck removeNCards(int offset, int numberOfCards);

    Deck removeNCardsRandomly(int numberOfCards);

    //Reveal the top card and then put it in a random place in the deck.
    Card burnCard();

    Card burnNCards(int numberOfCards);

    //Reveal the top card and putting it in the bottom.
    Card burnCardToTheBottom();

    Card burnNCardsToTheBottom(int numberOfCards);

    //Shuffle this deck in a completely random order
    void randomShuffle();

    //Get a copy of this deck but shuffled in a completely random order
    Deck randomlyShuffled();

    //Separate the deck into two sub-decks
    Pair<Deck, Deck> cutInHalf();

    Pair<Deck, Deck> cutRandomly();

    Pair<Deck, Deck> cut(int cutIndex);

    //Cut a deck in half and interweave the two halves perfectly
    Deck faroShuffle();

    //Cut the deck in half and put the bottom half on top of the other half.
    Deck halfCharlierCut();

    //Cut the deck in two and put the bottom cut on top of the other cut.
    Deck charlierCut(int cutIndex);

    //Cut the deck at a random index, put the bottom cut on top of the other cut.
    Deck randomCharlierCut();

    Deck turnCardFaceDown(int index);

    Deck turnCardFaceUp(int index);

    Deck flipCard(int index);

    Deck turnCardsFaceDown(int offset, int numberOfCards);

    Deck turnCardsFaceUp(int offset, int numberOfCards);

    Deck flipCards(int offset, int numberOfCards);

    Deck turnAllCardsFaceDown();

    Deck turnAllCardsFaceUp();

    Deck flipAllCards();
}
