package cards;

public abstract class PermanentCard extends Card {
    // Attributes specific to permanents, e.g., toughness, power
    public abstract void deploy(); // Specific action for playing permanents 
    public PermanentCard(String name, int cost) {
    	super(name, cost);
    }
}