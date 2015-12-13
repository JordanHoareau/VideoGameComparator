package main;
import demand.DBuyMethod;
import demand.DGameType;
import demand.DPrice;
import demand.Demand;
import comparator.Comparator;
import supply.SBuyMethod;
import supply.SGameType;
import supply.SPrice;
import supply.Supply;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demand d = new Demand(new DGameType(0), new DBuyMethod(new DPrice(500), 1) );
		Supply[] s = new Supply[5];
		s[0] = new Supply(new SGameType(1),new SBuyMethod(new SPrice(500), 1),2);
		s[1] = new Supply(new SGameType(0),new SBuyMethod(new SPrice(500), 0),2);
		s[2] = new Supply(new SGameType(0),new SBuyMethod(new SPrice(500), 0),2);
		s[3] = new Supply(new SGameType(1),new SBuyMethod(new SPrice(500), 1),2);
		s[4] = new Supply(new SGameType(0),new SBuyMethod(new SPrice(500), 1),2);
		Comparator c = new Comparator(s, 5, d);
		
		c.Compare();
		c.AfficherScore();
		//d.setdtitle("Guild Wars 2");
	}

}
