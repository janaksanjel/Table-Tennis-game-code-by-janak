

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Homepage   implements ActionListener
{
	GamePanel panel = new GamePanel();
	JFrame frame =new JFrame("Table Tennis ");
	JButton buttonStartGame = new JButton("START ");
	JLabel textfield =new JLabel();
	JLabel label =new JLabel("Made by Janak");
	public Homepage()
	{
		
	frame.add(panel);	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1010,590);
	frame.getContentPane().setBackground(null);
	frame.setLayout(new BorderLayout());
	frame.setVisible(true);
    frame.add(buttonStartGame);
	frame.add(textfield);
	

	

	textfield.add(label);
	
	buttonStartGame.setBounds(450,400,100,70);
	buttonStartGame.addActionListener(this);
	buttonStartGame.setFocusable(false);
	buttonStartGame.setBackground(Color.green);
	

	label.setBounds(750,450,300,60);
	label.setFocusable(false);
	label.setBackground(Color.CYAN);
	label.setFont(new Font("",Font.BOLD,30));
	
	
	buttonStartGame.setFont(new Font("",Font.BOLD,18));
	textfield.setBackground(Color.CYAN);
	textfield.setForeground(Color.BLACK);
	textfield.setFont(new Font("",Font.BOLD,110));
	textfield.setHorizontalAlignment(JLabel.CENTER);
	textfield.setText("Table Tennis ");
	textfield.setOpaque(true);
	
	}
	
	public static void main(String[] args) 
	{
		 new Homepage();
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==buttonStartGame) 
		{
		    frame.dispose();
		    new GameFrame();
			
		}
		

		
	}

	
}


