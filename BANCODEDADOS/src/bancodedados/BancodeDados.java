package bancodedados;
import java.sql.*;
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
public class BancodeDados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField txtsenha;
	

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		connection = DriverManager.getConnection("jdbc:sqlite:base.db");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BancodeDados frame = new BancodeDados();
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
	public BancodeDados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome ");
		lblNewLabel.setBounds(10, 52, 60, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(50, 49, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setBounds(171, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lSenha = new JLabel("Senha");
		lSenha.setBounds(10, 91, 46, 14);
		contentPane.add(lSenha);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(50, 88, 86, 20);
		contentPane.add(txtsenha);
	}
}
