package BabaNuki;

import java.util.ArrayList;
import java.util.Random;

public class Game {
	private Player player;
	private ArrayList<Card> deck;
	
	public static void main(String[] args){
		
	}
	
	public void GameBegin(){
		deck = new ArrayList<Card>();
		int i;
		for(i=1;i<14; i ++){
			deck.add(new OrdinaryCard("H", i));
			deck.add(new OrdinaryCard("C", i));
			deck.add(new OrdinaryCard("S", i));
			deck.add(new OrdinaryCard("D", i));
		}
		deck.add(new Joker());
		Random rnd = new Random();
		//TODO Dispense of the cards to each player
		for (i=0;0<size;i++){
			int rand;
			rand = rand%53;
			hand.add(deck.remove(rand));
		}
	}
	public void GamePlay(){
		
	}
	public static void GameEnd(){
		
	}

}
