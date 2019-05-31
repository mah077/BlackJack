package com.revature.game;

import java.io.Console;
import java.util.Scanner;

public class TimeToGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table table = new Table();
		table.SortedCards52();// calling the gathering method of 52 cards
		table.MixerCard();// mixing all cards and make the randomly
		
		
		
		  	//	System.out.println(t.toString());// printing out the result of random form
			//System.out.println(t.ValueOfCard());
		int playerwin=0;
		int dealerwin=0;
		int coin=10;
		//int startcoin;
		
		Table player1=new Table();
		Table Dealer=new Table();

		Scanner input=new Scanner(System.in);
		int auth ;
	/*	System.out.println("Hello... :) \nIf you wanna Play BlackJack and above 21 age+ Press 'y' inf not press 'n' ");
		do { auth=0;
				
				auth=input.next().charAt(auth);
					if(auth!='n'&& auth!='y')
						System.out.println("please enter the correct answer 'y' or 'n' ");
					else 
						if (auth=='n')
							break;	
					if(auth=='y'|| auth=='Y')
					{*/
						System.out.println("Welcom to BlackJack Game :D \nIm your director in BlackJack game please follow my instructions\n");
					
					do {
						auth=0;	
						System.out.println("The Dealer is ready to enjoy a good game with you\n");
						
					while(coin>0){	// testing The player coins
						
						
						System.out.println("you Have now "+ coin+" coins to start your game. how much you woud like to start");
							
							int startcoin=input.nextInt();
							boolean gameover=false;
							
							if(coin < startcoin)
							{ 
								System.out.println("looser"+coin);
								break;
							
					
					}
							
				//	System.out.println("ingame");
							
						
							System.out.println("game started");
							//first 2 cards for the player
							player1.FirstCard(table);
							player1.FirstCard(table);
							// first two cards for the dealer
							Dealer.FirstCard(table);
							Dealer.FirstCard(table);
							
							
						while(true) {// infinit loop for new cards
								
								
								//output first two cards for the player 1
								System.out.println("Your Cards are:\n"+player1.toString()+"\nYour value is "+player1.ValueOfCard());
								
								
								//  dealer output results
								System.out.println("Dealer Cards:\n" + Dealer.gettingCard(0).toString() + " and *****hidden*****");
								
								
							
								int hit;// if you use would like to hit again or no
								
								System.out.println("would you like to hit press '1' if no press '2'");
								hit=input.nextInt();
								
								if(hit==1) {
									
									player1.FirstCard(table);
									System.out.println("You draw a:" + player1.gettingCard(player1.csize()-1).toString());
								
									
									//if the coins go over 21 means that he lost
									if(player1.ValueOfCard() > 21){
										System.out.println("Bust. Currently valued at: " + player1.ValueOfCard());
										coin -= startcoin;
										gameover= true;
										break;
									
									
										}// end if value >21
							
								}// end if yes "he wanna hit"
								
								//continue playing with out hitting
									if(hit==2) {
									break;
								
								}//end if
									
							}//while true
						
								// see the Dealer hidden Card
								System.out.println("Dealer Cards: \n" + Dealer.toString());
								
								//check if the dealer score enough or no
								if((Dealer.ValueOfCard() > player1.ValueOfCard()) &&   gameover == false){
									System.out.println("Dealer Wins " + Dealer.ValueOfCard() + " to " + player1.ValueOfCard());
									coin-= startcoin;
									gameover = true;
								}// end if statment if my score more than the beater
								
								//the dealer can hit if his max value is 20 or less
								while((Dealer.ValueOfCard() < 17) && gameover== false  ){
									Dealer.FirstCard(table);
									System.out.println("Dealer draws: " + Dealer.gettingCard(Dealer.csize()-1).toString());
								}// while statment end that allow the dealer to hit when is score
								
								//Display value of dealer
								System.out.println("Dealers hand value: " + Dealer.ValueOfCard());
								
								// if dealer busted
								if((Dealer.ValueOfCard()>21)&& gameover == false){
									System.out.println("Dealer Busts. You win!");
									playerwin++;
									coin += startcoin;
									
									gameover= true;
									
								}//if statmet if dealer has no more mony and i get wil 
								
								
								
								
								//Determine if push
								if((Dealer.ValueOfCard() == player1.ValueOfCard()) && gameover == false){
									System.out.println("Push.");
									gameover = true;
								}
								
								
								
								//Determine if player wins
								if((player1.ValueOfCard() > Dealer.ValueOfCard()) && gameover == false){
									System.out.println("You win the hand.");
									playerwin++;
									coin += startcoin;
									gameover = true;
									
								}//if statment for the player if he wins
								
								else 
									if(gameover == false) //dealer wins
								{
									System.out.println("Dealer wins.");
									coin -= startcoin;
									dealerwin++;
								}// else statment for the dealer if he wins
								
								
								
								
								//put all cards back
								player1.PushToTable(table);
								Dealer.PushToTable(table);
								System.out.println("End of Game");
								
								
								
						 
							
					}//while start coin>0
					
					System.out.println("Game Over :( No more money to play final score is "+playerwin+" for player "+dealerwin+" for dealer");
					System.out.println("would you like to play again '1' or '2' !!!");
					auth=input.nextInt();
					if(auth==1) {
					coin=10;
					playerwin=0;
					dealerwin=0;
					}
		/*
		 * }//if auth ==y
		 */					
		}while(auth==1);
		
		System.out.println("Goodbye");
		
		
		
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main 
}//TimettGame Class