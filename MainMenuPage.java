import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenuPage extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public MainMenuPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Click to show the ScoreBoard");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		lblNewLabel.setBounds(152, 47, 374, 81);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Score Board");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Scorrer scorrer = new Scorrer();
				scorrer.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		btnNewButton.setBounds(264, 139, 148, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Click for Details");
		lblNewLabel_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblNewLabel_1.setBounds(251, 226, 169, 63);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DetailsPage detailsPage = new DetailsPage();
				detailsPage.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBackground(new Color(175, 238, 238));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnNewButton_1.setBounds(287, 316, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("LogOut");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPageCricket loginPageCricket = new LoginPageCricket();
				loginPageCricket.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Myanmar Text", Font.BOLD, 14));
		btnNewButton_2.setBounds(237, 405, 185, 37);
		contentPane.add(btnNewButton_2);
	}
}
