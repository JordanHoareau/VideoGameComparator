/**
 * 
 */
package supply;
import score.BinaryScore;

/**
 * @author guitt
 *
 */
public class SBuyMethod extends BinaryScore{
		//	ATTRIBUTS
	protected SPrice price;
	
		//CONSTRUCTEURS
	/**
	 * Constructeur par défaut.
	 * @param prix : prix du jeu.
	 * @param c    : forme de paiement pour ce jeu.c
	 */
	public SBuyMethod(SPrice prix, int c)
	{
		super("Abonnement", "Licence", c);
		price = prix;
	}

		// METHODES
	public Integer extractD(DemandMethods myDemand)
	{
		return myDemand.getDBuyMethod();
	}
}
