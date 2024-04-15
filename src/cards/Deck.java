package cards;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    
    public Deck(List<Card> initialCards) {
        this.cards = new ArrayList<>(initialCards);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // Handle deck empty scenario
        } else {
            return cards.remove(0); 
        }
    }
    
    public int getCardsRemaining() {
        return cards.size();
    }
}