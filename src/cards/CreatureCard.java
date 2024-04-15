package cards;
import java.util.List;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import abilities.*;

public class CreatureCard extends PermanentCard {
    private int power;
    private int toughness;
    private List<Ability> abilities;
    private Image image;

    public CreatureCard(String name, int cost, int power, int toughness, List<Ability> abilities, String imagePath) {
        super(name, cost);
        this.power = power;
        this.toughness = toughness;
        this.abilities = abilities;
        this.image = new ImageIcon(imagePath).getImage();
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
    
    public int getPower() {
    	return power;
    }
    
    public int getToughness() {
    	return toughness;
    }
    
    public List<Ability> getAbilities() {
    	return abilities;
    }
    
    //Method to draw the card's image
    public void draw(Graphics g, int x, int y) {
    	g.drawImage(image, x,y,null);
    }
}