package cards;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck() {
		this.cards = new ArrayList<Card>();
		
		for(String name : new String[] {"Hearts" , "Clubs" , "Diamonds" , "Spades"}) {
			
			for (Integer rank =1; rank <=13 ; rank ++) {
				this.cards.add(new Card(name, rank));
			}
			
		
		}}

  //get and set

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	//randomize the order of the cards 
	public void shuffle () {
		Collections.shuffle(cards);
	}
	public Card getOneCard () {
		Card oneCard=this.cards.get(0);
		this.cards.remove(0);
		return oneCard;
	}
	
}