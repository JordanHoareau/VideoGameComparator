package score;

import demand.Demand;

import java.util.Map;
import java.util.TreeMap;
public abstract class KeywordScore extends Score<String>{
	
	// ATTRIBUTS
	String element;
	
	// CONSTRUCTEURS
	public KeywordScore(String item){
		element = item;
	}
	
	// METHODES
	
	
	public int getScore(Demand d){
		
		int score = 0;
		
		// Mots-cl�s de chaque champ
		String[] s_split = element.split(" ");
		String[] d_split = extractD(d).split(" ");
		
		// Occurences de chaque mot de la cha�ne de l'offre
		TreeMap<String,Integer> occur = new TreeMap<String,Integer>();
		for(int i = 0; i < s_split.length; i++){
			if(occur.containsKey(s_split[i])) occur.put(s_split[i], occur.get(s_split[i])+1);
			else occur.put(s_split[i],1);
		}
		
		// Comparaison de la map des occurences avec la cha�ne de la demande
		for(Map.Entry<String, Integer> entry : occur.entrySet()){
			int cpt = 0;
			int j = 0;
			while(j < d_split.length && cpt <= entry.getValue()){
				if(d_split[j]==entry.getKey()){
					score++;
					cpt++;
				}
				j++;
			}
		}
		return score;
	}
}
