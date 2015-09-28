package popup.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input and output
 * @author jelm9149
 *@version 1.0 9/24/15
 */
public class PopUpDisplay
{
	/**
	 * Provides a popup box for asking a question and allows the user to submit a text answer.
	 * Return the user response as a String.
	 * @param input The supplied question for the popup.
	 * @return The user's answer to the supplied question.
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
/**
 * It will show the entered text in a popup
 * @param input
 */
public void displayResponse (String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}