package nubos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	public Main() {
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //Execute the code on the event dispatch thread that handles GUI events.
			public void run() {
				//Create "try and catch" method to perform exceptional conditions or errors during the program execution.
				try { 
					LoginPage frame = new LoginPage(); //Create instance for "LoginPage" and assign to variable "frame".
					frame.setVisible(true); //Sets the visibility of the variable "frame".
				} catch (Exception e) {
					e.printStackTrace(); //Prints the exception stack trace to the standard error stream.
				}
			}
		});
	}
}
