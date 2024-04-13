package cards;
public abstract class Card {

    private final String name;
    private final int cost;

    // Constructor for the Card class
    public Card(String name, int cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Card cost cannot be negative.");
        }
        this.name = name;
        this.cost = cost;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
    
    @Override 
    public String toString() {
    	return this.name;
    }

    // Abstract methods to be defined by concrete subclasses
    public abstract void play();
    public abstract String getDescription();
}