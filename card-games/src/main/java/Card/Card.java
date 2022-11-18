package Card;

public interface Card {

    CardSide getBack();

    CardSide getFace();

    void putFaceUp();

    void putFaceDown();

    void flip();

    CardSide peek();
}
