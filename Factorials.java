import java.util.Scanner;

import javax.swing.JOptionPane;

public class Factorials {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		JOptionPane.showInputDialog("Enter a number");
		int number = scanner.nextInt();
		
		int factorial = 1;
		for ( int count= 2 ; (count<= number); count++){
			  factorial = number * count;
			  JOptionPane.showMessageDialog(null, "The factorial of the number "+number);
				
		}

	}

}
