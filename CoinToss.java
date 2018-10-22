import java.util.Random;

import javax.swing.JOptionPane;

public class CoinToss {
	final static int TOTAL_NUMBER_OF_TOSSES = 10000 ;
    final static int HEADS = 1;
    final static int TAILS = 0;

	public static void main(String[] args) {

		Random generator = new Random();
		int coinToss = 0;
		int heads=0;
		for (  int count =0; ( count < TOTAL_NUMBER_OF_TOSSES  ) ; count++ ) {
			coinToss = generator.nextInt(2);

			if ( coinToss == HEADS ) 
			{
				heads += coinToss ;

			}
			
		
		
	}
		JOptionPane.showMessageDialog(null,"Heads" + heads +"\n Tails" +(10000 - heads)  );
		JOptionPane.showMessageDialog(null, "Last:" +((coinToss == 1) ? "Heads" : "Tails"));
	}
}


