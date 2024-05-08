/*********************************
 * CSC115
 * Assignment 2
 * Drew Kroeger
 *********************************/
//this program runs a sales prediction on the east coast division of a company, based on how much  money the company made as a whole
public class SalesPrediction 
{
	public static void main(String[]args)
	{
		double eastCoastPercent;  //this is the percentage of revenue the east coast division makes
		eastCoastPercent = 0.62;
		double totalSales;        //this is the amount in sales the company makes as whole
		totalSales = 4600000;
		double eastCoastRevenue;      //this is the amount the east coast division makes- based on the percentage of revenue, and the value of the total sales
		eastCoastRevenue = totalSales * eastCoastPercent;
		System.out.println("The East Coast Sales will generate $" + eastCoastRevenue + " If the company makes $" + totalSales + " this year.");
	}
		
}// end of class SalesPrediction
