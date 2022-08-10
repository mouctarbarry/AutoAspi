package iHooverAspi;

import utils.Directions_Et_Ordres.directionEnum;

public class Aspirateur {
	
	private int x; //position abscisse
	private int y; //position ordonnée
	private directionEnum direction; //N, NE, E, SE, S, SW, W, NW
	private int numDirection; //N(0), NE(1), E(2), SE(3), S(4), SW(5), W(6), NW(7);
	
	final private int NBDIR = 8; //nbre de direction 

	
	public Aspirateur() {
		super();
	}
	
	public Aspirateur(int x, int y, directionEnum direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.numDirection = direction.getDirectVal();
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public directionEnum getDirection() {
		return direction;
	}

	public void setDirection(directionEnum direction) {
		this.direction = direction;
	}
	
	public int getNumDirection() {
		return numDirection;
	}

	public void setNumDirection(int numDirection) {
		this.numDirection = numDirection;
	}
	
	public void initDirectionWithNumDirection(int arg) {
		while (arg<0) arg+=NBDIR;
		this.numDirection = arg % NBDIR;
		this.direction = directionEnum.values()[(numDirection)];
		
	}

	@Override
	public String toString() {
		return "Aspirateur [x=" + x + ", y=" + y + ", direction=" + direction + "]";
	}
	
}

