import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What do other people use more than you but it is yours?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals("my name")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "Wrong! the answer is Your Name.");
		}
		// 6. Add some more riddles
		String answer2 = JOptionPane
				.showInputDialog("Poor people have it. Rich people need it. If you eat it you die. What is it?");

		if (answer2.equals("nothing")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong! The answer is 'nothing'.");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}
