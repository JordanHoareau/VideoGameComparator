/**
 * 
 */
package supply;

/**
 * @author guitt
 *
 */
public class Triplet<A,B,C> {
	// ATTRIBUTS
	private A first;
	private B second;
	private C third;
	
		// CONSTRUCUTEURS
	public Triplet(A f, B s, C t)
	{
		first = f;
		second = s;
		third = t;
	}
		// METHODES
	/**
	 * Fonction retournant le premier élément du couple.
	 * @return first : du type déclaré par A, représente le premier item du couple.
	 */
	public A getFirst()
	{
		return first;
	}
	
	/**
	 * Fonction retournant le second élément du couple.
	 * @return first : du type déclaré par B, représente le second item du couple.
	 */
	public B getSecond()
	{
		return second;
	}
	
	/**
	 * Fonction retournant le troisième élément du couple.
	 * @return first : du type déclaré par C, représente le troisième item du couple.
	 */
	public C getThird()
	{
		return third;
	}
}
