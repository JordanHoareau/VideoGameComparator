/**
 * 
 */
package demand;
import supply.Triplet;

/**
 * @author guitt
 *
 */
public abstract class DEquipement {
		// ATTRIBUTS
	protected Triplet<String, String, Integer>[] equipements;	// Contient l'ensemble des équipements souhaités (constructeur, nom, type).
	protected int size;											// Nombre de choix fait par le client.	

		
		// CONSTRUCTEUR 
	public DEquipement (String[] c, String[] n, int[] t, int s)
	{
		size = s;
		for (int i=0; i < size; i++)
		{
			equipements[i] = new Triplet<String, String, Integer>(c[i], n[i], t[i]);
		}
			
	}
		
		// METHODES 
	/**
	 * Fonction getName retourne le nom de l'accessoire.
	 * @return string : nom de l'accessoire.
	 */
	public Triplet<String, String, Integer>[] getEquipements()
	{
		return equipements;
	}
	
	/**
	 * Fonction retournant le nombre de choix fait par le client.
	 * @return size : int représenant le nombre d'accessoire choisit.
	 */
	public int getSize()
	{
		return size;
	}
}
