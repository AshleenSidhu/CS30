package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class MC 
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MC window = new MC();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 25, 283, 225);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnter = new JLabel("Enter:");
		lblEnter.setBounds(57, 51, 46, 14);
		panel.add(lblEnter);
		
		JComboBox cB = new JComboBox();
		cB.setBounds(57, 76, 138, 22);
		panel.add(cB);
		
		JLabel convert = new JLabel("");
		convert.setBounds(57, 134, 46, 14);
		panel.add(convert);
	}

}
