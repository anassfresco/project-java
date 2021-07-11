package prject;
import javax.swing.*;
import java.awt.Font;

public class calcule implements ActionListener {
	 
	Font myFont=new Font("Ink Free",Font.BOLD,30);
	
	 JButton[] numberbutton=new JButton[10];
	 JButton[] functionbutton=new JButton[24];
	 
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
 	Button =new Button("1",70,460,70,50);
 	Button anas=new Button("anas",70,510,70,50);
 	
 	
 	
 	Button deuxPX=new Button("2^X",0,210,70,50);
 	Button Xp2=new Button("X^2",0,260,70,50);
 	Button XSur2=new Button("x/2",0,310,70,50);
 	Button xPy=new Button("X^Y",0,360,70,50);
 	Button dixPy=new Button("10^x",0,410,70,50);
 	Button log=new Button("log",0,460,70,50);
 	Button ln=new Button("ln",0,510,70,50);
	 
 	
 	
 	numberbutton[0]=zero;
 	numberbutton[1]=un;
 	numberbutton[2]=deux;
 	numberbutton[3]= troise;
 	numberbutton[4]=quatre;
 	numberbutton[5]=cinq;
 	numberbutton[6]=sixx;
 	numberbutton[7]=sept;
 	numberbutton[8]=huit;
 	numberbutton[9]=neufe;
 	
 	for (int i=0;i<10;i++) { 
 		numberbutton.ActionListener(this);
 		numberbutton[i].setFont(myFont);
 		numberbutton[i].setFocusable(false);
 		
 		
 		
 	}

}
