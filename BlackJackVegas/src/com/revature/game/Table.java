package com.revature.game;
import java.util.ArrayList;
import java.util.Random;

public class Table {

	ArrayList<Card> c; // create array list to put all 52 cards in
	static public int countercards=0;
	public Table() // constructor
	{

		this.c = new ArrayList<Card>();

	}

	public void SortedCards52() // mix the value and the shape as basic sorted 52 cards
	{

		for (Shape p : Shape.values()) {
			for (Value v : Value.values())
				this.c.add(new Card(p, v));
			countercards++;


		}// end for loop
	}// end Method

	public void MixerCard() // mixing all cards and make them random
	{

		ArrayList<Card> tempcard = new ArrayList<Card>();

		Random rand = new Random();
		int random = 0;

		for (int i = 0; i < 52; i++) {

			random = rand.nextInt((52 - 1 - 0) + 1) + 0; // (max -1 -min) + min

			tempcard.add(this.c.get(random));
		}// end for loop
		this.c = tempcard;

	}// end method

	public int ValueOfCard() {

		int sum = 0;

		for (Card mycard : this.c) {

			switch (mycard.getValue()) {

			case Two:
				sum += 2;
				break;
			case Three:
				sum += 3;
				break;
			case Four:
				sum += 4;
				break;
			case Five:
				sum += 5;
				break;

			case Six:
				sum += 6;
				break;

			case Seven:
				sum += 7;
				break;

			case Eight:
				sum += 8;
				break;

			case Nine:
				sum += 9;
				break;

			case Ten:
				sum += 10;
				break;

			case King:
				sum += 10;
				break;

			case Queen:
				sum += 10;
				break;

			case Jack:
				sum += 10;
				break;

			case Ace:
				if (sum > 10)
					sum += 1;
				else if (sum <= 10)
					sum += 11;
				break;

			}// end switch

		}// end for loop

		return sum;

	}// end method
	
	
	
	public void PushToTable(Table push) {
		int d= this.csize();
			for( int i = 0; i< d;i++)
					push.Adding(this.gettingCard(i));
			
			for(int j=0 ; j<d;j++)
				this.deleting(0);
		
		
	}// end method
	
	public void FirstCard(Table fc)
	{
		this.c.add(fc.gettingCard(0));
		fc.deleting(0);
		
		
	}

	public String toString()// cards output

	{

		String output = "";

		for (Card ca : this.c) {

			output += ca.toString() + "\n";

		}

		return output;
	}// End method

	public void deleting(int deleting) // deleting one card from the array list
	{

		this.c.remove(deleting);

	}// End method

	public void Adding(Card adding) // Adding one card to the array list
	{

		this.c.add(adding);

	}// end method

	public Card gettingCard(int geting)// getting one card from the ArrayList
	{

		return this.c.get(geting);

	}// end method
	
	public int csize() {
		
		return this.c.size();
	}

}// end Class
