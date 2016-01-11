package main;

import comparator.Comparator;
import supply.*;
import demand.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demand d = new Demand(new DTitle("Guild Guild Wars 2"), new DDescription("Meilleur jeu de l'année"), new DEditor("ArenaNet"), new DMark(0, 0), new DReleaseDate(null, null), new DGameType(0), new DBuyMethod(new DPrice(30, 70), 1), new DDifficulty(0), new DLifeTime(0), new DGameStyle(0), new DStoryType(null, 0), new DGameSupport(null, null, null, 0), new DAccessory(null, null, null, 0),null , 0);
		Supply[] s = new Supply[5];

		s[0] = new Supply(new STitle("Guild Guild Wars 2"), 
				   new SDescription(" "), 
				   new SEditor("ArenaNet"), 
				   new SMark(), 
				   new SReleaseDate(), 
				   new SGameType(0), 
				   new SBuyMethod(new SPrice(0),0), 
				   new SDifficulty(), 
				   new SLifeTime(), 
				   new SGameStyle(), 
				   new SStoryType(), 
				   new SGameSupport(), 
				   new SAccessory(), 
				   new SSale[1] , 0);
		
		s[1] = new Supply(new STitle("Guild Wars 2"), 
				   new SDescription(" "), 
				   new SEditor("ArenaNet"), 
				   new SMark(), 
				   new SReleaseDate(), 
				   new SGameType(0), 
				   new SBuyMethod(new SPrice(0),0), 
				   new SDifficulty(), 
				   new SLifeTime(), 
				   new SGameStyle(), 
				   new SStoryType(), 
				   new SGameSupport(), 
				   new SAccessory(), 
				   new SSale[1] , 0);
		
		s[2] = new Supply(new STitle("Guild Wars 2"), 
				   new SDescription(" "), 
				   new SEditor("ArenaNet"), 
				   new SMark(), 
				   new SReleaseDate(), 
				   new SGameType(0), 
				   new SBuyMethod(new SPrice(0),0), 
				   new SDifficulty(), 
				   new SLifeTime(), 
				   new SGameStyle(), 
				   new SStoryType(), 
				   new SGameSupport(), 
				   new SAccessory(), 
				   new SSale[1] , 0);
		
		s[3] = new Supply(new STitle("Guild Wars 2"), 
				   new SDescription(" "), 
				   new SEditor("ArenaNet"), 
				   new SMark(), 
				   new SReleaseDate(), 
				   new SGameType(0), 
				   new SBuyMethod(new SPrice(0),0), 
				   new SDifficulty(), 
				   new SLifeTime(), 
				   new SGameStyle(), 
				   new SStoryType(), 
				   new SGameSupport(), 
				   new SAccessory(), 
				   new SSale[1] , 0);
		
		s[4] = new Supply(new STitle("Guild Wars 2"), 
				   new SDescription(" "), 
				   new SEditor("ArenaNet"), 
				   new SMark(), 
				   new SReleaseDate(), 
				   new SGameType(0), 
				   new SBuyMethod(new SPrice(0),0), 
				   new SDifficulty(), 
				   new SLifeTime(), 
				   new SGameStyle(), 
				   new SStoryType(), 
				   new SGameSupport(), 
				   new SAccessory(), 
				   new SSale[1] , 0);

		Comparator c = new Comparator(s, 5, d);
		c.Compare();
		c.AfficherScore();
		//d.setdtitle("Guild Wars 2");
	}

}
