import org.jointheleague.graphical.robot.Robot;
public class CheesePuffsAndValintines {


	
	public static void main(String[] args) {
		Robot cheezpuffs = new Robot();
		cheezpuffs.setWindowImage("PusheenBackround.jpg");
		cheezpuffs.miniaturize();
		cheezpuffs.setSpeed(500);
		cheezpuffs.penDown();
		cheezpuffs.setPenWidth(8);
		cheezpuffs.sparkle();
		
		for(int a=0;a<2;a++) {
			cheezpuffs.setAngle(0);
		for(int i=0;i<180;i++) {
		
			cheezpuffs.setPenColor(255,255,255);
			cheezpuffs.move(1);
			cheezpuffs.turn(1);
			
		}}
		
		cheezpuffs.setAngle(200);
		cheezpuffs.move(300);
		
		cheezpuffs.setAngle(335);
		cheezpuffs.move(300);
	}
	
	
	
}
