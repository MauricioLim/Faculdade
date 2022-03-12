import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Apresentacao {

	private JFrame frame;
	private JTextField tf_Nome;
	private JTextField tf_Cpf;
	private JTextField tf_Uf;
	private JTextField tf_Renda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do contribuinte:");
		lblNewLabel.setBounds(10, 29, 106, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tf_Nome = new JTextField();
		tf_Nome.setBounds(122, 26, 176, 20);
		frame.getContentPane().add(tf_Nome);
		tf_Nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setBounds(10, 64, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf_Cpf = new JTextField();
		tf_Cpf.setBounds(121, 61, 100, 20);
		frame.getContentPane().add(tf_Cpf);
		tf_Cpf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Estado:");
		lblNewLabel_2.setBounds(10, 99, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tf_Uf = new JTextField();
		tf_Uf.setBounds(122, 96, 53, 20);
		frame.getContentPane().add(tf_Uf);
		tf_Uf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Renda Anual: R$");
		lblNewLabel_3.setBounds(10, 135, 88, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tf_Renda = new JTextField();
		tf_Renda.setBounds(122, 132, 99, 20);
		frame.getContentPane().add(tf_Renda);
		tf_Renda.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Contribuinte c = new Contribuinte(tf_Nome.getText(), tf_Cpf.getText(), tf_Uf.getText(), Double.parseDouble(tf_Cpf.getText()));
				double imposto = c.calcularImposto();
				JOptionPane.showMessageDialog(frame, "Imposto a pagar = " + imposto);
			}
		});
		btnNewButton.setBounds(132, 195, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
