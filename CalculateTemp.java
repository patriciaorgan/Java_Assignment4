import java.util.*; //import this class for the use of Scanner
public class CalculateTemp {

	/** Patricia Organ - 01110489 - Assignment 4 Q1
	 * An application that allows the user to enter a Fahrenheit 
	 * temperature and displays the Celsius equivalent or enter 
	 * a Celsius temperature and displays the Fahrenheit equivalent.
	 */
	public static void main(String[] args) {
		// main method will call the two other methods when required 
		//based on choice made in the input from user
		
		//declare the variables required choosing double for the temperature input to allow for decimal options
		double value, result;
		int choice;
		
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		do{ // using a do while loop so the choice to the user will reappear for more entries
			
			//output text choices and read in the number chosen
			System.out.print(  "1. Fahrenheit to Celsius\n"
								+"2. Celsius to Fahrenheit\n"
								+"3. Exit\n" 
								+"Choice: ");
			choice = input.nextInt();
			
			
			//use a switch to traverse the choices made by user
			switch (choice){
				// if 1 or 2 is chosen ask user for temprature value and then
				//call the appropriate method to calculate temperature and output result
					//allowing user to enter in a double and casting to an int to round the result 
					//to appear as displayed in required output
				case 1: { 
					System.out.print("Enter temperature: ");
					value = input.nextDouble();
					result = Celsius(value);
					System.out.println((int)value + " Fahrenheit is " +(int)result + " Celsius\n");
					break;
				}
				case 2:{
					System.out.print("Enter temperature: ");
					value = input.nextDouble();
					result = Fahrenheit(value);
					System.out.println((int)value + " Celsius is " +(int)result + " Fahrenheit\n");
					break;
				}
				case 3:{
					System.out.println("Program Terminated");
					break;
				}
				default:{
					//this is to cater for if the user entered any other value other then requested 
					//but allows the user to loop again
					System.out.println("Invalid Entry\n");
					break;
				}
			}//end switch
			
			
		}while(choice != 3); // only if the user chooses 3 does the program exit as suggested in output text
		input.close();// close the scanner object
		
	}//end main
	
	//method to calculate fahrenheit when given a celsius value passed as double
	public static double Celsius(double fahrenheit){
		//declare and initialize local variable whilst calculating to keep short and neat
		double result = 5.0/9.0 * (fahrenheit - 32);
		return result;
	}
	
	//method to calculate celsius when given a fahrenheit value passed as double
	public static double Fahrenheit(double celsius){
		//declare and initialize local variable whilst calculating to keep short and neat
		double result = 9.0/5.0 * celsius + 32;
		return result;
	}
}//end Class CalculateTemp
