package main;

import java.util.Calendar;
import comparator.Comparator;
import supply.*;
import demand.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(Calendar.YEAR,2008 );
		cal2.set(Calendar.YEAR,2013 );
		Demand d = new Demand(new DTitle(null), new DDescription(), new DEditor(), new DMark(16, 18), new DReleaseDate(cal1, cal2), new DGameType(0), new DBuyMethod(new DPrice(30, 70), 1), new DDifficulty(0), new DLifeTime(0), new DGameStyle(0), new DStoryType(null, 0), new DGameSupport(null, null, null, 0), new DAccessory(null, null, null, 0),null , 0);
		Supply[] s = new Supply[5];
		
		cal1.set(2009,8,0,0,0);
		s[0] = new Supply(new SGameType(1), new SBuyMethod(new SPrice(75), 1), new SMark(1) , new SReleaseDate(cal1));
		cal1.set(2006,7,0,0,0);
		s[1] = new Supply(new SGameType(0), new SBuyMethod(new SPrice(45), 0), new SMark(10), new SReleaseDate(cal1));
		cal1.set(2005,6,0,0,0);
		s[2] = new Supply(new SGameType(0), new SBuyMethod(new SPrice(35), 0), new SMark(18), new SReleaseDate(cal1));
		cal1.set(2008,5,0,0,0);
		s[3] = new Supply(new SGameType(1), new SBuyMethod(new SPrice(25), 1), new SMark(19), new SReleaseDate(cal1));
		cal1.set(2012,5,0,0,0);
		s[4] = new Supply(new SGameType(0), new SBuyMethod(new SPrice(45), 1), new SMark(16), new SReleaseDate(cal1));
		Comparator c = new Comparator(s, 5, d);
		c.Compare();
		c.AfficherScore();
		//d.setdtitle("Guild Wars 2");
	}
}
