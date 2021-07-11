package prject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class mot_de_pass_checker extends JFrame implements ActionListener {
	private String password;
	private JPanel contentPane;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	controll control1=new controll();
	error eror=new error();
	

	/**
	 * Create the frame.
	 */
	public mot_de_pass_checker() {
		this.password="anas";
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 442, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(5, 5, 722, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("your password pleas ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 10, 417, 67);
		panel.add(lblNewLabel);
		
		btnNewButton = new JButton("submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(this);
		
		btnNewButton.setBounds(165, 188, 85, 21);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(55, 143, 324, 35);
		contentPane.add(passwordField);
		
	}
	public Boolean comparate(char []a, char []b) {
		int k=0;
		if (a.length==b.length) {
			for (int i=0;i<a.length;i++) {
			if (a[i]!=b[i]) {
				k=k+1;
			}
			}
			if (k!=0) {
				return false;
			}
			else {
				return true;
				
			}
			}
		else {
			return false;
					
					
			
				}
		}
public static controll main1(String[] args,controll a ) {
		
		a.setVisible(true);
		return a;
}
public static error main1(String[] args,error a ) {
	
	a.setVisible(true);
	return a;
	
}

	private JButton btnNewButton;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnNewButton) {
			if (comparate(passwordField.getPassword(),this.password.toCharArray())){
				main1(null,control1);}
			
			else {
				main1(null,eror);
			}
					
				
				
				
				
				
			}
			
		}
		
	}
	
	