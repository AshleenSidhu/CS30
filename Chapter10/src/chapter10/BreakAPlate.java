package chapter10;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Component;

public class BreakAPlate 
{
	static final String FIRST_PRIZE = "tiger plush";
	static final String CONSOLATION_PRIZE = "sticker";
	JFrame frame;
	JPanel panel;
	JLabel plates, prizeWon;
	JButton play;

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
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon platesPic = new ImageIcon("src/plates.gif");
		
		frame = new JFrame("BreakAPlate");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 11, 414, 183);
		panel.setBackground(Color.white);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		frame.getContentPane().add(panel);
		prizeWon.setBorder(BorderFactory.createEmptyBorder(10, 10 , 20 , 10));
		
		plates = new JLabel(platesPic);
		plates.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		plates.setAlignmentX(0.5f);
		plates.setBounds(171, 48, 46, 14);
		panel.add(plates);
		
		prizeWon = new JLabel(" ");
		prizeWon.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		prizeWon.setBorder(BorderFactory.createEmptyBorder(20, 0 , 0 , 0));
		prizeWon.setBounds(171, 202, 46, 14);
		panel.add(prizeWon);
		
		play = new JButton("Play");
		play.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		play.setActionCommand("Play");
		play.setAlignmentX(JButton.CENTER_ALIGNMENT);
		play.setBounds(150, 146, 89, 23);
		panel.add(play);
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		String prize;
		
		if( == "Play")
		{
		if(prize.equals(FIRST_PRIZE))
		{
			plates.setIcon(new ImageIcon("C:\\\\Users\\\\1005106504\\\\git\\\\CS30\\\\Chapter10\\\\src\\\\chapter10\\\\plates.gif"));
		}
		else if (prize.equals(CONSOLATION_PRIZE))
		{
			plates.setIcon(new ImageIcon(""));
		}
		
		prizeWon.setText("You win: " + prize);
		play.setText("Play Again");
		play.setActionCommand("Play Again");
		
		}
		else if ( == "Play Again")
		{
			plates.setIcon(new ImageIcon(""));
			prizeWon.setText(" ");
			play.setText("Play");
			play.setActionCommand("Play");
		}
		
	}
}
