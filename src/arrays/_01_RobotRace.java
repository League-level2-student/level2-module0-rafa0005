package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		
		
		// 2. create an array of 5 robots.
		Robot[] robs = new Robot[5];
		// 3. use a for loop to initialize the robots.

		for (int i = 0; i < robs.length; i++) {

			robs[i] = new Robot();

			robs[i].penDown();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robs[i].setY(550);
			robs[i].setX(150 + i * 150);
			robs[i].setSpeed(10);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random ran = new Random();
		int winner = 0;
	RACE:	while (true) {

			for (int i = 0; i < robs.length; i++) {

				robs[i].move(ran.nextInt(50));
				if(robs[i].getY() < 30) {
					winner = i;
					break RACE;
				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
	
	
		// 7. declare that robot the winner and throw it a party!
			JOptionPane.showMessageDialog(null, "robot number " + winner + " won");
			
			while (true) {
				robs[winner].turn(360);
			}
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
