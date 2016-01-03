package score;

import supply.DemandMethods;

public abstract class Score<E> {
	protected int score;
	public abstract E extractD(DemandMethods myDemand);
	public abstract int getScore(DemandMethods myDemand);
	
	public String toString(){
		return "Le score de ce critère est: "+score;
	}
}
