package extras;

import javax.swing.JOptionPane;

public class PieeeeeeeeeeeeeeeeDay {
	public static void main(String[] args) {
		String Pie = ("3.14159265357983235");
		System.out.println("Pie");
		for (int i = 0; i < 4; i++) {
			System.out.print(Pie.charAt(i));
		}

		for (int i = 4; i < Pie.length(); i++) {

			String answer = JOptionPane.showInputDialog("What comes next?");
			if (answer.equals(Character.toString(Pie.charAt(i)))) {
				JOptionPane.showMessageDialog(null, "yah!");
				System.out.print(Pie.charAt(i));
			}

			else {
				JOptionPane.showMessageDialog(null, "Sorries! No Pies for you!");
				System.exit(0);
				;
			}

		}

	}

}
