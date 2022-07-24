package utils;

public class Directions_Et_Ordres {
	
	public enum directionEnum{
		N(0), NE(1), E(2), SE(3), S(4), SW(5), W(6), NW(7); 
		
		private int directionVal;
		
		directionEnum(int val) {
			this.directionVal = val;
		}
		public int getDirectVal() {
			return directionVal;
		}
		
	}
	
	public enum ordreEnum{
		A,D,G;
	}
	
}
