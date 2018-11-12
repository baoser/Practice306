package GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FirstGUI extends JFrame{
	
	private JTextField myName;
	private FirstGUI gui;
	
	public FirstGUI() {
		setTitle("My First GUI");
		setSize(300, 300);
		// EXIT_ON_CLOSE is static int
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createLayout();
	}
	
	private void createLayout() {
		JPanel panel = new JPanel();
		//label
		JLabel nameLabel = new JLabel("Name");
		//text field, whatever is entered will be stored in myName
		myName = new JTextField(20);
		panel.add(nameLabel);
		panel.add(myName);
		//Add the panel to the layout
		add(panel, BorderLayout.CENTER);
		JButton nameButton = new JButton("OK");
		add(nameButton, BorderLayout.SOUTH);
		nameButton.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int ready = JOptionPane.showConfirmDialog(null, "Are you ready to continue?");
			
			if (ready == JOptionPane.YES_OPTION)
				JOptionPane.showMessageDialog(gui, "Here we go!");
			else
				JOptionPane.showMessageDialog(gui, "We'll wait");
		}
	}
	
	//MAIN
	public static void main(String[] args) {
		FirstGUI gui = new FirstGUI();
		gui.setVisible(true); 
	}

}
