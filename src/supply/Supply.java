package supply;

import score.Score;

public class Supply {
	
		// ATTRIBUTS
	protected int score;
	protected int length_C;
	private Score<?> criterion[];
	
		// CONSTRUCTEUR
	public Supply(SGameType gm, SBuyMethod bm, int size)
	{
		criterion = new Score[size];
		criterion[0] = gm;
		criterion[1] = bm;
		length_C = 2;
		score = 0;
	}
		
		// METHODES
	
	public void compare(DemandMethods myDemand)
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
