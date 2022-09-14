/*

Program: DivisibleBy3.java          Last Date of this Revision: 13-Sep-2022

Purpose: Create a DivisibleBy3 application that prompts the user for an integer and then displays a message when Check is clicked indicating whether the number is divisible by 3.

Author: Ashleen Sidhu 
School: CHHS
Course: Computer Programming 20
 
*/
package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DivisibleBy3 
{

	private JFrame frame;
	private JTextField tF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					DivisibleBy3 window = new DivisibleBy3();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleBy3() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		/* Create frame*/
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/* Create content pane*/
		JPanel panel = new JPanel();
		panel.setBounds(10, 24, 387, 214);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		/* Create a label to tell the user what to do*/
		JLabel lblEnterAnInteger = new JLabel("Enter an Integer: ");
		lblEnterAnInteger.setBounds(25, 37, 138, 20);
		panel.add(lblEnterAnInteger);
		
		/* Create textFeild for the user to enter an integer*/
		tF = new JTextField();
		tF.setBounds(173, 37, 187, 20);
		panel.add(tF);
		tF.setColumns(10);
		
		/* Create another label to display if the integer is divisible by 3*/
		JLabel divide = new JLabel(" ");
		divide.setBounds(173, 69, 187, 33);
		panel.add(divide);
		
		/* Create button to initiate and display the code*/
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(25, 74, 138, 23);
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int num;
				
				String integer = tF.getText();
				num = Integer.parseInt(integer);
				
				/* Display and calculate if the integer is divisible by 3*/
				if((num % 3) == 0) 
				{
					String divisable = "";
					divide.setText("Number is " + divisable + " divisable by 3.");
				}
				else 
				{
					String divisable = "not";
					divide.setText("Number is " + divisable + " divisable by 3.");
				}
				
				
			}
		});
		
	}
}
