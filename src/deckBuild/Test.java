package deckBuild;

public class Test {
	
	public static void main(String[] args) {
		//testing card section
		Card card = new Card("Hearts", 5);
		System.out.println(card.stringedCard());
		card.printCard();
		System.out.println();
		
		//testing deck collection section
		Deck d = new Deck(52);
		d.generateNewDeck();
		d.printDeck();
		d.shuffleDeck();
		System.out.print("\nPrint new shuffled deck.");
		d.printDeck();
		
		//testing hand functionality
		Hand h = new Hand(52, 0);
		h.drawCard(d);
		
	}
}
