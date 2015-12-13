package demand;

public class DBuyMethod {
	protected DPrice price;
	protected int method;
	public DBuyMethod(DPrice prix, int m)
	{
		price = prix;
		method = m;
	}

	public int getMethod()
	{
		return method;
	}
	
	public DPrice getPrice()
	{
		return price;
	}
}

