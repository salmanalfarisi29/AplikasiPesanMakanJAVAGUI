package aplikasi_pesanmakan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField namaCustomer;
	private JTextField alamatCustomer;
	private JTextField notelpCustomer;
	private JTextField totalBayar;
	private JCheckBox chckbxSeblak;
	private JCheckBox chckbxEndogGulung;
	private JCheckBox chckbxCilor;
	private TextArea strukPembelian;
	private String RekapTransaksi = "";
	
	private void getTotal() {
		
		int totalBeli = 0;
		
		if(chckbxEndogGulung.isSelected()) {
			totalBeli += 10000;
		}
		
		if (chckbxSeblak.isSelected()) {
			totalBeli += 15000;
		}
		
		if(chckbxCilor.isSelected()) {
			totalBeli += 9000;
		}
		
		totalBayar.setText(String.valueOf(totalBeli));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("SALMAN'S STREETFOOD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PESAN STREETFOOD");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(166, 10, 165, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 24, 197, 116);
		panel.setName("Data Customer");
		panel.setToolTipText("Data Customer");
		panel.setBorder(new TitledBorder(null, "Data Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setBounds(10, 23, 34, 22);
		panel.add(lblNewLabel_1);
		
		namaCustomer = new JTextField();
		panel.add(namaCustomer);
		namaCustomer.setColumns(10);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("Alamat");
		lblNewLabel_1_1.setBounds(10, 56, 59, 22);
		panel.add(lblNewLabel_1_1);
		
		alamatCustomer = new JTextField();
		panel.add(alamatCustomer);
		alamatCustomer.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("No.telp");
		lblNewLabel_1_2.setBounds(10, 87, 59, 22);
		panel.add(lblNewLabel_1_2);
		
		notelpCustomer = new JTextField();
		panel.add(notelpCustomer);
		notelpCustomer.setColumns(10);
		
		namaCustomer = new JTextField();
		namaCustomer.setBounds(79, 24, 108, 20);
		panel.add(namaCustomer);
		namaCustomer.setColumns(10);
		
		alamatCustomer = new JTextField();
		alamatCustomer.setColumns(10);
		alamatCustomer.setBounds(79, 57, 108, 20);
		panel.add(alamatCustomer);
		
		notelpCustomer = new JTextField();
		notelpCustomer.setColumns(10);
		notelpCustomer.setBounds(79, 88, 108, 20);
		panel.add(notelpCustomer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Pilih Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(217, 24, 251, 116);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		chckbxSeblak = new JCheckBox("Seblak [10000]");
		chckbxSeblak.setBounds(6, 51, 239, 23);
		chckbxSeblak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getTotal();
				
			}
		});
		panel_1.add(chckbxSeblak);
		
		
		chckbxEndogGulung = new JCheckBox("Endog gulung  [10000]");
		chckbxEndogGulung.setBounds(6, 20, 211, 23);
		chckbxEndogGulung.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getTotal();
				
			}
		});
		panel_1.add(chckbxEndogGulung);
		
		
		
		chckbxCilor = new JCheckBox("Cilor [9000]");
		chckbxCilor.setBounds(6, 86, 239, 23);
		chckbxCilor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getTotal();
				
			}
		});
		panel_1.add(chckbxCilor);
		
		totalBayar = new JTextField();
		totalBayar.setBounds(252, 143, 216, 20);
		contentPane.add(totalBayar);
		totalBayar.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" TOTAL BAYAR");
		lblNewLabel_2.setBounds(116, 146, 139, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnTambah = new JButton("TAMBAH");
		btnTambah.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RekapTransaksi += "Nama  : " + namaCustomer.getText() + "\n";
				RekapTransaksi += "Alamat   :  " + alamatCustomer.getText() + "\n";
				RekapTransaksi += "Telepon :  " + notelpCustomer.getText() + "\n";
		        
				RekapTransaksi += "==========REKAP PEMBELIAN==========\n";
		        if (chckbxEndogGulung.isSelected()) {
		        	RekapTransaksi += " - " + chckbxEndogGulung.getText() + "\n";
		        }
		        if (chckbxSeblak.isSelected()) {
		        	RekapTransaksi += " - " + chckbxSeblak.getText() + "\n";
		        }
		        if (chckbxCilor.isSelected()) {
		        	RekapTransaksi += " - " + chckbxCilor.getText() + "\n";
		        }
		        RekapTransaksi += "=====================================================\n";
		        
		        RekapTransaksi += "Total Bayar : Rp." + totalBayar.getText() + "\n";
		        
		        RekapTransaksi += "======================================================\n";
		        RekapTransaksi += "\n";
		        RekapTransaksi += "\n";


		        strukPembelian.setText(RekapTransaksi);
			}
		});
		btnTambah.setBounds(379, 163, 89, 23);
		contentPane.add(btnTambah);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Total Pembelian", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(10, 197, 458, 83);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		strukPembelian = new TextArea();
		strukPembelian.setBounds(10, 21, 438, 52);
		panel_2.add(strukPembelian);
	}
}
