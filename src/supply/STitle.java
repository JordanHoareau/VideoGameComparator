package supply;

public class STitle extends SKeywords{
	
	public STitle(String s){
		super(s);
	}	
	public String extractD(DemandMethods myDemand)
	{
		return myDemand.getTitle();
	}
}
