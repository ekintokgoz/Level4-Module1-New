package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception{

	public static void scaryPopup() {
		JOptionPane.showMessageDialog(null, "You triggered a critical error in the computer");
		
	}
	
	public static void testPositive(int x) throws NegativeNumberException {
		if (x < 0) {
			throw new NegativeNumberException();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			testPositive(-2);
		} catch (NegativeNumberException e) {
			scaryPopup();
		} finally {
			JOptionPane.showMessageDialog(null, "Your computer is ok!");
		}
		
	}
}
