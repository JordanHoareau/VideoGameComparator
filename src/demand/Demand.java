
/**
 * @author guitt
 *
 */

package demand;
/* Titre - Description - Editeur - Prix -
Note du jeu - Date de sortie - Mode de jeu - 
Mode de paiement - Difficulté - Durée de vie - 
Style de l'histoire - Support de jeu - Jouable avec accessoires - Lieu d'achat - Type de jeu*/ 

public class Demand {
	private DTitle dtitle;
	private DDescription ddesc;
	private DEditor dedit;
	private DPrice dprice;
	private DMark dmark;
	private DReleaseDate drd;
	private DGameType dgm;
	private DPaiementMethod dpm;
	private DDifficulty ddiff;
	private DLifeTime dlt;
	private DStoryType dst;
	private DGameSupport dgs;
	private DAccessory dacce;
	private DBuyMethod dbm;
	private DGameType dgt;

	/*
	 * getDGameType : prend la valeur Type contenu dans l'objet getDGameType.
	 */
	public int getDGameType()
	{
		return dgm.getType();
	}
	
	public int getDBuyMethod()
	{
		return dbm.getMethod();
	}
	
	public int getDLifeTime()
	{
		return dlt.getTime();
	}
	public Demand(DGameType gm, DBuyMethod bm, DLifeTime lt, DDifficulty diff, DTitle title, DDescription desc, DEditor deit )
	{
		dgm = gm;
		dbm = bm;
		dlt = lt;
		ddiff = diff;
		
	}
}
