package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChargeFic { //class pour charger les données du programme à partir d'un fichier
	
	public static List<String> loadFic(String chemin){
		
		BufferedReader br = null;
		List<String> lignes = new ArrayList<String>();
		try {
			String ligne;
			br = new BufferedReader(new FileReader(chemin));
			while((ligne = br.readLine()) != null ) {
				lignes.add(ligne);
			}
			return lignes;
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ee) {
				ee.printStackTrace();
			}
			
		}
	}
}
