package deckBuild;

import java.util.ArrayList;

public class Hand {
	
	ArrayList<Card> hand;
	int PlayerID;
	
	public Hand(int size, int PID) {
		hand = new ArrayList<Card>(size);
		PlayerID = PID;
	}

	public int getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(int playerID) {
		PlayerID = playerID;
	}
	
	public void showHand() {
		int i;
		for (i = 0; i < hand.size(); i++) {
			hand.get(i).printCard();
		}
	}
	
	public void showCard(int cardPosition) {
		hand.get(cardPosition).printCard();
	}
	
	public void drawCard(Deck Deck) {
		hand.add(Deck.Draw());
	}
	
	public Card removeCard(int cardPosition) {
		return hand.remove(cardPosition);
	}
	
	public boolean searchHand(int targetValue, String targetSuit) {
		int i;
		for (i = 0; i < hand.size(); i++) {
			if (hand.get(i).suit.equals(targetSuit) && hand.get(i).value == targetValue) {
				return true;
			}
		}
		return false;
	}
	
	public void dumpHand() {
		hand.clear();
	}
}
