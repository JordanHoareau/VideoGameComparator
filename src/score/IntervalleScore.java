/**
 * 
 */
package score;

import supply.DemandMethods;
import supply.Intervalle;

/**
 * @author guitt
 *
 */
public abstract class IntervalleScore extends Score<Intervalle> {
		// ATTRIBUTS
	protected float val;		// Contient la valeur encapsulée par un objet IntervalleScore.
	protected boolean desc;	// Définit l'état dans lequel on est entre : une valeur inférieur est moins grave qu'une valeure supérieur ou inverse.
	
		// CONSTRUCTEUR
	public IntervalleScore(float item)
	{
		val      = item;
		scoreMax = 100;
		desc     = true;
	}
	
		// METHODES 
	public int getScore(DemandMethods myDemand)
	{
		Intervalle field = extractD(myDemand);
		if(desc)
		{
			if(val >= field.getFirst() && val<=field.getSecond())
				return score = scoreMax;
			else
				return score = (val< field.getFirst())? (int) Math.max((scoreMax-0.5*(field.getFirst()-val)),0):(int)Math.max((scoreMax-(val-field.getSecond())),0);
		}
		else
		{
			if(val>=field.getFirst() && val<=field.getSecond())
				return score = scoreMax;
			else
				return score = (val< field.getFirst())? (int)Math.max((scoreMax-(field.getFirst()-val)),0):Math.max((int)(scoreMax-0.5*(val-field.getSecond())),0);
		}		
	}
}
