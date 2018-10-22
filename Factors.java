import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Factors

		System.out.println("Please enter a positive whole number");
		if (input.hasNextInt())
		{
			int numberTaken = input.nextInt();
			int factor1 = 1;
			int count =0;



			if (numberTaken <=0) System.out.println("Negative number not allowed.Try Again");

			else if (numberTaken >0) {
				System.out.print("The factors of "+numberTaken +" are ");
				for (  factor1 = 1 ; (factor1 <= numberTaken)   ; factor1++ )
				{
					int factor2 = numberTaken/factor1;
					if (numberTaken%factor1 ==0 && factor1<=factor2) {
					
					System.out.print(" "+factor1 + "x"+factor2 +",");
					count++; // used to calculate prime or not
					}
				}
			}

			
			//PRIME OR NOT PRIME
			if (numberTaken >0) { //If negative number tell they can't be a prime number

				if (count ==1 ) // if count =1 then no more than 2 factors i.e. prime number
				{System.out.println(" And "+numberTaken +" is a prime number");
				}
				else System.out.println(" And "+numberTaken+" is not a prime number");
			}

			else { System.out.println("Negative numbers are not prime nor composite.");}


		}
		else System.out.println("Not a number. Try Again");



	}
}





