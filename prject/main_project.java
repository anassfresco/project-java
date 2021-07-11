package prject;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class acceil extends JFrame implements ActionListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					acceil frame = new acceil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	database data1=new database();
	panel panel1=new panel();
	mot_de_pass_checker pass=new mot_de_pass_checker();
	error eror=new error();

	/**
	 * Create the frame.
	 */
	public acceil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 194, 553);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("student space");
		lblNewLabel.setBounds(0, 126, 201, 127);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		btnNewButton = new JButton("log in");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(241, 342, 243, 50);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("admin");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(568, 342, 248, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\fresco\\eclipse-workspace\\prject\\src\\prject\\image\\user-icon-vector-260nw-393536320.jpg"));
		lblNewLabel_1.setBounds(558, 92, 258, 233);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\fresco\\eclipse-workspace\\prject\\src\\prject\\image\\login-icon-vector-line-symbol-260nw-1666396786.jpg"));
		lblNewLabel_2.setBounds(241, 92, 243, 220);
		contentPane.add(lblNewLabel_2);
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this); 
	}
	public static SPACE main1(String[] args,SPACE a ) {
		
		a.setVisible(true);
		return a;
		
	}

public static panel main1(String[] args,panel a ) {
		
		a.setVisible(true);
		return a;
}
public static mot_de_pass_checker main12(String[] args,mot_de_pass_checker a ) {
	
	a.setVisible(true);
	return a;
}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			data1.data[0].setTitle("etudiant1");
		// TODO Auto-generated method stub
		 	main1(null,panel1);
		 	data1.data[0].setTitle("etudiant1");
		 	main1(null,data1.data[0]);
		 	
			
		
			
		}
	 	else if (e.getSource()==btnNewButton_1) {
	 		main12(null,pass);
	 	
	 	}
		
	}


}
