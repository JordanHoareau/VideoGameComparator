/**
 * 
 */
package supply;

import demand.Demand;
import score.BinaryScore;

/**
 * @author guitt
 *
 */
public class SBuyMethod extends BinaryScore{
	protected SPrice price;
	//CONSTRUCTEURS
	public SBuyMethod(SPrice prix, int m)
	{
		super("Abonnement", "Licence", m);
		price = prix;
	}
	
	public Integer extractD(Demand D)
	{
		return D.getDBuyMethod();
	}
}
