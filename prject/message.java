package prject;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class message extends JFrame{
	private JPanel contentPane;
	private JOptionPane option;
	public message(String a) {
		
//		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 300, 442, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		option=new JOptionPane();
		option.showMessageD ialog(contentPane,a);
		
	}
}

