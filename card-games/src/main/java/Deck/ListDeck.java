package Deck;

import Card.Card;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ListDeck implements Deck {

    ArrayList<Card> list;
    Random random;

    public ListDeck() {
        list = new ArrayList<>();
    }

    private Random getRandom() {
        if(random == null)
            random = new Random(System.currentTimeMillis());
        return random;
    }

    public ListDeck(Card[] cards) {
        list = new ArrayList<>();
        list.addAll(Arrays.asList(cards));
    }

    @Override
    public Card[] toCardArray() {
        Card[] cards = new Card[list.size()];
        for (int i = 0; i < list.size(); i++)
            cards[i] = list.get(i);
        return cards;
    }

    @Override
    public Deck copy() {
        return new ListDeck(this.toCardArray());
    }

    @Override
    public Card getTopCard() throws EmptyDeckException {
        if (list.isEmpty())
            throw new EmptyDeckException("Can't get card at the top, Deck is empty.");
        return list.get(0);
    }

    @Override
    public Card getBottomCard() throws EmptyDeckException {
        if (list.isEmpty())
            throw new EmptyDeckException("Can't get card at the bottom, Deck is empty.");
        return list.get(list.size() - 1);
    }

    @Override
    public Card getCardAt(int index) {
        if (index < 0 || index >= list.size())
            throw new IndexOutOfBoundsException("Cant get card, index out of bounds.");
        return list.get(index);
    }

    @Override
    public Card getRandomCard() throws EmptyDeckException {
        if (list.isEmpty())
            throw new EmptyDeckException("Can't take any card, Deck is empty");

        int randomNumber  = getRandom().nextInt(list.size());
        return list.get(randomNumber);
    }

    @Override
    public Card[] getNCards(int offset, int numberOfCards) {
        //TODO
        return new Card[0];
    }

    @Override
    public Card[] getNRandomCards(int numberOfCards) {
        //Todo
        return new Card[0];
    }

    @Override
    public Card takeTopCard() {
        return null;
    }

    @Override
    public Card takeBottomCard() {
        return null;
    }

    @Override
    public Card takeCardAt(int index) {
        return null;
    }

    @Override
    public Card takeRandomCard() {
        return null;
    }

    @Override
    public Deck takeNCards(int offset, int numberOfCards) {
        return null;
    }

    @Override
    public Deck takeNRandomCards(int numberOfCards) {
        return null;
    }

    @Override
    public Deck putCardOnTop() {
        return null;
    }

    @Override
    public Deck putCardBellowBottom() {
        return null;
    }

    @Override
    public Deck putCard(int cardIndex) {
        return null;
    }

    @Override
    public Deck putCardRandomly() {
        return null;
    }

    @Override
    public Deck removeTopCard() {
        return null;
    }

    @Override
    public Deck removeBottomCard() {
        return null;
    }

    @Override
    public Deck removeCardAt(int index) {
        return null;
    }

    @Override
    public Deck removeRandomCard() {
        return null;
    }

    @Override
    public Deck removeNCards(int offset, int numberOfCards) {
        return null;
    }

    @Override
    public Deck removeNCardsRandomly(int numberOfCards) {
        return null;
    }

    @Override
    public Card burnCard() {
        return null;
    }

    @Override
    public Card burnNCards(int numberOfCards) {
        return null;
    }

    @Override
    public Card burnCardToTheBottom() {
        return null;
    }

    @Override
    public Card burnNCardsToTheBottom(int numberOfCards) {
        return null;
    }

    @Override
    public void randomShuffle() {

    }

    @Override
    public Deck randomlyShuffled() {
        return null;
    }

    @Override
    public Pair<Deck, Deck> cutInHalf() {
        return null;
    }

    @Override
    public Pair<Deck, Deck> cutRandomly() {
        return null;
    }

    @Override
    public Pair<Deck, Deck> cut(int cutIndex) {
        return null;
    }

    @Override
    public Deck faroShuffle() {
        return null;
    }

    @Override
    public Deck halfCharlierCut() {
        return null;
    }

    @Override
    public Deck charlierCut(int cutIndex) {
        return null;
    }

    @Override
    public Deck randomCharlierCut() {
        return null;
    }

    @Override
    public Deck turnCardFaceDown(int index) {
        return null;
    }

    @Override
    public Deck turnCardFaceUp(int index) {
        return null;
    }

    @Override
    public Deck flipCard(int index) {
        return null;
    }

    @Override
    public Deck turnCardsFaceDown(int offset, int numberOfCards) {
        return null;
    }

    @Override
    public Deck turnCardsFaceUp(int offset, int numberOfCards) {
        return null;
    }

    @Override
    public Deck flipCards(int offset, int numberOfCards) {
        return null;
    }

    @Override
    public Deck turnAllCardsFaceDown() {
        return null;
    }

    @Override
    public Deck turnAllCardsFaceUp() {
        return null;
    }

    @Override
    public Deck flipAllCards() {
        return null;
    }

    @Override
    public Deck mergeDeckRandomly(Deck deck) {
        return null;
    }

    @Override
    public Deck mergeDeckAt(int index, Deck deck) {
        return null;
    }

    @Override
    public Deck putDeckOnTheBottom(Deck deck) {
        return null;
    }

    @Override
    public Deck putDeckOnTop(Deck deck) {
        return null;
    }

    @Override
    public Deck putNCardsRandomly(Card[] cards) {
        return null;
    }

    @Override
    public Deck putNCardsAt(int index, Card[] cards) {
        return null;
    }

    @Override
    public Deck putNCardsOnTheBottom(Card[] cards) {
        return null;
    }

    @Override
    public Deck putNCardsOnTop(Card[] cards) {
        return null;
    }
}
