import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;

public class PreLoginPage extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreLoginPage frame = new PreLoginPage();
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
	public PreLoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("If u have an account,Please click this button to go through Login Page.");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Calisto MT", Font.BOLD, 16));
		lblNewLabel_1.setBounds(107, 101, 504, 35);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPageCricket loginPageCricket = new LoginPageCricket();
				loginPageCricket.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\BloodBank\\New folder\\BBMS ICON\\login.png"));
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 14));
		btnNewButton_1.setBounds(277, 200, 108, 34);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 196, 664, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 358, 664, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame PreLoginPage = new JFrame("Cancel");
				if (JOptionPane.showConfirmDialog(PreLoginPage,"Confirm if you want to exit.","PreLoginPage", JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
			}
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\BloodBank\\New folder\\BBMS ICON\\Exit application.png"));
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBounds(277, 358, 108, 25);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\Project Logo\\Cwbfinal1-eng-aus-mcg-3.jpg"));
		lblNewLabel_2.setBounds(0, 0, 690, 481);
		contentPane.add(lblNewLabel_2);
	}

	public void PreLoginPage1(int i, int j) {
		// TODO Auto-generated constructor stub
	}
}
