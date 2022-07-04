package iHooverAspi;

import utils.Directions_Et_Ordres.directionEnum;

public class Aspirateur {
	
	private int x; //position abscisse
	private int y; //position ordonnée
	private directionEnum direction; //N, E, S, W
	private int numDirection; //N (0),E(1),S(2),W(3)
	
	public Aspirateur() {
		super();
	}
	
	public Aspirateur(int x, int y, directionEnum direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
		switch (direction) {
		case N:
			this.numDirection = 0;
			break;
		case E:
			this.numDirection = 1;
			break;
		case S:
			this.numDirection = 2;
			break;
		case W:
			this.numDirection = 3;
			break;
			
		default:
			break;
		}
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
	
	public void initDirectionWithNumDirection(int numDirection) {
		this.numDirection = numDirection % 4;
		switch (this.numDirection) {
		case 0:
			this.direction = directionEnum.N;
			break;
		case 1:
			this.direction = directionEnum.E;
			break;
		case 2:
			this.direction = directionEnum.S;
			break;
		case 3:
			this.direction = directionEnum.W;
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		return "Aspirateur [x=" + x + ", y=" + y + ", direction=" + direction + "]";
	}
	
}
