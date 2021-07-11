package prject;
import javax.swing.JFrame;
public class JButton extends JFrame {  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String titre;
	public JButton(String titre) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 250);
        this.setVisible(true);
        this.titre=titre;
	}
	

}

