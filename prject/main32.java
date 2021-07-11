package prject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.*;

public class main32 extends JFrame implements ActionListener{
	private JMenu java;
	private JMenu cs;
	ArrayList<int> buttons_array= new ArrayList<int 10 >();
	buttons_array.ass
	private JButton[] butons;
	public main32() { 
		this.setFont(new Font("Verdana", Font.PLAIN, 10));
		this.setBackground(Color.WHITE);
		this.setVisible(false);
		this.setSize(1366 ,768);
		this.setVisible(true);
		for (int i=1;i<10;i++) {
			butons[i]=new JButton(""+i);
		}
		



}
}
