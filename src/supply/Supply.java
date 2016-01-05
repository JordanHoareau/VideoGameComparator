package supply;

import score.Score;

public class Supply {
	
		// ATTRIBUTS
	protected int score;			// Score de l'offre par rapport à une demande.
	protected int length_C;			// Nombre de critère présent dans l'offre.
	private Score<?> criterion[];	// Ensemble des critères correspondant à l'offre.
	private SPrice price;
	
		// CONSTRUCTEUR
	public Supply(SGameType gm, SBuyMethod bm, SMark m, SReleaseDate sd )
	{
		length_C = 12;
		criterion = new Score[length_C];
		for(int i=0; i < length_C; i++)
			criterion[i] = null;
		price = bm.getPrice();
		
		criterion[3] = m;
		criterion[4] = sd;
		criterion[5] = gm;
		criterion[6] = bm;
		
		score = 0;
	}
		
		// METHODES
	/**
	 * Fonction servant à comparer chaque critère de l'offre avec une demande
	 * @param myDemand : DemandMethods Interface implémenté par une demande.
	 */
	public void compare(DemandMethods myDemand)
	{
		for (int i=0; i< length_C; i++)
			if(criterion[i]!= null)
				score += criterion[i].getScore(myDemand);
	}
	
	/**
	 * Fonction retournant le score d'une offre
	 * @return score : int représentant le score d'une offre.
	 */
	public int getScore()
	{
		return score;
	}
	
	/**
	 * Surdéfinition de la méthode toString() afin d'afficher le score de notre offre lors de l'affichage.
	 */
	public String toString()
	{
		return "Caractéristique de l'offre : \n"
	           +"\t- Title : "+criterion[0]
			   +"\n\t- Description : "+criterion[1]
	           +"\n\t- Editeur : "+criterion[2]
	           +"\n-------- -------- -------- -------- \n"
	           +"\n\t- Note : "+criterion[3]
	           +"\n\t- Date de sortie : "+criterion[4]
	           +"\n\t- Mode de jeu : "+criterion[5]
	           +"\n\t- Forme de paiement : "+criterion[6]
	           +"\n\t\t-Prix : "+price
	           +"\n-------- -------- -------- -------- \n"
	           +"\n\t- Difficulté : "+criterion[7]
	           +"\n\t- Durée de jeu : "+criterion[8]
	           +"\n\t- Style de jeu : "+criterion[9]
	           +"\n\t- Style d'histoire : "+criterion[9]
	           +"\n\t- Support possibles : "+criterion[10]
	           +"\n\t- Lieu de vente : "+criterion[11]
	           +"\n-------- -------- -------- -------- "
			   +"\n-------- Score : "+score+" -------- "
		 	   +"\n-------- -------- -------- -------- ";
	}
}
