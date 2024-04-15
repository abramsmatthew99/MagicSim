import java.util.ArrayList;
import abilities.Ability;
import cards.*;
import game.Game;
import game.Player;

public class TestingDriver {

	public static void main(String[] args) {
		ArrayList<Ability> abilities = new ArrayList<Ability>();
		CreatureCard newCard = new CreatureCard("Ornithopter", 0, 0, 2, abilities);
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(newCard);
		Deck deck = new Deck(cards);
	    Player player1 = new Player("Alice", deck);
	    Game game = new Game(player1);

	    for (int i=0; i < 7; i++) { // progress through a turn to test functionality
	        game.progressToNextPhase();
	    }
	}
}
