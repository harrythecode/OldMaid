package BabaNuki;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> card;
	private Card newCard;
	private int number;
	public Player(ArrayList<Card> card, int number){
		this.card = card;
		this.number = number;
		
	}
	public void takeCard(Card card){
		this.newCard = card;
	}
	public void discardCard(){
		int i;
		for(i = 0; i < card.size(); i++){
			if( (card.get(i)).equals(newCard) ){
			 card.remove(i);
			}
		}
	}
}
