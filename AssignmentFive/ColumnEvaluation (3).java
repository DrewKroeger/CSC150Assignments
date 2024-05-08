/***********************
 * CSC150
 * Column Evaluation- assignment 5
 *Drew Kroeger
 ***********************/
//this program takes a series of variables and does some math with them to determine whether or not a column is structurally safe
import java.util.Scanner;

public class ColumnEvaluation 
{
	public static void main(String[]args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		double width;                           //this is a variable that is to be input by the user, it is the height of a square wood beam
		double height;                          //this is a variable that is to be input by the user, it is the width/length of a SQUARE wood beam
		double load;                            //this is a variable that is to be input by the user, it is the amount of pounds of force to be applied to the beam
		double modulusOfElasticity = 1700000;   //this is a constant, it is important for  the equation/double maxLoadOne in order to operate
		double maxStress = 1450;                //this is a constant, it is important for  the equation/double maxLoadTwo in order to operate
		
		System.out.println("Enter column width in inches: ");
		width = stdIn.nextDouble();
		System.out.println("Enter column height in feet: ");
		height = stdIn.nextDouble();
		System.out.println("Enter column load in pounds: ");
		load = stdIn.nextDouble();
		
		double slendernessLimit = ((height * 12) / width);																			//this equation is to make sure the column is not too slender
		double maxLoadOne = (( .3 * modulusOfElasticity * (width * width)) / (((height * 12) / width) * ((height * 12)/width)));    //this equation is to prevent the column from buckling
		double maxLoadTwo = ((width * width )* maxStress);																			//this equation is to prevent the column from compressing
		
		
		if (slendernessLimit <= 50)
		{
			if (load <= maxLoadOne)
			{
				if (load <= maxLoadTwo)
				{
					System.out.println("The column is safe");
				}
				else 
				{
					System.out.print("The column is unsafe");
				}
			}
			else 
			{
				System.out.print("The column is unsafe");
			}
		}
		else 
		{
			System.out.println("The column is unsafe");
		}		
	}
	
}// end of Assignment5- Column Evaluation
