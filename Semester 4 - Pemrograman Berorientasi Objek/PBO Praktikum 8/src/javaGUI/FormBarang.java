package javaGUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FormBarang {

	private JFrame frmFormBarang;
	private JTextField txtKdBarang;
	private JTextField txtNmBarang;
	private JTextField txtStok;
	private JTextField txtStokMinimal;
	private DefaultTableModel model;

	static final String JAVA_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1/barang";
	static final String USER = "root";
	static final String PASS = "";

	static Connection conn;
	static Statement stmt;
	static ResultSet ress;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormBarang window = new FormBarang();
					window.frmFormBarang.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormBarang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFormBarang = new JFrame();
		frmFormBarang.setResizable(false);
		frmFormBarang.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("Open Window");
				showData();
			}
		});
		frmFormBarang.setTitle("Form Barang");
		frmFormBarang.setBounds(100, 100, 444, 520);
		frmFormBarang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFormBarang.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Data Barang");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 115, 25);
		frmFormBarang.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Kode Barang");
		lblNewLabel_1.setBounds(10, 45, 104, 13);
		frmFormBarang.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nama Barang");
		lblNewLabel_2.setBounds(10, 69, 104, 13);
		frmFormBarang.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Satuan");
		lblNewLabel_3.setBounds(10, 96, 45, 13);
		frmFormBarang.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Stok");
		lblNewLabel_4.setBounds(10, 124, 45, 13);
		frmFormBarang.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Stok Minimal");
		lblNewLabel_5.setBounds(10, 153, 60, 13);
		frmFormBarang.getContentPane().add(lblNewLabel_5);

		txtKdBarang = new JTextField();
		txtKdBarang.setBounds(124, 46, 271, 19);
		frmFormBarang.getContentPane().add(txtKdBarang);
		txtKdBarang.setColumns(10);

		txtNmBarang = new JTextField();
		txtNmBarang.setBounds(124, 70, 271, 19);
		frmFormBarang.getContentPane().add(txtNmBarang);
		txtNmBarang.setColumns(10);

		txtStok = new JTextField();
		txtStok.setBounds(124, 125, 271, 19);
		frmFormBarang.getContentPane().add(txtStok);
		txtStok.setColumns(10);

		txtStokMinimal = new JTextField();
		txtStokMinimal.setBounds(124, 149, 271, 19);
		frmFormBarang.getContentPane().add(txtStokMinimal);
		txtStokMinimal.setColumns(10);

		JComboBox boxSatuan = new JComboBox();
		boxSatuan.setModel(new DefaultComboBoxModel(new String[] { "Buah", "Lembar", "Batang", "Liter ", "Kilogram" }));
		boxSatuan.setBounds(124, 96, 271, 21);
		frmFormBarang.getContentPane().add(boxSatuan);

		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String kode = txtKdBarang.getText();
				String nama = txtNmBarang.getText();
				Object satuan = boxSatuan.getSelectedItem();
				int stok = Integer.parseInt(txtStok.getText());
				int stokMin = Integer.parseInt(txtStokMinimal.getText());

				insert(kode, nama, satuan, stok, stokMin);
			}
		});
		btnSimpan.setBounds(128, 194, 85, 21);
		frmFormBarang.getContentPane().add(btnSimpan);

		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetForm();
				btnSimpan.setEnabled(true);
			}
		});
		btnNewButton.setBounds(223, 194, 85, 21);
		frmFormBarang.getContentPane().add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(39, 272, 350, 198);
		frmFormBarang.getContentPane().add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String kode = table.getValueAt(table.getSelectedRow(), 0).toString();
				getData(kode);
				btnSimpan.setEnabled(false);
			}
		});
		scrollPane.setViewportView(table);

		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editData();
				btnSimpan.setEnabled(true);
			}
		});
		btnEdit.setBounds(138, 226, 75, 23);
		frmFormBarang.getContentPane().add(btnEdit);

		JButton btnHapus = new JButton("Hapus");
		btnHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Yakin ingin hapus data?");
				if (response == 0) {
					if (table.getSelectedRow() >= 0) {
						hapusData(txtKdBarang.getText());
						btnSimpan.setEnabled(true);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Hapus data dibatalkan");
				}
			}
		});
		btnHapus.setBounds(223, 226, 75, 23);
		frmFormBarang.getContentPane().add(btnHapus);
		
		JLabel lblNewLabel_6 = new JLabel("Dicky Setiawan - A11.2020.13089");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_6.setBounds(265, 14, 153, 25);
		frmFormBarang.getContentPane().add(lblNewLabel_6);
	}

	public void insert(String kode, String nama, Object satuan, int stok, int stokMin) {
		try {
			// Create class for connection
			Class.forName(JAVA_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();

			// Sql Command
			String sql = "INSERT INTO barang (kd_brg, nm_brg, satuan, stok_brg, stok_min) VALUES(?,?,?,?,?)";
			// Sql Execution
			// Prepared Statement Commony used to avoid sql injection and bring security
			// into ur databases
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, kode);
			ps.setString(2, nama);
			ps.setObject(3, satuan);
			ps.setInt(4, stok);
			ps.setInt(5, stokMin);

			ps.execute();

			stmt.close();
			conn.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Koneksi Gagal");
		}

		showData();
	}

	public void showData() {
		model = new DefaultTableModel();

		model.addColumn("Kode Barang");
		model.addColumn("Nama Barang");
		model.addColumn("Satuan");
		model.addColumn("Stok Barang");
		model.addColumn("Stok Minimal Barang");

		try {
			Class.forName(JAVA_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();

			ress = stmt.executeQuery("SELECT * FROM barang");
			while (ress.next()) {
				model.addRow(new Object[] { ress.getString("kd_brg"), ress.getString("nm_brg"),
						ress.getString("satuan"), ress.getString("stok_brg"), ress.getString("stok_min") });
			}

			stmt.close();
			conn.close();

			table.setModel(model);
			table.setAutoResizeMode(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getData(String kode) {
		JComboBox boxSatuan = new JComboBox();
		try {
			Class.forName(JAVA_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM barang where kd_brg = ?");
			ps.setString(1, kode);

			ress = ps.executeQuery();

			ress.next();

			txtKdBarang.setText(ress.getString("kd_brg"));
			txtNmBarang.setText(ress.getString("nm_brg"));
			boxSatuan.setSelectedItem(ress.getObject("satuan"));
			txtStok.setText(ress.getString("stok_brg"));
			txtStokMinimal.setText(ress.getString("stok_min"));

			stmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void hapusData(String kode) {
		try {
			Class.forName(JAVA_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();

			PreparedStatement ps = conn.prepareStatement("DELETE FROM barang WHERE kd_brg = ?");
			ps.setString(1, kode);

			ps.execute();

			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		showData();
		resetForm();
	}

	public void editData() {
		JComboBox boxSatuan = new JComboBox();
		String kode = txtKdBarang.getText();
		String nama = txtNmBarang.getText();
		Object satuan = boxSatuan.getSelectedItem();
		int stok = Integer.parseInt(txtStok.getText());
		int stokMin = Integer.parseInt(txtStokMinimal.getText());
		try {
			Class.forName(JAVA_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.createStatement();

			PreparedStatement ps = conn
					.prepareStatement("UPDATE barang SET nm_brg=?, stok_brg=?, stok_min=? WHERE kd_brg = ?");
			ps.setString(1, nama);
			ps.setInt(2, stok);
			ps.setInt(3, stokMin);
			ps.setString(4, kode);

			ps.execute();

			JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		showData();
		resetForm();
	}

	public void resetForm() {
		txtKdBarang.setText("");
		txtNmBarang.setText("");
		txtStok.setText("");
		txtStokMinimal.setText("");
	}
}
