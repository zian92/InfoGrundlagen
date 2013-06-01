package G04C.a28;

/**
 * Implementation der in Aufgabe 28 geforderten Klasse zur Bestimmung der Anzahl aller Natuerlicher Zahlen,
 * die sowohl in einem festen Integer-Feld als auch einem waehlbaren Intervall liegen.
 * @author Henner
 *
 */
public class RangeCount {
	
	private Integer[] data, counts;
	private int range;
	
	/**
	 * Standardkonstruktor fuer RangeCount.
	 * @param data	das zu verarbeitende Array.
	 */
	public RangeCount(Integer[] data){
		this.data = data;
		range = 0;
		countNumbers();
	}
	
	/**
	 * Diese Methode berechnet, wie viele Zahlen aus <code>data</code> im Intervall [<code>begin</code>,<code>end</code> - 1] liegen.
	 * Dabei muessen begin und end positiv sein und begin echt kleiner als end, andernfalls wird 0 zurueckgegeben.
	 * @param begin	die untere Grenze des Intervalls.
	 * @param end	die obere Grenze des Intervalls
	 * @return	Anzahl der Elemente aus <code>data</code> im Intervall [<code>begin</code>,<code>end</code> - 1]
	 */
	public int count(int begin, int end){
		int sum = 0;
		
		if (!(begin >= end || begin > range)) {
			if (end > range + 1)
				end = range + 1;
			sum = counts[end - 1];
			if (begin > 0)
				sum -= counts[begin - 1];
		}
		
		return sum;
	}
	
	/**
	 * Hilfsmethode:
	 * Zaehlt die Haeufigkeit x einer jeden Zahl in <code>data</code> und speichert diesen Wert in <code>counts</code> an der x-ten Stelle ab.
	 * Anschliessend werden die Haeufigkeiten in <code>counts</code> von unten nach oben aufsummiert.
	 */
	private void countNumbers(){
		for (int i = 0; i<data.length; i++){
			if(data[i] < 0)
				throw new IllegalArgumentException("Feld enthaelt Elemente kleiner Null oder groesser k");		
			if(data[i] > range)
				range = data[i];
		}

		counts = new Integer[range+1];
		
		for(int j = 0; j < counts.length; j++)
			counts[j] = 0;
		
		for(int j = 0; j < data.length; j++){
			counts[data[j]] += 1;			
		}

		for(int j = 1; j < counts.length; j++)
				counts[j] += counts[j-1];
		
	}

}
