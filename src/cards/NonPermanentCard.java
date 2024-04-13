package cards;

public abstract class NonPermanentCard extends Card {
    // Attributes specific to non-permanents, e.g., duration, target
	
	public NonPermanentCard(String name, int cost) {
		super(name, cost);
	}
}
