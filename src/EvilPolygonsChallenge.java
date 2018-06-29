import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot dank=new Robot();
		//2. Set the speed to 100
dank.setSpeed(5000);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"red","green", "blue"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0) {
			dank.setPenColor(255,0,0);
		}
		else if(colorChoice==1) {
			dank.setPenColor(0,255,0);
		}
		else if(colorChoice==2) {
			dank.setPenColor(0,0,255);
		}
		dank.penDown();
		String t=JOptionPane.showInputDialog("how many polygons?");
		int g=Integer.parseInt(t);
		for(int n=0;n<g;n++) {
			dank.penDown();
			for(int r=0;r<4;r++) {
				dank.move(20);
				dank.turn(90);
			}
			dank.penUp();
			Random gen=new Random();
			int q=gen.nextInt(181)-90;
			dank.turn(q);
		dank.move(50);
		
		}
		dank.move(500);
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

