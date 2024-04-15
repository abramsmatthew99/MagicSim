package game;

public class Game {
    private Player activePlayer;
    private Phase currentPhase;

    public Game(Player startingPlayer) {
        activePlayer = startingPlayer;
        currentPhase = Phase.BEGINNING; // Game starts at the beginning phase
    }

    public void progressToNextPhase() {
        // Logic to determine the next phase based on the current one and advance the game state
        currentPhase = Phase.values()[(currentPhase.ordinal() + 1) % Phase.values().length]; 
        System.out.println("Now entering: " + currentPhase);
        currentPhase.execute(activePlayer); 
    }

    //Additional methods for game setup, win conditions, player turns etc. would go here. 
}