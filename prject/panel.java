package prject;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.JButton;

 		
public class panel extends JFrame implements ActionListener{
	database data3=new database();
	controll control_panel=new controll();
	public panel() {
	this.setBackground(Color.BLACK);
	this.setBounds(522, 730, 403, 56);
	this.setLayout(null);
	this.setVisible(false);
	this.setSize(400, 100);
	
	 btnNewButton = new JButton("<");
	btnNewButton.setBackground(Color.GRAY);
	btnNewButton.setBounds(65, 10, 85, 36);
	this.add(btnNewButton);
	
	btnNewButton_1 = new JButton(">");
	btnNewButton_1.setBackground(Color.GRAY);
	btnNewButton_1.setBounds(240, 10, 85, 36);
	this.add(btnNewButton_1);
	 btnNewButton_1.addActionListener(this);
	 btnNewButton.addActionListener(this);
	}
public static SPACE main1(String[] args,SPACE a ) {
		
		a.setVisible(true);
		return a;
	}



public static SPACE main11(String[] args,SPACE a) {
	
	a.setVisible(false);
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	return a;
}
	private  JButton btnNewButton_1 ;
	private  JButton btnNewButton ;
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnNewButton_1) {
			if ( data3.index<99) {
			main11(null,data3.data[data3.index]);
			
			data3.index=(data3.index+1);
			
			main1(null,data3.data[data3.index]);
			
		}
		else if  (data3.index==99) {
			main11(null,data3.data[data3.index]);
			
		}
		}
		
		
		// TODO Auto-generated method stub
		else if (e.getSource()== btnNewButton) {
			
			if( data3.index>0){
				main11(null,data3.data[data3.index]);
				data3.index=data3.index-1;
				main1(null, data3.data[data3.index]);
				
			}
			if (data3.index==0) {
				main11(null,data3.data[data3.index]);
			}
			
			
			
		}
	}
		
	}


			
			
			
			
			
			
			
		
	
		
		
	

