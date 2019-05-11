package optional;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	public static void main(String[] args) {
		boolean on = true;
		while (on) {
			String sentence = JOptionPane.showInputDialog("Enter a sentence:");
			speak(sentence);
			if (sentence == null) {
				System.exit(0);
			}
		}
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
