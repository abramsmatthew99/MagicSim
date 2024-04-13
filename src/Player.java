import java.util.ArrayList;
import java.util.List;
import cards.*;

import cards.Card;

public class Player {
    private String name;
    private List<Card> hand;
    private List<PermanentCard> permanents;
    private int maxHandSize = 7; // default max hand size, can be modified for different game rules
    private Deck deck;
    
    // Constructor and getters/setters
    
    public Player(String name, Deck deck) {
        this.name = name;
        hand = new ArrayList<>();
        permanents = new ArrayList<>();
        this.deck = deck;
    }

    public void drawCard() {
        // Logic to draw a card from the deck (not implemented yet)
        System.out.println("Drew: " + deck.drawCard());
        
    }

    public void untapPermanents() {
        for (PermanentCard permanent : permanents) {
            // Logic to untap a permanent (not fully implemented)
            System.out.println(name + " untaps " + permanent.getName());
        }
    }
    
    public void discardToHandSize(){
        int discardAmount = hand.size() - maxHandSize; 
        for(int i=0;i<discardAmount;i++){
            //Logic to discard a card - not implemented
            System.out.println(name+" discards a card.");
        }
    }
    
    //Other relevant methods for interacting with the player's cards
}