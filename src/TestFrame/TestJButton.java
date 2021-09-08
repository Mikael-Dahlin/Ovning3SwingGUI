package TestFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author mikael
 * Class for testing swing GUI.
 */
public class TestJButton {
	
	/*
	 * Main method for running the program.
	 */
	public static void main(String[] args) {
		// Create components.
		Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
		JFrame frame = new JFrame();
		JButton button = new JButton("Calculate");
		JLabel label = new JLabel("2/5=?");
		JPanel panel = new JPanel();
		
		// Set frame settings.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Math & Input");
		frame.setIconImage(icon);
		frame.setSize(400, 400);
		
		// Set bounds on components.
		Dimension size = label.getPreferredSize();
	    label.setBounds(0, 65, size.width, size.height);
	    button.setBounds(40, 50, 200, 50);

	    // Add label to the panel and change background color.
	    panel.setLayout(null);
	    panel.add(label);
	    panel.setBackground(new Color(105, 105, 185));
	      
		// Add components to frame and set visible. 
		frame.add(button);
		frame.add(panel);
		frame.setVisible(true);
		
		// Add listener to the button. 
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(2.0/5.0);
			}
		});
	}

}
