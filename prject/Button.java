package prject;
import javax.swing.JButton;


public class Button extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Button(String titre,int x,int y,int z,int q){
		this.setSize(100,100);
		this.setLayout(null);  
	    this.setVisible(true);   
	    this.setText(titre);
	    this.setBounds(x,y,z,q);
	    this.setVisible(getFocusTraversalKeysEnabled());
	  
	
		
		
	}

}
