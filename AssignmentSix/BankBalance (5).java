/************************
 * CSC 150
 * Bank Balance- assignment 6
 * Drew Kroeger
 ************************/
//the purpose of this code is to input a starting balance and give the number of years to reach 100000 and 1000000 dollars if the starting balance doubled each year.
import java.util.Scanner;

public class BankBalance
{
	public static void main(String[]args) 
	{
		Scanner stdIn = new Scanner (System.in);
		System.out.print("Enter starting bank balance(in dollars): ");
		
		double bankBalanceInitial = stdIn.nextDouble();    // this is the variable the user will put in as their starting bank balance
		int counterToHundred = 0;                          //this variable is an integer used in the first for loop to get the number of years needed to reach 100000 dollars
		int counterToMillion = 0;                          //this variable is an integer used in the second for loop to get the number of years needed to reach 1000000 dollars
		
		
		for ( double i = bankBalanceInitial;i <= 100000; i = i * 2) 
			{
				counterToHundred ++;
			}
		
		for ( double i = bankBalanceInitial;i <= 1000000; i = i * 2) 
			{
				counterToMillion ++;
			}
		
		System.out.println("It will take " + (counterToHundred) + " years to reach at least $100000.");
		System.out.println("It will take " + (counterToMillion) + " years to reach at least $1000000.");
	}
	
	
}//end of class BankBalance
