/*******************
 * CSC150
 * Drew Kroeger
 * Assignment 10- Phone Number Checker
 *******************/
import java.util.Scanner;
public class PhoneEnumberDissector 
{
	public static void main(String[]args) 
	{
		Scanner stdIn= new Scanner(System.in);
		String phoneNumber;
		String countryCode;
		String areaCode;
		String localCode;
	    do
		{
		System.out.println("Enter a phone number in the form cc--area--local. CC=country code,\narea=area code digits, and local=local code digits, or enter q to quit.");
		phoneNumber = stdIn.nextLine();
		
		
		if (!(phoneNumber.equalsIgnoreCase("q")))
		{
			
		boolean valid = variableChecker(phoneNumber);
		
		if (!(valid)) // if the response contains more than numbers and dashes it will come here
		{
			System.out.println("Please only put numbers and two dashes in between each set of numbers. Try again");
		}
		
		
		// this code below will made three separate strings. It will create the country code, area code, and local code, it will do this by making substrings out of the first response/phoneNumber variable.
		
		 int beginning = 0;
		 int end = phoneNumber.indexOf('-',beginning);  // the end of the substring  of the country code is determined by the first instance of a dash
		 if (end == -1) //if there are no dashes in the phoneNumber response it will output this message
			{
				System.out.println("It seems there is no dash present. Please try again");
			}
		 countryCode = phoneNumber.substring(beginning,end);
		 
		 
		 beginning = end + 2;
		 if(beginning-1 !='-') {
			 System.out.println("ERROR TEST");
		 }
		 end = phoneNumber.indexOf('-',beginning);
		 areaCode = phoneNumber.substring(beginning,end);
		 
		 beginning = end + 2;
		 if (beginning >= phoneNumber.length()) //IF THE beginning of the local is the same amount of digits as the length of the phone number, then one or some of many formatting error has occured.
		 {
			 System.out.println("It seems you forgot a dash/dashes,local number is too short,or whole phone number is incomplete. Please try again");
		 }
		 localCode= phoneNumber.substring(beginning);
		
		
		
		
		
		if(valid) //if the response only contains numbers and dashes it will go through this, although sometimes it will be wrong, where a pop up sometimes will occur.
		{
			System.out.println("Country code: "+ countryCode + "\narea code: "+ areaCode  + "\nlocal code: " + localCode + "\nIf a number is missing please make sure to enter two dashes in between each set of numbers." );
		}	
		
		

		}
		}while (!(phoneNumber.equalsIgnoreCase("q")));  //it repeats the program as long as the response does not equal q or Q.
		
	}//END OF MAIN
	
	/****************************************************************/
	
	// this method checks if there is anything other than a number or dash inside the phone number. If there is it invalidates the phone number
	public static boolean variableChecker(String phoneNumber) 
	{
		boolean valid = true;

		for (int i=0; i<phoneNumber.length();i++) 
		{
			char atI = phoneNumber.charAt(i);
		
			if (!(Character.isDigit(atI))) 
			{
				if ((atI == ('-')))
				{
					valid = true;
				}
				else 
				{
					valid =false;
					return valid;
				}
			}
			else 
			{
				valid = true;
			}
			
		}
		return valid;
	}	
	
	
}//end of class