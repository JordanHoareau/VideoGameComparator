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
	 * Fonction retournant le premier �l�ment du couple.
	 * @return first : du type d�clar� par A, repr�sente le premier item du couple.
	 */
	public A getFirst()
	{
		return first;
	}
	
	/**
	 * Fonction retournant le second �l�ment du couple.
	 * @return first : du type d�clar� par B, repr�sente le second item du couple.
	 */
	public B getSecond()
	{
		return second;
	}
	
	/**
	 * Fonction retournant le troisi�me �l�ment du couple.
	 * @return first : du type d�clar� par C, repr�sente le troisi�me item du couple.
	 */
	public C getThird()
	{
		return third;
	}
}
