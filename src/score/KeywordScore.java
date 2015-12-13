package score;

public abstract class KeywordScore extends Score<KeywordScore>{	
	
	public abstract String getString();
	
	public void getScore(KeywordScore s){
		String[] s_split = getString().split(" ");
		String[] d_split = s.getString().split(" ");
		
		
		
		
		
		
	}
}
