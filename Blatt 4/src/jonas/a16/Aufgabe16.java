package jonas.a16;

/**
* Uebungsgruppe G04-C Henner Niehaus, Jonas Stadler, Eva Poell
*
* Testklasse zu Aufgabe 16, Blatt 2
*
*/
public class Aufgabe16 {

	/**
	 * StartFunkion die den den Algorithmus aus <code>getMinIndex</code> testet.
	 * @param args
	 */
	public static void main(String[] args) {
		int temp = getMinIndex(new int[] { 13, 232, 45, 67, 4, 323, 4, 54, 54, 23, 23, });
		System.out.println(temp);
	}

	/**
	 * Gibt den Index des Feldes mit dem minimalen Wert zurück 
	 * @param feld ein zu untersuchendes Feld
	 * @return index des kleinsten Elementes 
	 * @throws NullPointerException fue ein leeres Feld
	 */
	public static int getMinIndex(int[] feld) throws NullPointerException {
		if (feld.length == 0 || feld == null) throw new NullPointerException();
		int minIndex = 0;
		int minVal = feld[0];

		for (int i = 0; i < feld.length; i++) {
			if (feld[i] < minVal) {
				minVal = feld[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
