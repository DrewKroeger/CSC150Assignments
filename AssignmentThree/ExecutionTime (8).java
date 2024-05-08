/*************************
 * CSC150
 * Execution Time- Assignment 3
 * Drew Kroeger
 *************************/
//this program compiles a series of numeric values to figure out the ideal execution time of a computer program
public class ExecutionTime 
{
	public static void main(String[]args)
	{
		double statementExecutions = 10000;          // this is the amount of statement executions that need to be processed
		double instructionsPerStatement = 20.0;      //amount of object code instructions per source code statement
		double instructionsPerCycle = 1.0;           //this is the amount of instructions per rotation of the processor
		double clockRate = 2000000000.0;                // this is the processors clock speed, in regular hertz per second
		double idealExecutionTime =  statementExecutions * instructionsPerStatement / (instructionsPerCycle * clockRate);
		//the previous line is the ideal execution time equation using the variables above
		System.out.println("Assumed executions of source-code statements: " + statementExecutions);
		System.out.println("Assumed average instructions per statement: " + instructionsPerStatement);
		System.out.println("Assumed clock rate in megahertz: " + clockRate / 1000000 + "MHz");
		System.out.println("Assumed average instructions/cycle: " + instructionsPerCycle);
		System.out.println("Ideal execution time: " + idealExecutionTime + " seconds.");
	}
	
}//end of assignment3- execution time
