package prject;

public class Forme {
	double x;
	double y;
	public Forme(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public void deplace(double dx,double dy){
		x+=dx;
		y+=dy;
		
	}
	public void affiche() {
		System.out.println("point de cordonee "+x+ " "+y);
	}
	public double getx() {
		return x;
	}
	
	public double gety() {
		return y;
	}	
	
	
	public class cercle{
		
	}

	}


