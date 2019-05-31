package com.revature.game;
public class Card {

	private Shape shape;
	private Value value;
	public static int countergames=0;

	public Card() // Default constructor
	{

	}

	public Card(Shape p, Value v)// costructor
	{
		shape = p;
		value = v;

	}// end method

	public Shape getShape() {

		return shape;
	}// end method

	public Value getValue() {
		return value;

	}// end method

	public String toString() {

		return getShape().toString() + " " + getValue().toString();

	}// end method

}// end class
