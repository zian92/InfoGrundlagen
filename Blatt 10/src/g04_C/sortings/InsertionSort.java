package g04_C.sortings;

import g04_C.ArrayVisualizer;
import g04_C.VisualizableSort;

public class InsertionSort extends VisualizableSort {

	/**
	 * count Attribut zum Zaehlen der Schleifendurchlaeufe.
	 */
	private int count;
	private int countswap;

	/**
	 * Ueberschriebener Standardkonstruktor der Oberklasse.
	 * 
	 * @param av
	 *            Referenz auf den ArrayVisualizer fuer die Instanz dieses BubbleSort Objekt
	 */
	public InsertionSort(ArrayVisualizer av) {
		super(av);
	}

	/**
	 * 
	 * @param av
	 * @param d
	 */
	public InsertionSort(ArrayVisualizer av, Integer[] d) {
		super(av);
		av.setData(d);
		av.paintComponent(av.getGraphics());
	}

	/**
	 * Implementation von InsertionSort.
	 * 
	 * @param a
	 *            Referenz auf das zu sortierende Integer Array
	 */
	public void sort(Integer[] a) {
		av.paintComponent(av.getGraphics());
		count = 0;
		countswap = 0;

		int searchIndex = 0;
		int tempVal = 0;

		for (int i = 1; i < a.length; i++) {

			tempVal = a[i];
			searchIndex = i - 1;
			while ((searchIndex >= 0) && (a[searchIndex] > tempVal)) {
				a[searchIndex + 1] = a[searchIndex];
				searchIndex--;
				countswap++;
				update();
			}
			a[searchIndex + 1] = tempVal;
			countswap++;
			count++;
		}
	}

	/**
	 * Selektor für das Count Attribut.
	 * 
	 * @return
	 */
	public int getCount() {
		return count;
	}

	public int getCountSwap() {
		return countswap;
	}
}
