package demand;

public class DStoryType {
		// ATTRIBUT
	protected int type[];	// Num�ro du choix du style d'histoire.
	protected int size;		// Nombre de choix fait par le client.
	
		// CONSTRUCTEUR
	public DStoryType(int t[], int s)
	{
		size = s;
		type = new int[size];
		for(int i=0; i<size; i++)
			type[i] = t[i];  
	}
	
		// METHODE
	/**
	 * Fonction retournant le choix du type d'histoire
	 * @return type : int[] repr�sentant l'ensemble des types d'histoire choisit.
	 */
	public int[] getType()
	{
		return type;
	}
	
	/**
	 * Fonction retournant le nombre de choix fait par le client.
	 * @return size : int repr�sentant le nombre de choix.
	 */
	public int getSize()
	{
		return size;
	}
	
	
}
