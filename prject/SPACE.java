package prject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSlider;

public class SPACE extends JFrame implements ActionListener,ChangeListener{
		student std;
//		database first_data=new database();
//		database data1=new database();
	public SPACE(String a) {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		this.setFont(new Font("Verdana", Font.PLAIN, 10));
		this.setBackground(Color.WHITE);
		this.setVisible(false);
		this.std=new student();
		this.setSize(1366 ,768);
		this.setTitle(a);
		getContentPane().setLayout(null);
		
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 264, 721);
		panel.setBackground(Color.BLACK);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel_5 = new JLabel("label_for_anas_icone");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\fresco\\eclipse-workspace\\prject\\src\\prject\\image\\Screenshot 2021-05-28 155656.jpg"));
		lblNewLabel_5.setBounds(0, 0, 264, 459);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_5.setForeground(Color.WHITE);
		panel.add(lblNewLabel_5);
		
		
		lblNewLabel_7 = new JLabel(" welcome");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(65, 479, 158, 25);
		panel.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("to ensa marrakech");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_8.setBounds(21, 526, 233, 36);
		panel.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 31));
		textField.setForeground(Color.WHITE);
		textField.setBounds(587, 47, 247, 33);
		textField.setBackground(Color.BLACK);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 31));
		textField_1.setForeground(Color.WHITE);
		textField_1.setBounds(587, 139, 247, 33);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 31));
		textField_2.setForeground(Color.WHITE);
		textField_2.setBounds(587, 226, 247, 33);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 31));
		textField_3.setForeground(Color.WHITE);
		textField_3.setBounds(587, 319, 247, 33);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.BLACK);
		getContentPane().add(textField_3);
		
		lblNewLabel_1 = new JLabel("full name ");
		lblNewLabel_1.setBounds(507, 51, 70, 23);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 11));
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("birthday");
		lblNewLabel.setBounds(507, 143, 70, 23);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 11));
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("branche");
		lblNewLabel_2.setBounds(507, 230, 70, 23);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 11));
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("email");
		lblNewLabel_3.setBounds(507, 323, 70, 23);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 11));
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("phone");
		lblNewLabel_4.setBounds(507, 418, 70, 23);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 11));
		getContentPane().add(lblNewLabel_4);
		

		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 31));
		textField_4.setForeground(Color.WHITE);
		textField_4.setBounds(587, 414, 247, 33);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.BLACK);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 31));
		textField_5.setForeground(Color.WHITE);
		textField_5.setBounds(587, 509, 247, 33);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.BLACK);
		getContentPane().add(textField_5);
		
		lblNewLabel_9 = new JLabel("cne");
		lblNewLabel_9.setBounds(507, 513, 70, 23);
		lblNewLabel_9.setFont(new Font("Verdana", Font.BOLD, 11));
		getContentPane().add(lblNewLabel_9);
		
	
		
		lblNewLabel_10 = new JLabel("your image ");
		lblNewLabel_10.setBounds(302, 10, 177, 162);
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\fresco\\eclipse-workspace\\prject\\src\\prject\\image\\select-icon-png-24.jpg"));
		getContentPane().add(lblNewLabel_10);
		
		btnNewButton_2 = new JButton("add image");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(327, 170, 114, 33);
		getContentPane().add(btnNewButton_2);
		
		slider = new JSlider();
		slider.setMaximum(200);
		slider.setBounds(587, 589, 247, 33);
		getContentPane().add(slider);
		
		JLabel lblNewLabel_11 = new JLabel("weight");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(507, 598, 45, 13);
		getContentPane().add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("0");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_12.setBounds(844, 598, 45, 13);
		getContentPane().add(lblNewLabel_12);
		
//		panel panel_1 = new panel();
//		
//		getContentPane().add(panel_1);
		
		
		textField.addActionListener(this);
		textField_1.addActionListener(this);
		textField_2.addActionListener(this);
		textField_3.addActionListener(this);
		textField_4.addActionListener(this);
		textField_5.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		slider.addChangeListener(this);
		
	}

	private JPanel contentPane;
	JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	 JTextField textField_3;
	 JLabel lblNewLabel_1;
	 JLabel lblNewLabel;
	 JLabel lblNewLabel_2;
	 JLabel lblNewLabel_3;
	 JLabel lblNewLabel_4;
	
	 JLabel lblNewLabel_5;
	 JLabel lblNewLabel_6;
	 JLabel lblNewLabel_7;
	 JLabel lblNewLabel_8;
	 JTextField textField_4;
	 JTextField textField_5;
	JLabel lblNewLabel_9;
	 JLabel lblNewLabel_10;
	 JButton btnNewButton_2;
	 JLabel lblNewLabel_12;
	 JSlider slider;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//		
//		
//		
//		SPACE first=new SPACE() ;
//		
//		
//
//}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	public void set_text(JTextField a,String b) {
		a.setText(b);
	}
	public void set_text(JLabel a,String b ) {
		a.setText(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnNewButton_2) {
			JFileChooser fileChooser=new JFileChooser();
			fileChooser.showOpenDialog(null);}
			
		else if (e.getSource()==textField) {
			this.std.full_name=textField.getText();
			
			}
		else if (e.getSource()==textField_1) {
			this.std.birthday=textField_1.getText();

			}
		else if (e.getSource()==textField_2) {
			this.std.branche=textField_2.getText();
			}
		else if (e.getSource()==textField_3) {
			this.std.email=textField_3.getText();
			
	
		}
		else if (e.getSource()==textField_4) {
			this.std.phone=textField_4.getText();
	}
		else if (e.getSource()==textField_5) {
			this.std.cne=textField_5.getText();
}
//		else if (e.getSource()==btnNewButton_1) {
//			first_data.data[first_data.index].setVisible(false );
//			first_data.index=(first_data.index+1)%(first_data.data.length);
//			first_data.data[first_data.index].setVisible(true);
//			
//			
//		}
//		else if (e.getSource()==btnNewButton_2) {
//			if (first_data.index==0) {
//				first_data.data[first_data.index].setVisible(false );
//				first_data.index=99;
//				first_data.data[first_data.index].setVisible(true);
//			}
//			else {
//			first_data.data[first_data.index].setVisible(false );
//			first_data.index=(first_data.index-1)%(first_data.data.length);
//			first_data.data[first_data.index].setVisible(true);
//			
//			
//		}
//		
//	}
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==slider) {
			lblNewLabel_12.setText(slider.getValue()+"kg");
			this.std.poid=slider.getValue()+"kg";
		}
	}
}
	

