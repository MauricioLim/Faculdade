import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.util.ArrayList;

public class Apresentacao {

	private JFrame frame;
	private JTextField tfTitulo;
	private JTextField tfValor;
	private JTextField tfData;
	private JTextField tfNomeBanda;
	private JTextField tfEstiloMusical;
	private ArrayList<Evento> eventos = new ArrayList<>();
	private DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private JTextField tfQtdPagantes;
	private JTextField tfOpiniao;

	

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
		
		JLabel lblNewLabel = new JLabel("Titulo:");
		lblNewLabel.setBounds(242, 18, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setBounds(242, 39, 46, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data: ");
		lblNewLabel_2.setBounds(242, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tfTitulo = new JTextField();
		tfTitulo.setBounds(338, 15, 86, 20);
		frame.getContentPane().add(tfTitulo);
		tfTitulo.setColumns(10);
		
		tfValor = new JTextField();
		tfValor.setBounds(338, 39, 86, 20);
		frame.getContentPane().add(tfValor);
		tfValor.setColumns(10);
		
		tfData = new JTextField();
		tfData.setBounds(338, 67, 86, 20);
		frame.getContentPane().add(tfData);
		tfData.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("TIPO DE EVENTO");
		lblNewLabel_3.setBounds(10, 18, 82, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nome da Banda:");
		lblNewLabel_4.setBounds(242, 101, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tfNomeBanda = new JTextField();
		tfNomeBanda.setEnabled(false);
		tfNomeBanda.setBounds(338, 98, 86, 20);
		frame.getContentPane().add(tfNomeBanda);
		tfNomeBanda.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Estilo Musical:");
		lblNewLabel_5.setBounds(242, 132, 86, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tfEstiloMusical = new JTextField();
		tfEstiloMusical.setEnabled(false);
		tfEstiloMusical.setBounds(338, 129, 86, 20);
		frame.getContentPane().add(tfEstiloMusical);
		tfEstiloMusical.setColumns(10);
		
		JComboBox cbTipo = new JComboBox();
		cbTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbTipo.getSelectedIndex() == 1) {
					tfNomeBanda.setEnabled(true);
					tfEstiloMusical.setEnabled(true);
				}
			}
		});
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Evento", "Show musical"}));
		cbTipo.setBounds(10, 39, 72, 22);
		frame.getContentPane().add(cbTipo);
		
		JButton btnNewButton = new JButton("Cadastrar Evento");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Evento evento;
					if(cbTipo.getSelectedIndex() == 0) {
						evento = new Evento(tfTitulo.getText(), Float.parseFloat(tfValor.getText()), LocalDate.parse(tfData.getText(),df));
						//evento.setAvaliacao(null)
					} else { 
						evento = new ShowMusical(tfTitulo.getText(), Float.parseFloat(tfValor.getText()), LocalDate.parse(tfData.getText(), df), tfNomeBanda.getText(), tfEstiloMusical.getText());
					}
					
					eventos.add(evento);
					JOptionPane.showMessageDialog(frame, "Aluno cadastrado");
				} catch(DateTimeParseException dtpe) {
					JOptionPane.showMessageDialog(frame, "Data com problemas");
				}
				catch(RuntimeException rte) {
					JOptionPane.showMessageDialog(frame, rte);
				}
			}
		});
		btnNewButton.setBounds(245, 227, 179, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Quantidade pagantes:");
		lblNewLabel_6.setBounds(221, 163, 108, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		tfQtdPagantes = new JTextField();
		tfQtdPagantes.setBounds(338, 160, 86, 20);
		frame.getContentPane().add(tfQtdPagantes);
		tfQtdPagantes.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Opiniao Geral:");
		lblNewLabel_7.setBounds(242, 188, 86, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		tfOpiniao = new JTextField();
		tfOpiniao.setBounds(338, 191, 86, 20);
		frame.getContentPane().add(tfOpiniao);
		tfOpiniao.setColumns(10);
	}
}
