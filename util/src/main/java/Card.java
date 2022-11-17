import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Card {
    GUARD("Guard", 1, "Name a non-Guard card and choose another player. If that player has that card, he or she is out of the round."),
    PRIEST("Priest", 2, "Look at another player's hand."),
    BARON("Baron", 3, "You and another player secretly compare hands. The player with the lower value is out of the round."),
    HANDMAID("Handmaid", 4, "Until your next turn, ignore all effects from other players' cards."),
    PRINCE("Prince", 5, "Choose any player (including yourself) to discard his or her hand and draw a new card."),
    KING("King", 6, "Trade hands with another player of your choice"),
    COUNTESS("Countess", 7, "If you have this card and the King or Prince in your hand, you must discard this card."),
    PRINCESS("Princess", 8, "If you discard this card, you are out of the round.");

    @Getter
    private final String name;
    @Getter
    private final int value;
    @Getter
    private final String description;
}
