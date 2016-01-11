package supply;

import score.Score;

public class Supply {
	
		// ATTRIBUTS
	protected int score;			// Score de l'offre par rapport � une demande.
	protected int length_C = 12;			// Nombre de crit�re pr�sent dans l'offre.
	private Score<?> criterion[];	// Ensemble des crit�res correspondant � l'offre.
	
		// CONSTRUCTEUR
	public Supply(STitle title, SDescription desc, SEditor edit, SMark mark, SReleaseDate rd, SGameType gm, SBuyMethod bm, SDifficulty diff, SLifeTime lt, SGameStyle gst, SStoryType st, SGameSupport gs, SAccessory acce, SSale[] sa, int nSale)
	{
		criterion = new Score[length_C];
		criterion[0] = title;
		criterion[1] = desc;
		criterion[2] = edit;
		criterion[3] = bm;
		criterion[4] = gm;
		criterion[5] = bm;
		criterion[6] = gm;
		criterion[7] = bm;
		criterion[8] = gm;
		criterion[9] = bm;
		criterion[10] = gm;
		criterion[11] = bm;
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
