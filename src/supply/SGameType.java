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
public class SGameType extends BinaryScore {
	// CONSTRUCTEURS
	public SGameType(int m)
	{
		super("Hors Ligne", "En Ligne", m); // Appel le constructeur de BinaryScore.
	}

	public Integer extractD(Demand D) {
		return D.getDGameType();
	}
}
