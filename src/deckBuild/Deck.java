package deckBuild;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	ArrayList<Card> deck;
	
	public Deck(int size) {
		deck = new ArrayList<Card>(size);
	}
	
	public void generateNewDeck() {
		//this returns a new sorted deck, incremented by suit then value
		int suitPointer;
		int value;		
		String suit;
		Card c;
		
		for(suitPointer = 1; suitPointer < 5; suitPointer++) {
			
			//suit changer
			if (suitPointer == 1) {
				suit = "Hearts";
			}
			else if (suitPointer == 2) {
				suit = "Diamonds";
			}
			else if (suitPointer == 3) {
				suit = "Spades";
			}
			else {
				suit = "Clubs";
			}
			//handles the creation of the first 8 cards					
			for(value = 2; value < 15; value++) {
				c = new Card(suit, value);
				deck.add(c);
			}
		}		
	}
	
	public void printDeck() {
		int i;
		for (i = 0; i < deck.size(); i++) {
			deck.get(i).printCard();
		}
	}
	
	public void shuffleDeck() {
		ArrayList<Card> shuffledDeck = new ArrayList<Card>(deck.size());
		while (deck.size() > 0) {
			shuffledDeck.add(shuffleHelper());			
		}
		deck = shuffledDeck;
		
	}
	
	private Card shuffleHelper() {
		Random r = new Random();			
		int selector = r.nextInt(deck.size());
		return deck.remove(selector);
	}
}
