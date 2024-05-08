/**********************
 * CSC 150
 * Economic Policy
 * Drew Kroeger
 *********************/
//this program takes input economic policy practices and give a suggestions on what to do economically 
import java.util.Scanner;

public class EconomicPolicy 
{
	public static void main(String[]args)
	{
		Scanner stdIn = new Scanner(System.in);
		double growthRate;                          //this is the variable for the growth rate in percent of an overall economy
		double inflation ;							// this is the variable for the inflation in percent of an overall economy
		System.out.println("Enter growth rate: ");
		growthRate = stdIn.nextDouble();
		System.out.println("Enter inflation rate: ");
		inflation= stdIn.nextDouble();
		
		if (growthRate < 1)
			{
			if (inflation < 3)
				{
				System.out.print("Increase personal and business taxes, and decrease discount rate");
				}
			else
				{
				System.out.print("Reduce business taxes");
				}
			}
			
		if (growthRate > 4)
			{
			if (inflation < 1)
				{
				System.out.print("Increase personal and business taxes, and decrease discount rate");
				}
			if (inflation > 3)
				{
				System.out.println("Increase discount rate");
				}
			else
				{
				System.out.println("Increase personal taxes and maybe business taxes"); // I am not sure if this is what to put for this if statement, as it was not fully mentioned
				}
			}
		if (growthRate >=1 && growthRate <=4)
			{
			if (inflation >= 1 && inflation <= 3)
				{
				System.out.println("No change in economic policy");
				}
			if (inflation > 3)
				{
				System.out.println("Decrease inflation somehow,increase discount rate?"); // another line that was not discussed, here is my solution to it
				}
			if (inflation < 1)
				{
				System.out.println("Inflation is too low, decrease discount rate?"); 	 // one more not discussed line, here is my solution
				}
			}
	}
}// end of Assignment04- Economic policy
		
		


