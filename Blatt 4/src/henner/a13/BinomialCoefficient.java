package henner.a13;
/**
 * Klasse zur Realisierung der Definition des Binomialkoeffizienten (n ueber k), der fuer zwei
 * Natuerliche Zahlen n und k mit n >= k angibt, wie viele k-elementige Teilmengen es von einer n-elementigen Menge gibt.
 * @author Henner
 *
 */
public class BinomialCoefficient {
	
	private int n;
	private int k;
	
	/**
	 * Standard-Konstruktor. Setzt die Attribute n und k auf die uebergebenen Werte. Dabei gilt die Einschraenkung, dass n und k 
	 * nicht negativ sein duerfen und k nicht groesser als n sein darf.
	 * @param n		der Wert von n in (n ueber k)
	 * @param k		der Wert von k in (n ueber k)
	 * @throws IllegalArgumentException		falls n kleiner k oder ein Parameter negativ gewaehlt wurde.
	 */
	public BinomialCoefficient(int n, int k) throws IllegalArgumentException{
		if(n < k || n < 0 || k < 0)
			throw new IllegalArgumentException("n oder k sind ungueltig gewaehlt.");
		this.n = n;
		this.k = k;
	}
	
	/**
	 * Die Methode berechnet den konkreten Wert des Binomialkoeffizienten (n ueber k) mit den Attributen n und k dieses Objekts
	 * und gibt diesen zurueck.
	 * @return	Wert des Binomialkoeffizienten (n ueber k)
	 */
	public int eval(){
		
/* ***** Iterative Berechnung des Binomialkoeffizienten *****/
//		int bnc = 1;
//		if(!(k == 0 || k == n)){
//			for(int i = n - k + 1; i <= n; i++)
//				bnc *= i;
//			for(int i = 1; i <= k; i++)
//				bnc /= i;
//		}
//		
//		return bnc;
		return calcBinomRecursive(getN(), getK());
	}
	
	/**
	 * Rekursiv definierte Hilfsfunktion um den Binomialkoeffizienten mit der Funktionsdefinition vom
	 * Aufgabenblatt auszurechnen
	 * @param n		aus (n ueber k)
	 * @param k		aus (n ueber k)
	 * @return		den Wert des Binomialkoeffizienten
	 */
	private int calcBinomRecursive(int n, int k){
		if(k == 0 || n == k)
			return 1;
		else
			return calcBinomRecursive(n-1, k) + calcBinomRecursive(n-1, k-1);
	}
	
	/**
	 * Selektor um n des Binomialkoeffizienten (n ueber k) zu erhalten.
	 * @return	n	wie in (n ueber k)
	 */

	public int getN() {
		return n;
	}
	/**
	 * Selektor um n des Binomialkoeffizienten (n ueber k) zu setzen.
	 * @param n		wie in (n ueber k)
	 * @throws IllegalArgumentException		falls n negativ oder kleiner k gewaehlt wird
	 */
	public void setN(int newN)  throws IllegalArgumentException{
		if(newN < 0 || newN < this.k)
			throw new IllegalArgumentException("Ungueltiger Wert fuer n");
		this.n = newN;
	}

	/**
	 * Selektor-Methode um k des Binomialkoeffizienten (n ueber k) zu erhalten.
	 * @returnk k	wie in (n ueber k)
	 */

	public int getK() {
		return k;
	}

	/**
	 * Selektor um k des Binomialkoeffizienten (n ueber k) zu setzen.
	 * @param k		wie in (n ueber k)
	 * @throws IllegalArgumentException		falls k negativ oder groesser n gewaehlt wird
	 */
	public void setK(int newK)  throws IllegalArgumentException{
		if(newK < 0 || this.n < newK)
			throw new IllegalArgumentException("Ungueltiger Wert fuer k");
		this.k = newK;
	}

}
