package Card;

public class UnmutableCard implements Card {

    private final MutableCard mutableCard;

    public UnmutableCard(CardSide back, CardSide face) {
        this.mutableCard = new MutableCard(back, face);
    }

    @Override
    public CardSide getBack() {
        return mutableCard.getBack();
    }

    @Override
    public CardSide getFace() {
        return mutableCard.getFace();
    }

    @Override
    public void putFaceUp() {
        mutableCard.putFaceUp();
    }

    @Override
    public void putFaceDown() {
        mutableCard.putFaceDown();
    }

    @Override
    public void flip() {
        mutableCard.flip();
    }

    @Override
    public CardSide peek() {
        return mutableCard.peek();
    }
}
