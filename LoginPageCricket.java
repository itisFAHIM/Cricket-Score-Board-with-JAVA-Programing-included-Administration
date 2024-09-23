import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class LoginPageCricket extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	

	/**
	 * Create the frame.
	 */
	public LoginPageCricket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Login Page");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\BloodBank\\New folder\\BBMS ICON\\login.png"));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(196, 56, 319, 82);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Name:");
		lblUsername.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblUsername.setBounds(134, 161, 61, 30);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblPassword.setBounds(134, 237, 81, 30);
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(Color.LIGHT_GRAY);
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtUsername.setBounds(263, 169, 222, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(Color.LIGHT_GRAY);
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPassword.setBounds(263, 245, 222, 20);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\BloodBank\\New folder\\BBMS ICON\\login.png"));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
			    if(username.equals("Fahim")&& password.equals("1122")) 
				//if(username.equals("Fa")&& password.equals("12"))
				//if(username.equals("Fm")&& password.equals("22"))
				{
					MainMenuPage mainMenuPage = new MainMenuPage();
					mainMenuPage.setVisible(true);
					dispose();
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Invalid Login Username or Password","Login Error", JOptionPane.ERROR_MESSAGE);
					
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
			}
		});
		btnLogin.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		btnLogin.setBounds(72, 325, 115, 23);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\BloodBank\\New folder\\BBMS ICON\\Exit application.png"));
		btnCancel.setFont(new Font("Sitka Subheading", Font.BOLD, 14));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JFrame LoginPageCricket = new JFrame("Cancel");
				if (JOptionPane.showConfirmDialog(LoginPageCricket,"Confirm if you want to exit.","LoginPageCricket", JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnCancel.setBounds(511, 325, 115, 23);
		contentPane.add(btnCancel);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setIcon(new ImageIcon("C:\\Users\\PC\\Desktop\\BloodBank\\New folder\\BBMS ICON\\Reset3.0.png"));
		btnReset.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		btnReset.setBounds(309, 323, 89, 25);
		contentPane.add(btnReset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 296, 664, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 134, 664, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 375, 664, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Only For Admin Login");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 9));
		lblNewLabel_1.setBounds(303, 375, 95, 20);
		contentPane.add(lblNewLabel_1);
	}
}
