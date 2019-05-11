package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	Robot robot = new Robot("mini");

	private void set() {
		robot.penDown();
		robot.setSpeed(10);
		robot.setRandomPenColor();
		robot.setPenWidth(5);
		robot.setPos(new Random().nextInt(700) + 100, new Random().nextInt(500) + 100);
	}

	private void drawCircle() {
		set();
		robot.penDown();
		robot.setSpeed(10);
		for (int i = 0; i < 360; i++) {
			robot.turn(1);
			robot.move(1);
		}
		robot.hide();
	}

	private void drawSqare() {
		set();
		robot.penDown();
		robot.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			robot.move(90);
			robot.turn(90);
		}
		robot.hide();
	}

	private void drawTriangle() {
		set();
		robot.penDown();
		robot.setSpeed(10);
		for (int i = 0; i < 3; i++) {
			robot.move(150);
			robot.turn(120);
		}
		robot.hide();

	}

	public static void main(String[] args) {
		int repeat;
		do {
			int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot",
					0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
			if (shape == 1) {
				new ObedientRobot().drawSqare();
			} else if (shape == 2) {
				new ObedientRobot().drawTriangle();
			} else if (shape == 0) {
				new ObedientRobot().drawCircle();
			}
			repeat = JOptionPane.showConfirmDialog(null, "Do you want to draw another shape?");

		} while (repeat == 0);
	}

}