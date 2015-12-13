package supply;

import demand.Demand;
import score.Score;

public class Supply {
	protected int score;
	protected int length_C;
	private Score<?> criterion[];
	
	public Supply(int gm, int size)
	{
		criterion = new Score[size];
		criterion[0] = new SGameType(gm);
		length_C = 1;
		score = 0;
	}
	
	public void Compare(Demand myDemand)
	{
		for (int i=0; i< length_C; i++)
			score += criterion[i].getScore(myDemand);
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String toString()
	{
		return "Le score de cette offre est: "+score;
	}
}
