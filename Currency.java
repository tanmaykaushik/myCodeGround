/*  SELF ASSESSMENT
		   1. Did I use appropriate CONSTANTS instead of numbers within the code?
		       Mark out of 10:   10
		       Reason: Specified all the constants on top.

		   2. Did I use easy-to-understand, meaningful CONSTANT names?
		       Mark out of 5:  5
		       Reason: All the constant are easily understandable
		    3. Did I format the CONSTANT names properly (in UPPERCASE)?
		       Mark out of 5: 5 
		   4. Did I use easy-to-understand meaningful variable names?
		       Mark out of 10:10 Yes. and if any confusion, comments are also added
		   5. Did I format the variable names properly (in lowerCamelCase)?
		       Mark out of 10: 10 Yes
		   6. Did I indent the code appropriately?
		       Mark out of 10:  10
		   7. Did I read the input correctly from the user using (an) appropriate question(s)?
		       Mark out of 10:  10
		   8. Did I compute the answer correctly for all cases?
		       Mark out of 20:  20
		   9. Did I output the correct answer in the correct format (as shown in the examples)?
		       Mark out of 10:  10
		   10. How well did I complete this self-assessment?
		       Mark out of 10:  10
		   Total Mark out of 100 (Add all the previous marks):  100
 */







import java.util.Scanner;

import javax.swing.JOptionPane;

public class Currency {
	final static int OLD_PENNY_TO_NEW_PENNY = 67;
	final static int OLD_SHILLING_TO_OLD_PENNY = 12;
	final static int OLD_POUND_TO_OLD_SHILLING = 20;
	final static int NEW_POUND_TO_NEW_PENNY = 100;



	public static void main(String[] args) {




		String input = JOptionPane.showInputDialog("How many old pennies do you have?");

		Scanner inputScanner = new Scanner( input );

		double oldPennies = inputScanner.nextDouble();


		input = JOptionPane.showInputDialog("How many old shillings do you have?");

		inputScanner = new Scanner( input );
		double oldShillings = inputScanner.nextDouble();


		input = JOptionPane.showInputDialog("How many old pounds do you have?");

		inputScanner = new Scanner ( input);

		double oldPounds = inputScanner.nextDouble();


		double poundConversion = OLD_POUND_TO_OLD_SHILLING * OLD_SHILLING_TO_OLD_PENNY* 
				OLD_PENNY_TO_NEW_PENNY * oldPounds; // old pounds into new pennies

		double shillingConversion = OLD_SHILLING_TO_OLD_PENNY* OLD_PENNY_TO_NEW_PENNY *oldShillings;
		                                            // old shillings into new pennies

		double pennyConversion = OLD_PENNY_TO_NEW_PENNY * oldPennies; 
		                                           // old pennies into new pennies

		double newPennies = poundConversion + shillingConversion+ pennyConversion;
		                                          // Adding all conversion into penny together
		                                             

		double newCurrency = newPennies / NEW_POUND_TO_NEW_PENNY; 
		                                         // converting pennies into pounds




		JOptionPane.showMessageDialog(null,oldPounds+" old pound, "  +oldShillings+" old shilling,  " 
				+oldPennies+" old pence" +"= £"+newCurrency);
		                                        //Final Result




	}

}
