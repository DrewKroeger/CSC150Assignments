/***************
 * CSC150
 * Assignment 7- Dice
 * Drew Kroeger
 ***************/
// this program simulates a simple dice game between computer and user
import java.util.Scanner;
public class Dice 
{
	public static void main(String[]args) 
	{
		Scanner stdIn= new Scanner(System.in);
		String input;                          //this string is figure out whether or not the user wants to play the game. If they do they must enter y. If they press n it will tell them they should play the game. Any other letter or string of chars will tell them invalid entry
		
		
		do                                     //this do while loop is the input validation. As mentioned in the comment on line 13, y is proceed to game, n gives a unique response, anything else says invalid entry
		{
			System.out.println("Let's play a game of dice! We both roll and whoever is has more winning rolls after 5 turns wins! Do you want to play? (y/n):");
			input = stdIn.next();
			if (!(input.equalsIgnoreCase("y")) &&  (!(input.equalsIgnoreCase("n")))) 
			{
				System.out.println("Invalid entry, try again");
			}
		}while ((!(input.equalsIgnoreCase("y"))) &&  (!(input.equalsIgnoreCase("n"))));
		
		
		
		if (input.equalsIgnoreCase("y"))       // this is where the main chunk of game starts, if the user enters y, the game will proceed/run the main chunk
		{
			int userTotal = 0;                 //these two integer variables (line 30 and 31)keep track of the winners of each round.
			int computerTotal = 0;
			
			
			for (int i = 1; i <= 5; i++)      //this for loop can run as many times as you want it to, but it is set to 5 times right now. The winner of the game will be determined by 5 rounds. This chunk determines the winner of each round, and is where the dice are rolled and where the respective outputs for each round are coded
			{
				System.out.println("Round "+ i);
				int userRandomDice =  (int) ((Math.random() * 6)+ 1);
				int computerRandomDice = (int) ((Math.random() * 6)+ 1);
				
				
				if(userRandomDice > computerRandomDice) 
				{
					System.out.println("The die numbers are:");
					System.out.println("You: " + userRandomDice);
					System.out.println("Me: " + computerRandomDice);
					userTotal ++;
					System.out.println("YOU WIN THIS ROUND!!!");
					System.out.println("Your total score is: "+ userTotal);
					System.out.println("My total score is: "+ computerTotal);
				}
				else if(userRandomDice < computerRandomDice) 
				{
					System.out.println("The die numbers are:");
					System.out.println("You: " + userRandomDice);
					System.out.println("Me: " + computerRandomDice);
					computerTotal ++;
					System.out.println("I WIN THIS ROUND!!!");
					System.out.println("Your total score is: "+ userTotal);
					System.out.println("My total score is: "+ computerTotal);
					
				}
				else                                   //if a dice roll is the same this statement is ran
				{
					System.out.println("The die numbers are:");
					System.out.println("You: " + userRandomDice);
					System.out.println("Me: " + computerRandomDice);
					System.out.println("WOW, we rolled the same thing!!!");
					System.out.println("Your total score is: "+ userTotal);
					System.out.println("My total score is: "+ computerTotal);
				}
				System.out.println(" ");
			}System.out.println();
			
			
			if (userTotal > computerTotal)            //this is the chunk that determines the overall winner of the game, the two int variables that hold the round winners are on line 30 and 31, above the for loop, and not in the for loop. This is so they can keep their values.
			{
				System.out.println("WOW, YOU WON THIS GAME OVERALL! GREAT JOB!!");
			}
			else if (computerTotal > userTotal)
			{
				System.out.println("I WIN!!BETTER LUCK NEXT TIME!!");
			}
			else                                     // if a tie occurs in the dice overall score this statement is ran.
			{
				System.out.println("Did we tie? This is incredible!! Let's try again!");
			}
		}
		
		else if (input.equalsIgnoreCase("n"))       // this chunk is if the user presses n instead of y. They are told to press y.
		{
			System.out.println("I highly recommend you click y, there is a lot of fun waiting!");
		}
	}	
	
}// end of Dice/Assignment7


