package score;

import supply.DemandMethods;

public abstract class BinaryScore extends Score<Integer>{
		// ATTRIBUTS
	String elements[];	// Contients les deux choix possibles pour un critère.
	int val;			// Valeur encapsulée par l'offre.
	
		// CONSTRUCTEURS
	public BinaryScore(int value, String...item)
	{
		super();
		// Création de la correspondance entre 0 et 1 et signification.
		elements = new String[item.length];
		for(String c : item)
			elements[0] = c;
		val         = value;
		scoreMax    = 10;
	}
	
		// METHODES
	/**
	 * Définition de la méthode hérité de Score.
	 * @return score : int correspondant au score de ce champ.
	 */
	public int getScore(DemandMethods myDemand) {
		Integer field = extractD(myDemand);
		//Vérifie si le critère de l'offre correspond à la demande.
		return score = (val == field)? scoreMax+getScoreSpe(myDemand) : 0+getScoreSpe(myDemand);	
	}
	
	public String toString(){
		return val+"("+score+")";
	}
	
	public abstract int getScoreSpe(DemandMethods myDemand);
}
