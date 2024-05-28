package bancodedados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Exclusao extends JFrame {

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
					Exclusao frame = new Exclusao();
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
	public Exclusao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 434, 261);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(10, 52, 60, 14);
		contentPane_1.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(50, 49, 86, 20);
		contentPane_1.add(txtNome);
		
		JLabel lblNewLabel_1 = new JLabel("Exclusão");
		lblNewLabel_1.setBounds(176, 11, 86, 14);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lSenha = new JLabel("Senha");
		lSenha.setBounds(10, 91, 46, 14);
		contentPane_1.add(lSenha);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(50, 88, 86, 20);
		contentPane_1.add(txtpass);
	}

}
