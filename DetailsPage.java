import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetailsPage extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public DetailsPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("This Cricket Score Board Project Created by:");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblNewLabel.setBounds(193, 57, 328, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Md. Fahim Morshed");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		//System.out.println("Id-2122279642");
		lblNewLabel_1.setBounds(107, 181, 131, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID-2122279642");
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNewLabel_2.setBounds(107, 212, 131, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("&");
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNewLabel_3.setBounds(320, 199, 24, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Most. Efteshoma Efty");
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNewLabel_4.setBounds(450, 184, 144, 17);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ID-2131321642");
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNewLabel_5.setBounds(448, 215, 132, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Description");
		lblNewLabel_6.setFont(new Font("Myanmar Text", Font.BOLD, 18));
		lblNewLabel_6.setBounds(281, 298, 106, 33);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("This Cricket Score Board Project is the system where it shows an Output of a current cricket match running score where");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(56, 321, 583, 10);
		contentPane.add(lblNewLabel_7);
		
		
		JLabel lblNewLabel_8 = new JLabel("user could continuously input match's data that changes by per ball in the match. This is mainly the thing by which a ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(56, 332, 583, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("TV Channel could stream the whole match details shortly to the audience. These project's data implement from real life ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_9.setBounds(56,343,583,14);
		contentPane.add(lblNewLabel_9);
		
		
		JLabel lblNewLabel_10 = new JLabel("cricket match which data changes from ball to ball played by the players in the match.");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_10.setBounds(56,354,583,14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("We showing here the visual representation of that Score Board which update from an user or many other user who has ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_11.setBounds(56, 365, 583, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("permission by creating an account & so far after logging in the account. These are usually managed by TV Channel owner.");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_12.setBounds(56, 375, 586, 20);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenuPage mainMenuPage = new MainMenuPage();
				mainMenuPage.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
		btnNewButton.setBounds(73, 420, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame DetailsPage = new JFrame("Cancel");
				if (JOptionPane.showConfirmDialog(DetailsPage,"Confirm if you want to exit.","DetailsPage", JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setBounds(491, 420, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

