package supply;

import java.util.Date;

public class SReleaseDate extends Supply{
	private Date date;
	
	public SReleaseDate(){
		date = new Date();
	}
	
	@SuppressWarnings("deprecation")
	public SReleaseDate(int y, int m, int d){
		date = new Date(y,m,d);
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
