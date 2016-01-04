package score;

import supply.DemandMethods;

public abstract class BinaryScore extends Score<Integer>{
		// ATTRIBUTS
	String elements[];	// Contients les deux choix possibles pour un crit�re.
	int val;
	
		// CONSTRUCTEURS
	public BinaryScore(String item1, String item2, int value)
	{
		// Cr�ation de la correspondance entre 0 et 1 et signification.
		elements = new String[2];
		elements[0] = item1;
		elements[1] = item2;
		val = value;
	}
	
		// METHODES
	
	// D�finition de la m�thode h�rit� de Score.
	public int getScore(DemandMethods myDemand) {
		Integer field = extractD(myDemand);
		//V�rifie si le crit�re de l'offre correspond � la demande.
		return score = (val == field)? 10 : 0;	
	}

	public abstract Integer extractD(DemandMethods myDemand);	
}
