package cards;
import java.util.List;
import abilities.*;

public class CreatureCard extends PermanentCard {
    private int power;
    private int toughness;
    private List<Ability> abilities;

    public CreatureCard(String name, int cost, int power, int toughness, List<Ability> abilities) {
        super(name, cost);
        this.power = power;
        this.toughness = toughness;
        this.abilities = abilities;
    }

    @Override
    public void deploy(){
        //deployment logic 
    }
    
    @Override
    public void play(){
        //playing logic - may call deploy and/or other methods
    }
    
    @Override 
    public String getDescription(){
        //description logic - return a string describing the card
    	return "";
    }
    
    
    // Getters and setters
}