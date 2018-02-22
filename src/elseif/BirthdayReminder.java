
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "Aug 23";
		String dadsBirthday = "May 20";
		String myBirthday = "Aug 17";
		String sisBirthday = "Dec 29";
		
		// 2. Find out which birthday the user wants and and store their response in a variable
	
		String name = JOptionPane.showInputDialog("What bday would u like to see?");
		
		if(name.equals("mom")){
		JOptionPane.showMessageDialog(null, "mom's bday's is " + momsBirthday);
		}
		
		else if(name.equals("dad")){
			JOptionPane.showMessageDialog(null, "dad's bday's is " + dadsBirthday);
			}
		
		else if(name.equals("me")){
			JOptionPane.showMessageDialog(null, "my bday's is " + myBirthday);
			}
		
		else if(name.equals("sis")){
			JOptionPane.showMessageDialog(null, "sis's bday's is " + sisBirthday);
			}
		
		else if(name.equals("da secret password")){
			JOptionPane.showMessageDialog(null, "Congrats! Your have guessed the SUPER SECRET PASSWORD! \n Do you want to know what you won? \n Enter WINNER next time you enter something");
			}
		else if(name.equals("WINNER")){
			JOptionPane.showMessageDialog(null, "Congrats!\n \n \n \n \n  You won a sad feeling!");
			}
		
		else {
		JOptionPane.showMessageDialog(null, "sorry... idk dat birthday");
		}
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
