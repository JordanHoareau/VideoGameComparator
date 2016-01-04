package supply;

import score.Score;

public class Supply {
	
		// ATTRIBUTS
	protected int score;			// Score de l'offre par rapport � une demande.
	protected int length_C;			// Nombre de crit�re pr�sent dans l'offre.
	private Score<?> criterion[];	// Ensemble des crit�res correspondant � l'offre.
	
		// CONSTRUCTEUR
	public Supply(SGameType gm, SBuyMethod bm, int size)
	{
		criterion = new Score[size];
		criterion[0] = gm;
		criterion[1] = bm;
		length_C = 2;
		score = 0;
	}
		
		// METHODES
	/**
	 * Fonction servant � comparer chaque crit�re de l'offre avec une demande
	 * @param myDemand : DemandMethods Interface impl�ment� par une demande.
	 */
	public void compare(DemandMethods myDemand)
	{
		for (int i=0; i< length_C; i++)
			score += criterion[i].getScore(myDemand);
	}
	
	/**
	 * Fonction retournant le score d'une offre
	 * @return score : int repr�sentant le score d'une offre.
	 */
	public int getScore()
	{
		return score;
	}
	
	/**
	 * Surd�finition de la m�thode toString() afin d'afficher le score de notre offre lors de l'affichage.
	 */
	public String toString()
	{
		return "Le score de cette offre est: "+score;
	}
}
