package prject;
import javax.swing.*;
public class shit {
	public static void main(String[] args)
    {
        //create a new frame
        JFrame f = new JFrame("frame");
        f.setVisible(true);
        String [] array= {"anas","bahi"};
        JList c=new JList(array);
        c.setBounds(65, 248, 181, -170);
        f.add(c);
}
}