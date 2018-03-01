//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Iterator;
import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
	
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		
		
		
		// 11. Repeat steps 1 to 10 ten times
		
		for (int i = 0; i < 10; i++) {
		
			
				
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 

		String guess = JOptionPane.showInputDialog("Please put your guess in this magical guessing box");
		
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			
		int myGuess = Integer.parseInt(guess);
		
			// 5. if the guess is correct
			// 6. Win
			// 11. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		
		if(myGuess==random) {
		JOptionPane.showMessageDialog(null, "YOU WIN!!! \n YA!!! \n :D");
		System.exit(0);
		}
			
			// 7. if the guess is high
			// 8. Tell them it's too high
		
		else if(myGuess > random) {
		JOptionPane.showMessageDialog(null, "Very sorry. I is afraid dat's too high \n :'(");
		}
		
				
			// 9. if the guess is low
			// 10. Tell them it's too low

		else if(myGuess < random) {
		JOptionPane.showMessageDialog(null, "Very sorry. I is afraid dat's too low \n :'(");
		}
		
		}	

		// 12. Tell them they lose
		
	
		JOptionPane.showMessageDialog(null, "Man... u must really suck or something. \n I gave you like 10 guesses... wut?!");
		
	}

}


