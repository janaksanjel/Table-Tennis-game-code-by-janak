

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	GamePanel panel;
	
	GameFrame()
	{
		panel = new GamePanel();
		add(panel);
		setTitle("Table Tennis ");
		setResizable(false);
		setBackground(Color.CYAN);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
public static void main(String[] args) {
		
		new GameFrame();
		
	}
}