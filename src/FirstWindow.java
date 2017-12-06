import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstWindow extends JFrame{
	
	
	public FirstWindow() {
		super("Eli is Freaking Awesome");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		JPanel p = new JPanel();
		p.setBackground(Color.BLUE);
		
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.RED);
		
		JPanel p3 = new JPanel(new GridBagLayout() );
		p3.setBackground(Color.YELLOW);
		
		JPanel p4 = new JPanel(new GridBagLayout());
		p4.setBackground(Color.GREEN);
		
		JPanel p5 = new JPanel(new GridBagLayout());
		p5.setBackground(Color.MAGENTA);
		
		JButton b1 = new JButton("button 1");
		b1.setBackground(Color.RED);
		JButton b2 = new JButton("button 2");
		b2.setBackground(Color.YELLOW);
		JButton b3 = new JButton("button 3");
		JButton b4 = new JButton("button 4");
		JButton b5 = new JButton("button 5");
		JButton b6 = new JButton("button 6");
		JButton b7 = new JButton("button 7");
		JButton b8 = new JButton("button 8");
		
		JCheckBox cb1 = new JCheckBox ("Do you Like Bacon"); 
		cb1.setBackground(Color.GRAY);
		JCheckBox cb2 = new JCheckBox ("Do you Like JAVA?");
		Color myNewColor = new Color (150, 100, 250, 100);
		cb2.setBackground(myNewColor);
		JCheckBox cb3 = new JCheckBox ("Whovian?"); 
		cb3.setBackground(Color.GRAY);
		JCheckBox cb4 = new JCheckBox ("Trekkie?"); 
		cb4.setBackground(Color.GRAY);
		JCheckBox cb5 = new JCheckBox ("Jedi?"); 
		cb5.setBackground(Color.GRAY);
		JCheckBox cb6 = new JCheckBox ("Tardis?");
		cb6.setBackground(Color.GRAY);
		JCheckBox cb7 = new JCheckBox ("USS Enterprise?"); 
		cb7.setBackground(Color.GRAY);
		JCheckBox cb8 = new JCheckBox ("Death Star?"); 
		cb8.setBackground(Color.GRAY);

		JLabel myLabel = new JLabel("Fancy label!");
		JTextArea myTextArea = new JTextArea("Fancy Text Area!");
		JTextField myTextField = new JTextField("Fancy Text Field");
		
		GridBagConstraints gbc = new GridBagConstraints();				
		gbc.insets = new Insets(15, 15, 15, 15);														
		
		
		
		p.add(b1);
		p.add(b2);
		p2.add(cb1);
		p2.add(cb2);
		gbc.gridx = 1;
		gbc.gridy = 0;
		p3.add(myLabel, gbc);
		gbc.gridx = 2;
		gbc.gridy = 0;
		p3.add(myTextArea, gbc);
		gbc.gridx = 3;
		gbc.gridy = 0;
		p3.add(myTextField, gbc);
		gbc.gridx = 0;
		gbc.gridy = 0;
		p5.add(cb3, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p5.add(cb4,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p5.add(cb5, gbc);
		gbc.gridx = 0;
		gbc.gridy = 3;
		p4.add(cb6, gbc);
		gbc.gridx = 0;
		gbc.gridy = 0;
		p4.add(cb7, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p4.add(cb8,gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;

		
		
		add(p,BorderLayout.NORTH);					
		add(p2,BorderLayout.SOUTH);
		add(p3,BorderLayout.CENTER);	
		add(p4,BorderLayout.EAST);
		add(p5,BorderLayout.WEST);	
		
		
		
		setVisible(true);
	}//end of constructor
	

	
	
	
	
	
	
}//end of class FirstWindow
