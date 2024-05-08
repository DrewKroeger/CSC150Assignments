/*******************
 * CSC150
 * VariableNameChecker- Assignment 8
 * Drew Kroeger
 *******************/ 
// this program checks whether or not a variable name is legal, legal but has poor style, or is illegal

import java.util.Scanner;
public class VariableNameChecker 
{
	
	/**********************************************************************/
	
	//this method takes an input of a variable name, sends it to the Variable checker method where it is deemed valid or not valid, and is then sent back to this method. In this method the outcome of the variable name is legal, legal with poor style, or not legal.
	
	public static void main(String[]args) 
	{
		String varName;
		Scanner stdIn = new Scanner(System.in);
		System.out.println("This program checks the properness of a proposed Java variable name.");
		
		
		do                                                          //this do while loop checks if q is entered(to quit program), if not, it keeps repeating
		{
			
			System.out.println("Enter a variable name(q or Q to quit)");
			varName = stdIn.nextLine();
			boolean valid = VariableChecker(varName);
			int substringOne = varName.indexOf('$',0);
			int substringTwo = varName.indexOf('_',0);
			if (valid)                                                  // if the statements in the variable checker method come back as true, we now must determine between good and bad style, so we still have a couple steps left
			{
				if (Character.isUpperCase(varName.charAt(0))   ||  ((substringOne >=0  || substringTwo >= 0)))         //this method is valid, but does not use proper style, as the method below only returns valid or invalid, and not kind of valid, we must check it here. If it uses a capital on the first letter, it is invalid. If it contains a $ or _ it is invalid.
				{
					System.out.println("Legal, but uses poor style. I would try again");
				}

				else 													//if the variable checker method comes back as good, and it passes the previous if statement, it comes here
				{
					System.out.println("Good! Your name is legal and follows proper style");
				}
			
			}
		
			else                                                       //if the variable checker method below returns an invalid variable(false), it comes here 
			{
				System.out.println("Illegal name. Please try again.");    
			}
		
		
		} while (!(varName.equalsIgnoreCase("q")));
		
		System.out.println("Goodbye!");
		
	}//end of main
	
	/*********************************************************************************************/
	
	// this method checks if a variable name is or is not valid, it returns a true or false back to the main method.
	
	public static boolean VariableChecker(String varName) 
	{
		boolean validEntry= true;
		
		for(int i = 0; i< varName.length();i++)                      //for loop that checks if INDIVIDUAL characters are letters or digits, $ or _ 
		{
			char atI= varName.charAt(i);							 //Char atI is used to check whether or not individual character in the variable name equal a dollar sign or underscore. We used letter or digit in the line right below this, but we still have to filter any character other than letter, number, $ or _
			
			if (!(Character.isLetterOrDigit(varName.charAt(i))))     // this if statement makes it so if there is any character other than digit or letter, it goes to the next if. If we get anything other than $ or _, it is filtered as invalid
			{
				if  (!(atI  == ('_')  || atI == ('$')))              //this if statement is if there is a non letter or digit in the variable name it gets sent here. It is checked if it is a $ or _. If it is not a $ or _ it is immediately made invalid and sent back to main.
				{  
					validEntry = false;
					return validEntry;
				}
			}
			
			else                                                // if every char in the varName is a letter or digit is comes here, then goes through next if statement
			{
				validEntry = true;
			}
		}
		
		if (Character.isDigit(varName.charAt(0)))  				     // this if statement makes digits in the first spot not valid
		{
			validEntry = false;
		} 
		return validEntry;
		
	}//end of variable checker method
}//end of class