package chapter10;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class MetricConversion implements ActionListener
{
	private JFrame frame;
	JComboBox cB;
	JLabel convert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() 
	{
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
		panel.setBounds(10, 11, 281, 204);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Select a conversion type:");
		label.setBounds(20, 35, 239, 22);
		panel.add(label);
		
		convert = new JLabel(" ");
		convert.setBounds(20, 101, 239, 37);
		panel.add(convert);
		
		String[] types = {"inches to centimeters", "feet to meters", "gallon to liters", "pound to kilograms"};
		
		cB = new JComboBox(types);
		cB.setSelectedIndex(0);
		cB.addActionListener(this);
		cB.setSelectedIndex(0);
		cB.setBounds(20, 68, 239, 22);
		panel.add(cB);
		
	}

	public void actionPerformed(ActionEvent event) 
	{
		JComboBox comboBox = (JComboBox)event.getSource();
		String cB = (String)comboBox.getSelectedItem();
		
		if (cB == "inches to centimeters")
		{
			convert.setText("1 inch = 2.54 centimeters");
		}
		else if (cB == "feet to meters")
		{
			convert.setText("1 foot = 0.3048 meters");
		}
		else if (cB == "gallon to liters")
		{
			convert.setText("1 gallon = 4.5461 liters");
		}
		else if (cB == "pound to kilograms")
		{
			convert.setText("1 pound = 0.4536 kilograms");
		}
	}
}
