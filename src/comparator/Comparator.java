package comparator;

import demand.Demand;
import supply.Supply;

public class Comparator {
	
		// ATTRIBUTS
	private Supply[] supply;	// Ensemble des offres proposées.
	private Demand demand;		// Demande soumise par le client.
	private int length;			// Nombre d'offres présentent.
	
		// CONSTRUCTEUR
	public Comparator(Supply[] supply1, int size, Demand D)
	{
		length = size;
		supply = new Supply[size];
		for(int i=0; i < size; i++)
			supply[i] = supply1[i];
		demand = D;
	}
	
		// METHODES
	/**
	 * Fonction permettant de comparer chaque offre avec la demande.
	 */
	public void Compare()
	{
		for(int i=0; i<length; i++)
			supply[i].compare(demand);
	}
	
	/**
	 * Fonction affichant le score final de chaque offre par rapport à la demande du client.
	 */
	public void AfficherScore()
	{
		for (int i =0; i < length; i++)
			System.out.println(supply[i]+"\n");
	}
}
