package cards;

import java.util.HashMap;

public class Card {
	private String suit;
	private int rank;
	private String name;
	
	//  const 
	public Card(String suit, int rank) {
		super();
		this.suit = suit;
		this.rank = rank;
		this.name ="";
		
	
		HashMap<Integer , String> names = new HashMap<Integer ,String>();
		names.put(1,  "Ace");
		names.put(11,  "Jack");
		names.put(1,  "Queen");
		names.put(1,  "King");
		if(names.get(rank) !=null) {
			this.name=names.get(rank);
			
		}else {
			this.name= Integer.toString(rank);
		}
		
		// getters and setters
		
		
		
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	public void showCard() {
		System.out.printf ("%s of %s \n " , this.suit);
	}
	
}
