package prject;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

 	
public class list extends JPanel {
	private JScrollPane b;
 	public list(JScrollPane a) {
	this.setBackground(SystemColor.menu);
	this.setBounds(270, 100, 210, 246);
	this.add(a);
	this.setVisible(true);
	
	
}
}