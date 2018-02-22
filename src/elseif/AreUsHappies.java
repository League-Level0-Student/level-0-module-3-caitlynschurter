package elseif;

import javax.swing.JOptionPane;

public class AreUsHappies {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are Yous happies?");

		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keeps doing whatever you're doingz");
		}

		else if (answer.equals("no")) {
			answer = JOptionPane.showInputDialog("Do you wants to bes happies?");

			if (answer.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change somethings!");
			} else if (answer.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keeps doing whatever you're doingz");
				
			}
		}

	}

}
