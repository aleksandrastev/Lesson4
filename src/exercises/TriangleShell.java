package exercises;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot robot = new Robot();

	void go() {

		robot.setSpeed(10);

		int length = 50;

		for (int i = 0; i < 60; i++) {

			robot.setRandomPenColor();

			length += 10;

			drawTriangle(length);

			robot.turn(6);
		}

	}

	private void drawTriangle(int length) {
		robot.penDown();

		for (int i = 0; i < 3; i++) {
			robot.move(length);
			robot.turn(120);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
