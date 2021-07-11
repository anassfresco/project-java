package prject;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

 
public class frame
{
    public static void main(String[] args) 
    {
    	
    	fenetre frame=new fenetre();
//    	Border border = BorderFactory.createLineBorder(Color.BLUE, 5);
    	
    	 
    	label label1 = new label();
    	label1.setSize(300, 300);
    	label1.setVisible(true);
    	
//    	frame.add(label1);
    	
    	
    	
    	
    	 
        
        
        
    	Button egal=new Button("=",280,510,70,50);
    	Button plus=new Button("+",280,460,70,50);
    	Button moin=new Button("-",280,410,70,50);
    	Button multiply=new Button("*",280,360,70,50);
    	Button division=new Button("/",280,310,70,50);
    	Button mod=new Button("mod",280,260,70,50);
    	Button delate=new Button("delate",280,210,70,50);
    	
    	Button CE=new Button("CE",210,210,70,50);
    	Button expo=new Button("EXP",210,260,70,50);
    	
    	Button factoriale=new Button("n!",210,310,70,50);
    	Button neufe=new Button("9",210,360,70,50);
    	Button sixx=new Button("6",210,410,70,50);
    	
    	
    	Button troise=new Button("3",210,460,70,50);
    	Button pointe=new Button(".",210,510,70,50);


    	Button puiss3=new Button("x^3",140,210,70,50);
    	Button abs=new Button("|x|",140,260,70,50);
    	Button rightPar=new Button(")",140,310,70,50);
    	Button huit=new Button("8",140,360,70,50);
    	Button cinq=new Button("5",140,410,70,50);
    	Button deux=new Button("2",140,460,70,50);
    	Button zero=new Button("0",140,510,70,50);
    	
    	Button pi=new Button("pi",70,210,70,50);
    	Button unsurX=new Button("1/x",70,260,70,50);
    	Button leftPar=new Button(")",70,310,70,50);
    	Button sept=new Button("7",70,360,70,50);
    	Button quatre=new Button("4",70,410,70,50);
    	Button un=new Button("1",70,460,70,50);
    	Button anas=new Button("anas",70,510,70,50);
    	
    	
    	
    	Button deuxPX=new Button("2^X",0,210,70,50);
    	Button Xp2=new Button("X^2",0,260,70,50);
    	Button XSur2=new Button("x/2",0,310,70,50);
    	Button xPy=new Button("X^Y",0,360,70,50);
    	Button dixPy=new Button("10^x",0,410,70,50);
    	Button log=new Button("log",0,460,70,50);
    	Button ln=new Button("ln",0,510,70,50);
    	
    	

    	
    	
    	
    	
    	
    	
    	frame.add(egal);
    	frame.add(plus);
    	frame.add(moin);
    	frame.add(multiply);
    	frame.add(division);
    	frame.add(mod);
    	frame.add(delate);
    	frame.add(CE);
    	frame.add(expo);
    	frame.add(factoriale);
    	frame.add(neufe);
    	frame.add(sixx);
    	frame.add(troise);
    	frame.add(pointe);
    	frame.add(CE);
    	frame.add(abs);
    	frame.add(puiss3);
    	frame.add(rightPar);
    	frame.add(huit);
    	frame.add(cinq);
    	frame.add(deux);
    	frame.add(zero);
    	frame.add(pi);
    	frame.add(unsurX);
    	frame.add(leftPar);
    	frame.add(sept);
    	frame.add(quatre);
    	frame.add(un);
    	frame.add(anas);
    	
    	frame.add(deuxPX);
    	frame.add(ln);
    	frame.add(log);
    	frame.add(dixPy);
    	frame.add(xPy);
    	frame.add(XSur2);
    	frame.add( Xp2);
//    	
//  
//        
        
    }

}