package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		int robX = 50;
		int robY = 550;
		int red = 100;
		int green = 200;
		int blue = 300;
		Random ran = new Random();
		// center = 550
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot("mini");
			robots[i].setY(robY);
			robots[i].setX(robX);
			robX += 200;
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while (robY >= 140) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].setSpeed(10);
				robots[i].move(ran.nextInt(50));
				robY = robots[i].getY();
				if (140 > robots[i].getY()) {
					System.out.println("The winner is " + i);
					Robot r = new Robot();
					r.setX(robots[i].getX());
					r.setY(robots[i].getY());
					robots[i].sparkle();
					for (int j = 0; j < 50; j++) {
					robots[i].setWindowColor(red, green, blue);
					red+=25;
					green+=10;
					blue-=35;
					}
					
					
					break;
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}

}