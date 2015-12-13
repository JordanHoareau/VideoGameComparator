package main;
import demand.Demand;
import comparator.Comparator;
import supply.Supply;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demand d = new Demand(0);
		Supply[] s = new Supply[5];
		s[0] = new Supply(1,1);
		s[1] = new Supply(0,1);
		s[2] = new Supply(0,1);
		s[3] = new Supply(1,1);
		s[4] = new Supply(0,1);
		Comparator c = new Comparator(s, 5, d);
		
		c.Compare();
		c.AfficherScore();
		//d.setdtitle("Guild Wars 2");
	}

}
