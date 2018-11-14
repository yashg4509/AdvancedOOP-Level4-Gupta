package _01_03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(input) {
			case 0:
				JOptionPane.showMessageDialog(null, "Finish all your homework lol");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Welcome to the school week!");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Almost...half way...through...the...school week!");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "HUMP DAY!");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Get ready for quizzes/tests tommorow! Hope you did well on the ones you had today!");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Good luck on your tests/quizzes!");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Time for the weekend!");
				break;
		}
	}
}
