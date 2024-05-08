/*******************
 * CSC150
 * Assignment 9-Rainfall
 * Drew Kroeger
 *******************/
// this class uses numbers in an array and figures out what the sum, average, highest, and lowest numbers are in the array. These are applied to the amount of rainfall in inches in different months.
public class Rainfall 
{
	public static void main (String[]args) 
	{
		double[] thisYear = {1.6,2.1,1.7,3.5,2.6,3.7,3.9,2.6,2.9,4.3,2.4,3.7};
		boolean valid = negativeCheck(thisYear);
		
		
		if (valid)
		{
		System.out.println("The total Rainfall for this year is: " + totalRainFall(thisYear) + " inches");
		System.out.println("The average rainfall in a month is: " + averageRainFall(thisYear)+ " inches");
		System.out.println("The highest amount of rainfall in a month is: " + highestMonth(thisYear)+ " inches");
		System.out.println("The lowest amount of rainfall in a month is: " + lowestMonth(thisYear) + " inches"); 
		}
		else
		{
			System.out.println("The array cannot contain negative numbers. Please fix the array and try again.");
		}
	}//end of main
	/*****************************************************/
	
	//this method finds the total for all of the values in the thisYear array, then returns it back to the main method
	
	public static double totalRainFall(double[] thisYear) 
	{
		double sum = 0;
		for (int i=0;i<thisYear.length;i++) 
		{
			sum = thisYear[i]+ sum;
		}
		double sumOfRainFall = sum; 
		return sumOfRainFall;
	}//end of total rain fall method
	
	/***********************************************************/
	
	// this method finds in the array thisYear what the average value/average rainfall is, and returns it back to the main method 
	
	public static double averageRainFall(double[] thisYear) 
	{
		double sum = 0;
		for (int i=0;i<thisYear.length;i++) 
		{
			sum = thisYear[i]+ sum;
		}
		double sumOfRainFall = sum; 
		double averageRainFall = sumOfRainFall/(thisYear.length);
		return averageRainFall;
	}//end of total rain fall method
	
	/**************************************************************/
	
	// this method finds out in the array thisYear which number/month is the highest/maximum, and then returns it back to the main method
	
	public static double highestMonth(double[] thisYear) 
	{
		double highestMonth = 0;
		for (int i=0;i<thisYear.length;i++) 
		{
			if (highestMonth < thisYear[i]) 
			{
				highestMonth = thisYear[i];
			}
			else 
			{
				highestMonth = highestMonth;
			}
		}
		return highestMonth;
		
	}// end of highest month method
	
	/*******************************************************************/
	
	// this method finds out in the array thisYear which number/month is the lowest/minimum, and then returns it back to the main method
	
	public static double lowestMonth(double[] thisYear) 
	{
		double lowestMonth = 999999;
		for (int i=0;i<thisYear.length;i++) 
		{
			if (lowestMonth > thisYear[i]) 
			{
				lowestMonth = thisYear[i];
			}
			else 
			{
				lowestMonth = lowestMonth;
			}
		}
		return lowestMonth;
		
	} // end of lowest month method
	
	/*****************************************************************/
	
	//this method checks whether or not there is a negative number in the array thisYear which is located in the main method
	
	public static boolean negativeCheck(double[] thisYear) 
	{
		boolean valid = true;
		for (int i=0;i<thisYear.length;i++) 
		{
			if (0 > thisYear[i]) 
			{
				valid = false;
				return valid;
			}
			else 
			{
				valid = true;
			}
		}
		return valid;
	}
	
}//end of class
