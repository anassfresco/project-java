package prject;

import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;



public class My_frame extends JFrame implements MouseListener {

	/**title
	 * 
	 * JJHJ
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public My_frame(){
	    this.setVisible(true);
	    this.setSize(100, 950);
	    this.addMouseListener(this);
	    
	    
	
	
	
    
	
	

}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("click");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("press");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("release");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("in");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("out");
		
	}
}
