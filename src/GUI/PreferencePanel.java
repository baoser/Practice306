package GUI;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class PreferencePanel extends JPanel{
	private JRadioButton musicButton, noMusicButton;
	public PreferencePanel() {
		musicButton = new JRadioButton("Music");
		noMusicButton = new JRadioButton("No Music");
		//Set no smoke as the default
		noMusicButton.setSelected(true);
		//Add the buttons to the panel
		add(musicButton);
		add(noMusicButton);
		ButtonGroup group = new ButtonGroup();
		group.add(musicButton);
		group.add(noMusicButton);
		setBorder(new TitledBorder (new EtchedBorder(), "Preferences"));
		setLayout(new GridLayout(2, 1));
	}
}
