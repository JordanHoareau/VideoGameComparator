package score;


public abstract class Score<E> {
	protected int score;
	
	public abstract void getScore(E field);
}
