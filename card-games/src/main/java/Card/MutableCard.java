package Card;

import lombok.Getter;
import lombok.Setter;

public class MutableCard implements Card {
    @Getter
    @Setter
    private CardSide back;

    @Getter
    @Setter
    private CardSide face;

    @Getter
    private boolean isFaceUp;

    public MutableCard(CardSide back, CardSide face) {
        this.back = back;
        this.face = face;
        this.isFaceUp = false;
    }

    @Override
    public void putFaceUp() {
        isFaceUp = true;
    }

    @Override
    public void putFaceDown() {
        isFaceUp = false;
    }

    @Override
    public void flip() {
        isFaceUp = !isFaceUp;
    }

    @Override
    public CardSide peek() {
        return isFaceUp ? face : back;
    }
}
