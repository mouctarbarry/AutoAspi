package utils;

import java.util.ArrayList;
import java.util.List;

import iHooverAspi.Aspirateur;
import iHooverAspi.Grille;

public class MoveCheck {
	
	
	public List<Integer> directionsPossibles(Grille grille, Aspirateur aspi){
		
		List<Integer> dirPossible = new ArrayList<Integer>();
		
		if (aspi.getX() == grille.getX() && aspi.getY() == grille.getY()) { 
			//on est dans le coin haut à droite	
			dirPossible.add(4);
			dirPossible.add(5);
			dirPossible.add(6);
			
			return dirPossible;
		}
		else if (aspi.getX() == 1 && aspi.getY() == grille.getY()) { 
			//on est dans le coin haut à gauche	
			dirPossible.add(2);
			dirPossible.add(3);
			dirPossible.add(4);
			
			return dirPossible;
		}
		else if (aspi.getX() == grille.getX() && aspi.getY() == 1) { 
			//on est dans le coin bas à droite	
			dirPossible.add(6);
			dirPossible.add(7);
			dirPossible.add(0);
			
			return dirPossible;
		}
		else if (aspi.getX() == 1 && aspi.getY() == 1) { 
			//on est dans le coin bas à gauche	
			dirPossible.add(0);
			dirPossible.add(1);
			dirPossible.add(2);
			
			return dirPossible;
		}
		else if (aspi.getX() == 1 && aspi.getY() < grille.getY()) { 
			//on est dans le coté gauche
			dirPossible.add(0);
			dirPossible.add(1);
			dirPossible.add(2);
			dirPossible.add(3);
			dirPossible.add(4);
			
			return dirPossible;
		}
		else if (aspi.getX() == grille.getX() && aspi.getY() < grille.getY()) { 
			//on est dans le coté doit
			dirPossible.add(0);
			dirPossible.add(4);
			dirPossible.add(5);
			dirPossible.add(6);
			dirPossible.add(7);
			
			return dirPossible;
		}
		
		else if (aspi.getX() < grille.getX() && aspi.getY() == grille.getY()) { 
			//on est dans le coté haut
			dirPossible.add(2);
			dirPossible.add(3);
			dirPossible.add(4);
			dirPossible.add(5);
			dirPossible.add(6);
			
			return dirPossible;
		}
		else if (aspi.getX() < grille.getX() && aspi.getY() ==1) { 
			//on est dans le coté bas
			dirPossible.add(0);
			dirPossible.add(1);
			dirPossible.add(2);
			dirPossible.add(6);
			dirPossible.add(7);
			
			return dirPossible;
		}else { //on est pas aux extremités
			dirPossible.add(0);
			dirPossible.add(1);
			dirPossible.add(2);
			dirPossible.add(3);
			dirPossible.add(4);
			dirPossible.add(5);
			dirPossible.add(6);
			dirPossible.add(7);
			
			return dirPossible;
		}
		
	}
	
	public boolean isMoveable(Grille grille, Aspirateur aspi) {
		
		List<Integer> listDir = directionsPossibles(grille, aspi);
		
		if (listDir.contains(aspi.getNumDirection())){
			return true;
		}
		return false;
	}

}
