//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;
import org.jointheleague.graphical.robot.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot R2D2= new Robot();
		R2D2.sparkle();
		R2D2.miniaturize();
		R2D2.setSpeed(30);
		R2D2.penDown();
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would u like?");
		//4. Use an if/else statement to set the pen color that the user requested

		if(color.equals("red")) {
			R2D2.setPenColor(r, g, b);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        //5. If the user doesn’t enter anything, choose a random color

        //6. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		
		for(int i=0;i<4;i++) {
		R2D2.move(50);
		R2D2.turn(90);
		}
		
		
		
		

	}
}
