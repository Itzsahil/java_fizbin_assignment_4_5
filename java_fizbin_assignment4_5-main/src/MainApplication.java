/*
 * Assignment 4 and 5
 * 
 * Group members:
1. Syed Zubair Hussaini : C0822217 
2. Sahil : C0820173 
3. Bhawna Gupta : C0821937



 * */


import java.util.*;

public class MainApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Setup fizbin_game = new Setup();
		fizbin_game.generatePlayers();
		fizbin_game.startGame();
	}
}


class Setup{
	
	public void generatePlayers() {
		CardPlayers fizbin_players = new CardPlayers();
		String[] playerNames = {"One", "Two", "Three", "Four"};
		for (int p = 0 ; p < playerNames.length; p ++) {
			CardPlayer player = new CardPlayer(playerNames[p]);
			fizbin_players.playerList.add(player);
		}
		Dealer d1 = new Dealer();
		FizbinGame.the_deck = new Deck();
		FizbinGame.allPlayers = fizbin_players; // copy REFERENCE of players list
		System.out.println("======\n\n");
		System.out.println(fizbin_players);
	}
	public void startGame() {
		System.out.println("======\n\n");
		System.out.println(FizbinGame.allPlayers);
		// db connection
	}	
}

class FizbinGame{
	public static CardPlayers allPlayers = new CardPlayers();
	public static Deck the_deck = new Deck();
	
}

class Dealer{
	public static void managePlayers() {
		
	}
}



class Card_Player{
	String playerName;
	ArrayList <Card> cardsInHand;
	
	public Card_Player(String name) {
		this.playerName = "Player: "+ name;
	}
	public void receiveCards(Card card) {
		cardsInHand.add(card);
	}
}

class CardPlayers{
	public ArrayList<Card_Player> playerList = new ArrayList<Card_Player>();
}


class Deck{
	ArrayList<Card> theCards = new ArrayList<Card>();
	
	public Deck() {
		this.create_Deck();
		for (int c = 0 ; c < theCards.size(); c ++) {
			System.out.println(theCards.get(c)); // this arraylist of cards
		}
	}
	
	public void create_Deck() {
		String[] suites = {"red","blue","green", "purple" };
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		for (int s = 0; s < suites.length; s ++ ) {
			for (int v = 0; v < values.length; v++ ) {
				theCards.add(new Card(v, suites[s]));
			}
		}
	}
}

class Card{
	private String suite;
	private int value;
	public Card( int v, String s) {
		this.suite = s;
		this.value = v;
	}
	
}
