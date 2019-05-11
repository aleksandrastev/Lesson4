package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {

		boolean animalFarmOn = true;
		do {
			int animal = JOptionPane.showOptionDialog(null, "Which animal do you want?", "Animal Farm", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cow", "Duck", "Dog", "Cat", "Llama", "Pig" },
					null);
			if (animal == 0) {
				playMoo();
			} else if (animal == 1) {
				playQuack();
			} else if (animal == 2) {
				playWoof();
			} else if (animal == 3) {
				playMeow();
			} else if (animal == 4) {
				playLlama();
			} else if (animal == 5) {
				playOink();
			} else {
				System.exit(0);
			}
		} while (animalFarmOn);

	}

	void playMoo() {
		playNoise(mooFile); // the cow
	}

	void playQuack() {
		playNoise(quackFile); // the duck
	}

	void playWoof() {
		playNoise(woofFile); // the dog
	}

	void playMeow() {
		playNoise(meowFile); // the cat
	}

	void playLlama() {
		playNoise(llamaFile); // the llama
	}

	void playOink() {
		playNoise(oinkFile); // the pig
	}

	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";
	String oinkFile = "sound/oink.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
