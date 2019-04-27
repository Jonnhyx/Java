



import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Cursor;


public class SingUp extends JFrame {

	private JPanel contentPane;
	private JButton btnStart;
	private JLabel lblX;
	private int x;
    private int y;
    
    
	/**
	 * Launch the application.
	 */
    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingUp frame = new SingUp();
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
	
	public SingUp() {
		//CONFIGURACIONES POR DEFECTO DEL FRAME
		//AUTOFOCUS DISABLE
		setAutoRequestFocus(false);
		//QUITAMOS BOTONES Y BARRA
		setUndecorated(true);

		setBackground(SystemColor.menu);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//TAMANO
		setBounds(100, 100, 704, 473);
		//CONTENEDOR POR DEFECTO DEL FRAME
		contentPane = new JPanel();
		//ASIGNAMOS COLOR BLANCO
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//PANEL PRINCIPAL DEL FRAME
		JPanel panel = new JPanel();
		panel.setBorder(null);
		
		
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
		
		
		//ASIGNAMOS COLOR
		panel.setBackground(new Color(0, 102, 255));
		//ASIGNAMOS TAMANO Y POSICION
		panel.setBounds(0, 0, 704, 473);
		//ANADIMOS AL CONTENEDOR PRINCIPAL DEL FRAME
		contentPane.add(panel);
		panel.setLayout(null);
		
		//ETIQUETA QUE CONTENDRA EL ICONO PRINCIPAL DEL PANEL
		JLabel lblIcono = new JLabel("");
		//AGREGAMOS ICONO
		lblIcono.setIcon(new ImageIcon(SingUp.class.getResource("/img/icons8-active-directory-filled-100.png")));
		//TAMANO Y POSICION DEL ICONO
		lblIcono.setBounds(300, 107, 100, 108);
		//ANADIMOS AL PANEL
		panel.add(lblIcono);
		
		//CREACION Y EDICION BOTON START
		btnStart = new JButton("START");
		btnStart.setFocusable(false);
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnStart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStart.setContentAreaFilled(false);
		btnStart.setBorderPainted(false);
		btnStart.setIconTextGap(0);
		btnStart.setBorder(null);
		//ACCION AL PULSAR EL BOTON
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//btnStart.setBackground(new Color(0, 102, 255));
				//LANZAR LOGINFORM
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnStart.setForeground(Color.WHITE);
		btnStart.setBackground(new Color(0, 102, 255));
		btnStart.setBounds(270, 304, 158, 33);
		panel.add(btnStart);
		
		//CREACCION Y EDICION BOTON CIERRA PROGRAMA
		lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblX.setForeground(Color.WHITE);
		lblX.setBounds(687, 0, 17, 21);
		panel.add(lblX);
	}
}
