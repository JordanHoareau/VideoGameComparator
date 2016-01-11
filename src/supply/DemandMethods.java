/**
 * 
 */
package supply;

/**
 * @author guitt
 *
 */
public interface DemandMethods {
	public String getTitle();
	public String getDescription();
	public String getEditor();
	public Intervalle getPrice();
	public Intervalle getMark();
	public Intervalle getReleaseDate();
	public int getDGameType();
	public int getDBuyMethod();
	public int getDifficulty();
	public int getDLifeTime();
	public int getGameStyle();
	public int[] getStoryType();
	public int getStoryTypeSize();
	public Triplet<String, String, Integer>[] getGameSupportEquipements();
	public int getGameSupportSize();
	public Triplet<String, String, Integer>[] getAccessoryEquipements();
	public int getAccessorySize();
}
