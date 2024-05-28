package bancodedados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Consulta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField txtpass;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	public Consulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(10, 82, 60, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(50, 79, 86, 20);
		contentPane.add(txtNome);
		
		JLabel lSenha = new JLabel("Senha");
		lSenha.setBounds(10, 121, 46, 14);
		contentPane.add(lSenha);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(50, 118, 86, 20);
		contentPane.add(txtpass);
		
		lblNewLabel_1 = new JLabel("Consulta");
		lblNewLabel_1.setBounds(183, 29, 60, 14);
		contentPane.add(lblNewLabel_1);
	}
}
