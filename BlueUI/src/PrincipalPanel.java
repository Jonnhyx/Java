



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalPanel extends JFrame {

	
	private JPanel contentPane;
	private	MENU1 menu1 = new MENU1();
	private	MENU1 menu2 = new MENU1();
	private	MENU1 menu3 = new MENU1();
	private	MENU1 menu4 = new MENU1();
	private int x;
    private int y;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalPanel frame = new PrincipalPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalPanel() {
		setFocusable(false);
		setAutoRequestFocus(false);
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 470);
		contentPane = new JPanel();
		contentPane.setFocusable(false);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setFocusable(false);
		panel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				Point point = MouseInfo.getPointerInfo().getLocation();
                setLocation(point.x - x, point.y - y);
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x = e.getX();
                y = e.getY();
			}
		});
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 704, 470);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("X");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label.setBounds(687, -11, 17, 42);
		label.setForeground(new Color(0, 102, 255));
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(label);
		
		JPanel panel_Lateral = new JPanel();
		panel_Lateral.setFocusable(false);
		panel_Lateral.setBounds(0, 0, 232, 470);
		panel_Lateral.setBackground(new Color(0, 102, 255));
		panel.add(panel_Lateral);
		panel_Lateral.setLayout(null);
		
		
		
		JLabel lblChecker = new JLabel("Jonnhy'x");
		lblChecker.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		lblChecker.setForeground(Color.WHITE);
		lblChecker.setBounds(92, 39, 122, 33);
		panel_Lateral.add(lblChecker);
		
		JPanel panel_contenedor = new JPanel();
		panel_contenedor.setBounds(232, 0, 472, 470);
		panel_contenedor.setBackground(Color.WHITE);
		panel.add(panel_contenedor);
		panel_contenedor.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(menu2.isVisible())
				{
					menu2.setVisible(false);
					panel_contenedor.setVisible(true);
				}
				else if(menu1.isVisible())
				{
					menu1.setVisible(false);
					panel_contenedor.setVisible(true);
				}
				else if(menu3.isVisible())
				{
					menu3.setVisible(false);
					panel_contenedor.setVisible(true);
				}
				else if(menu4.isVisible())
				{
					menu4.setVisible(false);
					panel_contenedor.setVisible(true);
				}
				else
				{
					panel_contenedor.setVisible(true);
				}
			}
		});
		label_1.setIcon(new ImageIcon(PrincipalPanel.class.getResource("/img/icons8-active-directory-filled-50.png")));
		label_1.setBounds(10, 22, 50, 50);
		panel_Lateral.add(label_1);
		
		JButton btnMenu1 = new JButton("          MENU 1");
		btnMenu1.setFocusable(false);
		btnMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.add(menu1);
				if(menu2.isVisible())
				{
					menu2.setVisible(false);
					menu1.setVisible(true);
				}
				else if(panel_contenedor.isVisible())
				{
					panel_contenedor.setVisible(false);
					menu1.setVisible(true);
				}
				else if(menu3.isVisible())
				{
					menu3.setVisible(false);
					menu1.setVisible(true);
				}
				else if(menu4.isVisible())
				{
					menu4.setVisible(false);
					menu1.setVisible(true);
				}
				else
				{
					menu1.setVisible(true);
				}
				
			}
		});
		btnMenu1.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu1.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnMenu1.setIcon(new ImageIcon(PrincipalPanel.class.getResource("/img/producto.png")));
		btnMenu1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu1.setBorder(null);
		btnMenu1.setBounds(10, 100, 204, 50);
		btnMenu1.setBackground(new Color(0, 102, 255));
		btnMenu1.setForeground(Color.WHITE);
		panel_Lateral.add(btnMenu1);
		
		JButton btnMenu2 = new JButton("          MENU 2");
		btnMenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.add(menu2);
				if(menu1.isVisible())
				{
					menu1.setVisible(false);
					menu2.setVisible(true);
				}
				else if(panel_contenedor.isVisible())
				{
					panel_contenedor.setVisible(false);
					menu2.setVisible(true);
				}
				else if(menu3.isVisible())
				{
					menu3.setVisible(false);
					menu2.setVisible(true);
				}
				else if(menu4.isVisible())
				{
					menu4.setVisible(false);
					menu2.setVisible(true);
				}
				else
				{
					menu2.setVisible(true);
				}
			}
		});
		btnMenu2.setFocusable(false);
		btnMenu2.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu2.setIcon(new ImageIcon(PrincipalPanel.class.getResource("/img/clientes.png")));
		btnMenu2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu2.setForeground(Color.WHITE);
		btnMenu2.setBorder(null);
		btnMenu2.setBackground(new Color(0, 102, 255));
		btnMenu2.setBounds(10, 161, 204, 50);
		panel_Lateral.add(btnMenu2);
		
		JButton btnMenu3 = new JButton("          MENU 3");
		btnMenu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.add(menu3);
				if(menu2.isVisible())
				{
					menu2.setVisible(false);
					menu3.setVisible(true);
				}
				else if(panel_contenedor.isVisible())
				{
					panel_contenedor.setVisible(false);
					menu3.setVisible(true);
				}
				else if(menu1.isVisible())
				{
					menu1.setVisible(false);
					menu3.setVisible(true);
				}
				else if(menu4.isVisible())
				{
					menu4.setVisible(false);
					menu3.setVisible(true);
				}
				else
				{
					menu3.setVisible(true);
				}
			}
		});
		btnMenu3.setFocusable(false);
		btnMenu3.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu3.setIcon(new ImageIcon(PrincipalPanel.class.getResource("/img/venta.png")));
		btnMenu3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu3.setForeground(Color.WHITE);
		btnMenu3.setBorder(null);
		btnMenu3.setBackground(new Color(0, 102, 255));
		btnMenu3.setBounds(10, 222, 204, 50);
		panel_Lateral.add(btnMenu3);
		
		JButton btnMenu4 = new JButton("          MENU 4");
		btnMenu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.add(menu4);
				if(menu2.isVisible())
				{
					menu2.setVisible(false);
					menu4.setVisible(true);
				}
				else if(panel_contenedor.isVisible())
				{
					panel_contenedor.setVisible(false);
					menu4.setVisible(true);
				}
				else if(menu1.isVisible())
				{
					menu1.setVisible(false);
					menu4.setVisible(true);
				}
				else if(menu3.isVisible())
				{
					menu3.setVisible(false);
					menu4.setVisible(true);
				}
				else
				{
					menu4.setVisible(true);
				}
			}
		});
		btnMenu4.setFocusable(false);
		btnMenu4.setHorizontalAlignment(SwingConstants.LEFT);
		btnMenu4.setIcon(new ImageIcon(PrincipalPanel.class.getResource("/img/reportes.png")));
		btnMenu4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu4.setForeground(Color.WHITE);
		btnMenu4.setBorder(null);
		btnMenu4.setBackground(new Color(0, 102, 255));
		btnMenu4.setBounds(10, 283, 204, 50);
		panel_Lateral.add(btnMenu4);
		

		
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(PrincipalPanel.class.getResource("/img/icons8-men\u00FA-en-c\u00EDrculos-filled-25.png")));
		label_2.setBounds(207, 0, 25, 25);
		panel_Lateral.add(label_2);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if (panel_Lateral.getWidth()==232)
				{
					panel_Lateral.setBounds(0, 0, 70, 470);
					panel_contenedor.setBounds(70, 0, 704, 470);
					menu1.setBounds(70, 0, 704, 470);
					menu2.setBounds(70, 0, 704, 470);
					menu3.setBounds(70, 0, 704, 470);
					menu4.setBounds(70, 0, 704, 470);
					label_2.setBounds(45, 0, 25, 25);
				}
				else
				{
					panel_Lateral.setBounds(0, 0, 232, 470);
					panel_contenedor.setBounds(232, 0, 472, 470);
					menu1.setBounds(232, 0, 472, 470);
					menu2.setBounds(232, 0, 472, 470);
					menu3.setBounds(232, 0, 472, 470);
					menu4.setBounds(232, 0, 472, 470);
					label_2.setBounds(207, 0, 25, 25);
				}

			}
		});
	}
}
