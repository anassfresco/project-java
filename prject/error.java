package prject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class error extends JFrame {

		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						hhghh frame = new hhghh();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public error() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(400,300, 435, 181);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLACK);
			panel.setBounds(5, 0, 760, 152);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("INDICE:my_name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setBounds(100, 89, 391, 28);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel = new JLabel("PASSWORD INCORRECT ");
			lblNewLabel.setBounds(85, 10, 312, 31);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
			lblNewLabel.setForeground(Color.WHITE);
			panel.add(lblNewLabel);
		}
	}



