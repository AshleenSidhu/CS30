package chapter10;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DivisableBy3GUI extends JFrame 
{
	private JFrame frame;
	private JPanel contentPane;
	private JTextField Int;

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
					DivisableBy3GUI frame = new DivisableBy3GUI();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DivisableBy3GUI() 
	{
		frame = new JFrame("DivisableBy3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		/* Create content pane*/
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter an Integer:");
		lblNewLabel.setBounds(10, 29, 153, 20);
		panel.add(lblNewLabel);
		
		Int = new JTextField();
		Int.setBounds(135, 29, 86, 20);
		panel.add(Int);
		Int.setColumns(10);
		
		JButton divisableButton = new JButton("Check");
		divisableButton.setActionCommand("Check");
		divisableButton.addActionListener(this);
		divisableButton.setBounds(10, 62, 89, 23);
		panel.add(divisableButton);
		
		JLabel divide = new JLabel(" ");
		divide.setBounds(135, 60, 86, 20);
		panel.add(divide);
		
		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);
		
	}
	
		public void actionPerformed(ActionEvent event) 
		{
			String eventName = event.getActionCommand();
			
			for()
		}
}
