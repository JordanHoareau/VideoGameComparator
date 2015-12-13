package comparator;

import demand.Demand;
import supply.Supply;

public class Comparator {
	private Supply[] supply;
	private Demand demand;
	private int length;
	public Comparator(Supply[] supply1, int size, Demand D)
	{
		length = size;
		supply = new Supply[size];
		for(int i=0; i < size; i++)
			supply[i] = supply1[i];
		demand = D;
		
	}
	
	public void Compare()
	{
		for(int i=0; i<length; i++)
		{
			supply[i].Compare(demand);
		}
	}
	
	public void AfficherScore()
	{
		for (int i =0; i < length; i++)
			System.out.println(supply[i]);
	}
}
