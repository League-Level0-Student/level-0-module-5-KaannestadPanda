
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
	public static void main(String[] args) throws Exception {
		System.out.println("hi");
		// 1. Make a new Robot
		Random gen = new Random();
		int ja = 0;
		
		Robot Rob = new Robot();
		Rob.setX(150);
		Rob.setY(200);
		Rob.setRandomPenColor();
		Rob.setPenWidth(ja);
		Rob.penDown();
		Rob.setSpeed(500);
		for (int i = 0; i < 360; i++) {
			Rob.setRandomPenColor();
			//ja = gen.nextInt(7000);
			Rob.setPenWidth(7000000);
			Rob.move(3);
			Rob.turn(1);
			if (i % 20 == 0) {
				for (int j = 0; j < 360; j++) {
					Rob.setRandomPenColor();
					//ja = gen.nextInt(7000);
					Rob.setPenWidth(7000000);
					Rob.move(1);
					Rob.turn(1);
				}
			}

		}
		// 2. Set your robot’s position to x=150 and y=200

		// 3. Put the robot's pen down

		// 4. Set the robot’s speed to 10

		// 5. Do everything below here 360 times (use i as the counter)

		// 6. Move the robot 3 pixels

		// 7. Turn the robot 1 degree

		// 8. If the counter i is divisible by 20 (hint: use mod operator %)..

		// 9. do steps 10 and 11 exactly 360 times (use j as the counter)

		// 10. Move the robot 1 pixel

		// 11. Turn the robot 1 degree
	}
}
