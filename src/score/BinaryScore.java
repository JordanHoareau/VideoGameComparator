package score;

import demand.Demand;

public abstract class BinaryScore extends Score<Integer>{
	
		// ATTRIBUTS
	String elements[];	// Contients les deux choix possibles pour un critère.
	int val;
	
	
		// CONSTRUCTEURS
	public BinaryScore(String item1, String item2, int value)
	{
		// Création de la correspondance entre 0 et 1 et signification.
		elements[0] = item1;
		elements[1] = item2;
		val = value;
	}
	
		// METHODES
	
	
	// Définition de la méthode hérité de Score.
	public void getScore(Demand D) {
		Integer field = extractD(D);
		//Vérifie si le critère de l'offre correspond à la demande.
		score = (val == field)? 10 : 0;	
	}

	public abstract Integer extractD(Demand D);


	
}
