


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private int x;
    private int y;
    private JTextField textUser;
    private JPasswordField textPass;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		//CONFIGURACIONES POR DEFECTO DEL FRAME
		
		setAlwaysOnTop(true);
		//AUTOFOCUS DISABLE
		setAutoRequestFocus(false);
		setResizable(false);
		//QUITAMOS BOTONES Y BARRA
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//PANEL PRINCIPAL DEL FRAME
		JPanel panel = new JPanel();
		
		//METODOS PARA MOVER EL PANEL
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
		
		
		//CREACCION Y EDICION BOTON CIERRA PROGRAMA
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
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 255));
		panel_1.setBounds(0, 0, 246, 470);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//ETIQUETA DEL ICONO
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-active-directory-filled-100.png")));
		label_1.setBounds(73, 166, 100, 100);
		panel_1.add(label_1);
		
		//TEXTBOX USUARIO
		textUser = new JTextField();
		textUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textUser.setBorder(null);
		textUser.setBounds(334, 87, 282, 42);
		textUser.setForeground(new Color(0, 102, 255));
		panel.add(textUser);
		textUser.setColumns(10);
		
		//ETIQUETA ERROR DE USUARIO O CONTRASENA
		JLabel lblErrorLogin = new JLabel("* Error al introducir el usuario o la contrase\u00F1a");
		lblErrorLogin.setForeground(new Color(255, 0, 0));
		lblErrorLogin.setBounds(334, 258, 282, 14);
		lblErrorLogin.setVisible(false);
		panel.add(lblErrorLogin);
		
		//ETIQUETA TEXTO USUARIO
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(334, 62, 76, 14);
		lblUsuario.setForeground(new Color(0, 102, 255));
		panel.add(lblUsuario);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(334, 126, 282, 12);
		separator.setBackground(new Color(0, 102, 255));
		panel.add(separator);
		
		//PASSBOX DE LA CONTRASENA
		textPass = new JPasswordField();
		textPass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPass.setForeground(new Color(0, 102, 255));
		textPass.setColumns(10);
		textPass.setBorder(null);
		textPass.setBounds(334, 191, 282, 42);
		panel.add(textPass);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 102, 255));
		separator_1.setBounds(334, 227, 282, 12);
		panel.add(separator_1);
		
		//ETIQUETA TEXTO PASSWORD
		JLabel lblPass = new JLabel("PASSWORD");
		lblPass.setForeground(new Color(0, 102, 255));
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPass.setBounds(334, 175, 103, 14);
		panel.add(lblPass);
		
		//BOTON SINGUP
		JButton btnSingUp = new JButton("SingUp");
		btnSingUp.setFocusable(false);
		//METODO AL REALIZAR CLIC EN EL BOTON
		btnSingUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CREA OBJETO VALIDACION DE DATOS
				Validacion_datos validarlogin = new Validacion_datos();
				//RECUPERAR PASS DEL TEXT PASS
				String pass = new String(textPass.getPassword());
				//SE VERIFICA USUARIO Y CONTRASENA
				//CON EL METODO VALIDACIONLOGIN 
				//DE LA CLASE VALIDACIONLOGIN
				if(validarlogin.validacionLogin(textUser.getText(), pass)) {
					PrincipalPanel ventanaP = new PrincipalPanel();
					ventanaP.setVisible(true);
					dispose();
				}
				else {
					lblErrorLogin.setVisible(true);
				}
				
			}
		});
		btnSingUp.setBackground(Color.WHITE);
		btnSingUp.setBorder(null);
		btnSingUp.setBounds(334, 338, 282, 42);
		btnSingUp.setForeground(new Color(0, 102, 255));
		panel.add(btnSingUp);
		
		
	}
}
