package bancodedados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Inclusão extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField txtpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inclusão frame = new Inclusão();
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
	public Inclusão() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInclusão = new JLabel("INCLUSÃO");
		lblInclusão.setBounds(191, 10, 51, 14);
		contentPane.add(lblInclusão);
		
		JLabel lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(20, 50, 60, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(60, 47, 86, 20);
		contentPane.add(txtNome);
		
		JLabel lSenha = new JLabel("Senha");
		lSenha.setBounds(20, 89, 46, 14);
		contentPane.add(lSenha);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(60, 86, 86, 20);
		contentPane.add(txtpass);
	}
}
