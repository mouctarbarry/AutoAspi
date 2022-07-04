package utils;

import java.util.ArrayList;
import java.util.List;

import iHooverAspi.Aspirateur;
import iHooverAspi.Grille;
import utils.Directions_Et_Ordres.directionEnum;
import utils.Directions_Et_Ordres.ordreEnum;

public class Controleur {
	
	private Grille grille;
	private Aspirateur aspi;
	private List<ordreEnum> ordres = new ArrayList<ordreEnum>();
	
	
	private static final String ESPACE = " ";
	public static Grille chargeGrille(String ligne) { //pour initialiser une grille avec les données 
													  //dans le fichier d'entrée
		int x = 0;
		int y = 0;
		if (ligne.contains(ESPACE)) {
			x = Integer.valueOf(ligne.split(ESPACE)[0]);
			y = Integer.valueOf(ligne.split(ESPACE)[1]);

		}
		return new Grille(x, y);

	}
	
	public static Aspirateur chargeAspi(String ligne) {
		int x = 0;
		int y = 0;
		directionEnum direction = null;

		if (ligne.contains(ESPACE)) {
			x = Integer.valueOf(ligne.split(ESPACE)[0]);
			y = Integer.valueOf(ligne.split(ESPACE)[1]);
			direction = directionEnum.valueOf(ligne.split(ESPACE)[2]);
		}
		return new Aspirateur(x, y, direction);
	}
	
	public static List<ordreEnum> chargeOrdres(String ligne){
		List<ordreEnum> ordre = new ArrayList<ordreEnum>();
		char[] lettres = ligne.toCharArray();
		for (char UneLettre : lettres) {
			ordre.add(ordreEnum.valueOf(Character.toString(UneLettre)));
		} 
		return ordre;
	}

	public Controleur(List<String> lignes) {
		if (lignes.size()!=3) {
			System.err.println("Erreur de fichier d'entreé");
		}else {
			this.grille = chargeGrille(lignes.get(0));
			this.aspi = chargeAspi(lignes.get(1));
			this.ordres = chargeOrdres(lignes.get(2));
		}
	}

	public Grille getGrille() {
		return grille;
	}

	public void setGrille(Grille grille) {
		this.grille = grille;
	}

	public Aspirateur getAspi() {
		return aspi;
	}

	public void setAspi(Aspirateur aspi) {
		this.aspi = aspi;
	}

	public List<ordreEnum> getOrdres() {
		return ordres;
	}
	
	public static void isValid (Grille grille, Aspirateur aspi) { //methode pour vérifier que l'aspirateur ne sort pas de la grille
		if(aspi.getY() > grille.getY() || aspi.getX() > grille.getX()) {
			System.err.println("Deplacement hors cadre !");
		}
	}
	
	public Aspirateur deplacement (Grille grille, Aspirateur aspi, List<ordreEnum> ordres) {
		
		for (ordreEnum i : ordres) {
			switch (i) {
			case A:
				switch (aspi.getNumDirection()) {
				case 0:
					aspi.setY(aspi.getY()+1);
					break;
				case 1:
					aspi.setX(aspi.getX()+1);
					break;
				case 2:
					aspi.setY(aspi.getY()-1);
					break;
				case 3:
					aspi.setX(aspi.getX()-1);
					break;
				default:
					break;
				}
				isValid(grille, aspi);
				break;
				
			case G:
				aspi.initDirectionWithNumDirection(3 + aspi.getNumDirection());
				break;
			case D:
				aspi.initDirectionWithNumDirection(1 + aspi.getNumDirection());
				break;
			default:
				break;
			}	
		}
		return aspi;
	}
	
	@Override
	public String toString() {
		return "Controleur [grille=" + grille + ", aspi=" + aspi + ", ordres=" + ordres + "]";
	}

	public void setOrdres(List<ordreEnum> ordres) {
		this.ordres = ordres;
	}
	 
}
