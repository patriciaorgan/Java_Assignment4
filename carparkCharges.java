import java.util.*; //import this class for the use of Scanner
public class carparkCharges {

	/**Patricia Organ - 01110489  - Assignment 4 Q2
	 * A car park charges a �5.00 minimum to park for up to three hours.
	 * The car park charges an additional �1.50 per hour for each hour or
	 * part thereof in excess of three hours.  The maximum for any given
	 * 24-hour period is �25.00.  Assume that no car parks for longer than
	 * 24 hours at a time. Write an application that calculates and displays
	 *  the parking charges for each customer who parked in the garage yesterday.
	 *  You should enter the hours parked for each customer.  The program should
	 *  display the charges for the current customer and should calculate and display
	 *  the running total of yesterday�s receipts.  It should use a method calculateCharges
	 *   to determine the charges for each customer.
	 */
	public static void main(String[] args) {

		// declare variables and initializing them
		// making assumption that the user can enter a double for the hours eg 5.5 hours
		double total = 0.0;
		double charge = 0.0;
		double hoursD = 0.0;
		int hours = 0;

		//create a scanner object
		Scanner input = new Scanner(System.in);

		// using a do while loop to run through the code first time and then to continue
		// until the exit option -1 is chosen
		do{
			//ask user to enter number of hours and store them in hoursD variable
			System.out.print("Enter number of hours (-1 to quit): ");
			hoursD = input.nextDouble();
			// only calculate and output result if the choice was not -1
			if (hoursD!= -1){
				// based on assumption that double is allowed need to calculate
				// or round up the value as any part of an hour is considered a full hour of charge
				// I use the math class here to round up and cast the result to int to store in hours variable
				hours = (int)Math.ceil(hoursD);

				//call the method to calculate the charge
				charge = CalculateCharge(hours);

				//as the loop iterates we add the total of the charges each time
				total += charge;

				//output, using the printf to format the display, to user the current charge and current running total
				System.out.printf("Current charge: �%.2f, Total receipts: �%.2f\n", charge,total);

			}else{
				// this condition means you break out of the loop no output required
				break;
			}

		}while (hoursD != -1);
		input.close(); // close the scanner object
	}// end main

/*
	public static double CalculateCharge(int hours){
		//local variable called charge will have a default initial value of 5
		//also take in a local variable called hours
		double charge = 5.0;
		if (hours <= 3){
			return charge;
		}else{
			//if hours greater than 3 then calculate the charge after 3 hours but add it to the already
			//Initialized charge of 5
			charge += ((hours - 3) * 1.5);
			// but as the charge has a max we need to make sure to return only 25 if it goes over that value
			if (charge > 25){
				return 25.0;
			}else{
				return charge;

			}//end inner if else
		}// end if else

	}// end method CalculateCharge
*/
public static double ClaculateCharge(int hours){
	double charge = 5.0;
	if (hours >3){
		charge += ((hours -3)* 1.5);
		if (charge >25){
			charge = 25;
		}
		return charge;
	}
}
}//end Class carparkCharges
