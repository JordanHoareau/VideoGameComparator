package main;

import comparator.Comparator;
import supply.*;
import demand.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demand d = new Demand(new DTitle(null), new DDescription(), new DEditor(), new DMark(0, 0), new DReleaseDate(null, null), new DGameType(0), new DBuyMethod(new DPrice(30, 70), 1), new DDifficulty(0), new DLifeTime(0), new DGameStyle(0), new DStoryType(null, 0), new DGameSupport(null, null, null, 0), new DAccessory(null, null, null, 0),null , 0);
		Supply[] s = new Supply[5];
		s[0] = new Supply(new SGameType(1),new SBuyMethod(new SPrice(50), 1),2);
		s[1] = new Supply(new SGameType(0),new SBuyMethod(new SPrice(50), 0),2);
		s[2] = new Supply(new SGameType(0),new SBuyMethod(new SPrice(50), 0),2);
		s[3] = new Supply(new SGameType(1),new SBuyMethod(new SPrice(50), 1),2);
		s[4] = new Supply(new SGameType(0),new SBuyMethod(new SPrice(50), 1),2);
		Comparator c = new Comparator(s, 5, d);
		c.Compare();
		c.AfficherScore();
		//d.setdtitle("Guild Wars 2");
	}
}
