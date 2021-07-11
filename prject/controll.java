
 		
package prject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class controll extends JFrame implements ActionListener {
	database data3=new database();
	private JPanel contentPane;
	private list panel_1;
	private JButton btnNewButton;
	private JList liste;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public controll() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 9));
		this.setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 944, 489);
		this.setVisible(false);
		
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.BLACK);
		panel.setBounds(5, 0, 229, 452);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("admin space");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 195, 197, 63);
		panel.add(lblNewLabel);
		
		btnNewButton = new JButton("show");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBounds(539, 122, 103, 37);
		getContentPane().add(btnNewButton);
		
		JButton btnEdit = new JButton("edit");
		btnEdit.setForeground(Color.RED);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnEdit.setBounds(539, 193, 103, 37);
		this.add(btnEdit);
		
		JButton btnRemove = new JButton("remove");
		btnRemove.setForeground(Color.RED);
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnRemove.setBounds(539, 278, 103, 37);
		getContentPane().add(btnRemove);
		
		liste=new JList(data3.name_etudiant);
		liste.setFont(new Font("Yu Gothic Medium", Font.ITALIC, 19));
		liste.setValueIsAdjusting(true);
		liste.setForeground(SystemColor.desktop);
		liste.setBackground(SystemColor.menu);
		liste.setBounds(37, 33, 138, 187);
		JScrollPane scrollPane = new JScrollPane(liste);
		
		panel_1 = new list(scrollPane);
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(270, 100, 210, 294);
		getContentPane().add(panel_1);
		btnNewButton.addActionListener(this);
		
		
		
		
	}
	

	private void setBorder(EmptyBorder emptyBorder) {
		// TODO Auto-generated method stub
		
	}
	public void set_panel(list a) {
		this.panel_1=a;
	}
public static SPACE main1(String[] args,SPACE a ) {
		
		a.setVisible(true);
		return a;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
		if (e.getSource()==btnNewButton) {
			 int[] selectedIx = liste.getSelectedIndices();
			 data3.data[selectedIx[0]].set_text(data3.data[selectedIx[0]].textField,data3.data[selectedIx[0]].std.full_name );
			 data3.data[selectedIx[0]].set_text(data3.data[selectedIx[0]].textField_1,data3.data[selectedIx[0]].std.birthday );
			 data3.data[selectedIx[0]].set_text(data3.data[selectedIx[0]].textField_2,data3.data[selectedIx[0]].std.branche );
			 data3.data[selectedIx[0]].set_text(data3.data[selectedIx[0]].textField_3,data3.data[selectedIx[0]].std.email );
			 data3.data[selectedIx[0]].set_text(data3.data[selectedIx[0]].textField_4,data3.data[selectedIx[0]].std.phone );
			 data3.data[selectedIx[0]].set_text(data3.data[selectedIx[0]].textField_5,data3.data[selectedIx[0]].std.cne );
			 data3.data[selectedIx[0]].set_text(data3.data[selectedIx[0]].lblNewLabel_12,data3.data[selectedIx[0]].std.poid );
			 main1(null,data3.data[selectedIx[0]]);
			 
			 
		}
			
			
			
			
			
		}

			
}




