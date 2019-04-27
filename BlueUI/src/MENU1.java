


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MENU1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public MENU1() {
		setBounds(232, 0, 472, 470);
		setBackground(Color.WHITE);
		setLayout(null);
		JLabel lblMenu = new JLabel("MENU 1");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblMenu.setForeground(new Color(0, 102, 255));
		lblMenu.setBounds(170, 11, 167, 80);
		add(lblMenu);
	}

}
