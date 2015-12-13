package score;

import demand.Demand;

public abstract class Score<E> {
	protected int score;
	public abstract E extractD(Demand D);
	public abstract int getScore(Demand D);
}
