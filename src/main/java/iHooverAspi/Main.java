package iHooverAspi;

import java.util.List;

import utils.ChargeFic;
import utils.Controleur;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bonjour, bienvenue dans ce système de gestion automatique\n");
		
		//chargement du fichier de donnée
		List<String> donnees = ChargeFic.loadFic("data");
		
		System.out.println("Contenu du fichier de données : " + donnees);
		
		Controleur ctl = new Controleur(donnees);
		System.out.println(ctl.getGrille()+ "\n"+ctl.getAspi()+ "\nCommandes : "+ctl.getOrdres());
		
		System.out.println("\nDeplacement selon les données");
		
		Aspirateur aspi = ctl.deplacement(ctl.getGrille(), ctl.getAspi(), ctl.getOrdres());
		
		System.out.println( aspi.toString());
		
		
		
		
	}

}
