package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class EmailSender {

	void go() {

		emailAddress = JOptionPane.showInputDialog("Enter e-mail address:");
		greeting = JOptionPane.showInputDialog("Enter message:");
		setEmailAddress(emailAddress);
		send(greeting);
		if (send(greeting) == false) {
			JOptionPane.showMessageDialog(null, "Delivery failed");
		} else {
			JOptionPane.showMessageDialog(null, "Message sent");
		}

	}

	boolean send(String greeting) {
		if (this.emailAddress.isBlank()) {
			System.err.println("You did not provide a recipient for the email!");
			return false;
		}
		return new Random().nextBoolean();
	}

	private String emailAddress = "";
	private String greeting = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
