 
import java.util.ArrayList;
import java.util.Random;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Blackjack1 extends BasicGame{
	private ArrayList<Card> cards;
	
	
	public Blackjack1(String title) {
		super(title);
	}
	
	public void init(GameContainer gc) throws SlickException {
		getCards();
		//uncomment to shuffle the deck
		//shuffle();
	}

	public void update(GameContainer gc, int delta) throws SlickException {
		
		
	}
	
	public void render(GameContainer gc, Graphics g) throws SlickException {
		
		
		
		/*
		 * test loops...
		 */
		//draws all the cards on the screen. every 13 dars = new deck
		for (int x = 0; x < WIDTH / cards.get(0).getWidth(); x ++) {
			g.drawImage(cards.get(x).getImage(), x * cards.get(0).getWidth(), 0);
			g.drawImage(cards.get(x + 13).getImage(), x * cards.get(0).getWidth(), cards.get(0).getHeight());
			g.drawImage(cards.get(x + 26).getImage(), x * cards.get(0).getWidth(), 2 * cards.get(0).getHeight());
			g.drawImage(cards.get(x + 39).getImage(), x * cards.get(0).getWidth(), 3 * cards.get(0).getHeight());
		}
		//draws value of each card over the respective card
		for (int x = 0; x < WIDTH / cards.get(0).getWidth(); x ++) {
			g.setColor(Color.black);
			g.drawString("" + cards.get(x).getValue(), x * cards.get(0).getWidth(), 0 + (cards.get(0).getHeight() / 4));
			g.drawString("" + cards.get(x + 13).getValue(), x * cards.get(0).getWidth(), cards.get(0).getHeight() + (cards.get(0).getHeight() / 4));
			g.drawString("" + cards.get(x + 26).getValue(), x * cards.get(0).getWidth(), 2 * cards.get(0).getHeight() + (cards.get(0).getHeight() / 4));
			g.drawString("" + cards.get(x + 39).getValue(), x * cards.get(0).getWidth(), 3 * cards.get(0).getHeight() + (cards.get(0).getHeight() / 4));
		}
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new Blackjack1("BlackJack"));
		
		app.setDisplayMode(WIDTH, HEIGHT, false);
		app.start();
	}
	
	//shuffles the deck
	public void shuffle() {
	    Random random = new Random();
	    for (int i = 0; i <= 500; i++) {
	      int rand = random.nextInt(cards.size());
	      cards.add(cards.remove(rand));
	    }
	  }
	
	//imports card images and adds them to cards ArrayList
	public void getCards() throws SlickException {
	    cards = new ArrayList<Card>();
	    
	    //clubs
	    for (int i = 1; i <= 13; i++) {
	    	Image c = new Image("images/c"+(i)+".png"); 
	    	cards.add(new Card(c, i));
	    }
	    //hearts
	    for (int i = 1; i <= 13; i++) {
	    	Image h = new Image("images/h"+(i)+".png");
	    	cards.add(new Card(h, i));
	    }
	    //diamonds
	    for (int i = 1; i <= 13; i++) {
	    	Image d = new Image("images/d"+(i)+".png");
	    	cards.add(new Card(d, i));
	    }
	    //spades
	    for (int i = 1; i <= 13; i++) {
	    	Image s = new Image("images/s"+(i)+".png");
	    	cards.add(new Card(s, i));
	    }
	  }
	//app screen width and height constants
	public static final int WIDTH = 1027, HEIGHT = 492;
}
