package deckBuild;

public class Card {
	
	String suit;
	int value;
	
	public Card(String s, int v) {
		suit = s;
		value = v;
	}

	public String getSuit() {
		return suit;
	}

	public int getValue() {
		return value;
	}	
	
	public void printCard() {
		if (this.value == 11) {
			System.out.println("Jack " + this.suit);
		}
		
		else if (this.value == 12) {
			System.out.println("Queen " + this.suit);
		}
		
		else if (this.value == 13) {
			System.out.println("King " + this.suit);
		}
		
		else if (this.value == 14) {
			System.out.println("Ace " + this.suit);
		}
		
		else {
		System.out.println(this.value + " " + this.suit);
		}
	}
	
	public String stringedCard() {
		if (this.value == 11) {
			return "Jack " + this.suit;
		}
		
		else if (this.value == 12) {
			return "Queen " + this.suit;
		}
		
		else if (this.value == 13) {
			return "King " + this.suit;
		}
		
		else if (this.value == 14) {
			return "Ace " + this.suit;
		}
		
		else {
		return this.value + " " + this.suit;
		}
	}
}
