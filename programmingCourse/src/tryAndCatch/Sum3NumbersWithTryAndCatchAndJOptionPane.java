package tryAndCatch;

import javax.swing.JOptionPane;

public class Sum3NumbersWithTryAndCatchAndJOptionPane {

	public static void main(String[] args) {

		double sum = 0;
		for (int i = 0; i <= 2; i++) {
			String text = JOptionPane.showInputDialog("Enter a number?");
			double temp = 0;
			try {
				temp = Double.parseDouble(text);
			} catch (NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "please give an integer number", "wrong input ",
						JOptionPane.INFORMATION_MESSAGE);
				i--;
			}
			sum = temp + sum;
		}
		JOptionPane.showMessageDialog(null, "the sum of the three numbers is:" + sum, "result of the sum",
				JOptionPane.INFORMATION_MESSAGE);

		double temp2 = 0;
		double result = 0;
		for (int i = 0; i < 1; i++) {
			String text2 = JOptionPane.showInputDialog("Enter a number to multiply sum with ?");
			try {
				temp2 = Integer.parseInt(text2);
			}

			catch (NumberFormatException error) {
				JOptionPane.showMessageDialog(null, "please give an integer number", "wrong input ",
						JOptionPane.INFORMATION_MESSAGE);
				i--;
				JOptionPane.showMessageDialog(null, "the sum of the three numbers is not possible to calculate ",
						"try again", JOptionPane.INFORMATION_MESSAGE);
			}

		}

		result = sum * temp2;

		JOptionPane.showMessageDialog(null, "the multip of the three numbers is " + result, "Good job",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
