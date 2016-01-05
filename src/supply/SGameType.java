/**
 * 
 */
package supply;

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

	public Integer extractD(DemandMethods myDemand) {
		return myDemand.getDGameType();
	}

	@Override
	public int getScoreSpe(DemandMethods myDemand) {
		return 0;
	}
}
