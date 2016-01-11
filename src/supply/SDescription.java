package supply;


public class SDescription extends SKeywords{
	public SDescription(String s){
		super(s);
	}
	public String extractD(DemandMethods myDemand)
	{
		return myDemand.getDescription();
	}
}
