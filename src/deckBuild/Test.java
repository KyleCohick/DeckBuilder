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
		System.out.println("\nPrint new shuffled deck.");
		d.printDeck();
		
		//testing hand functionality
		Hand h = new Hand(52, 0);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		h.drawCard(d);
		System.out.println("\nThis is a newly constructed hand:");
		h.showHand();
		System.out.println("\nCard to be removed: (Test showCard)");
		h.showCard(0);
		h.removeCard(0);
		System.out.println("\nTesting removing a card:");
		h.showHand();
		System.out.println("\nDoes the hand contain an Ace of Hearts?");
		System.out.println(h.searchHand(14, "Hearts"));
	}
}
