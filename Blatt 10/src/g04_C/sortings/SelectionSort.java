package g04_C.sortings;

import g04_C.ArrayVisualizer;
import g04_C.VisualizableSort;

public class SelectionSort extends VisualizableSort {

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
	public SelectionSort(ArrayVisualizer av) {
		super(av);
	}

	/**
	 * 
	 * @param av
	 * @param d
	 */
	public SelectionSort(ArrayVisualizer av, Integer[] d) {
		super(av);
		av.setData(d);
		av.paintComponent(av.getGraphics());
	}

	/**
	 * Implementation von SlectionSort.
	 * 
	 * @param a
	 *            Referenz auf das zu sortierende Integer Array
	 */
	public void sort(Integer[] a) {
		av.paintComponent(av.getGraphics());
		count = 0;
		countswap = 0;
		int minIndex = 0;

		for (int i = 0; i < a.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) minIndex = j;
			}
			if (i != minIndex) {
				swap(a, i, minIndex);
				countswap++;
			}
			count++;
			update();
		}
	}

	/**
	 * Rekursive Implementierung von BubbleSort.
	 * 
	 * @param a
	 *            Referenz auf das zu sortierende Integer Array.
	 */

	public void sortR(Integer[] a) {
		for (int i = 0; i <= a.length - 2; i++) {
			if (a[i] > a[i + 1]) { // falls das erste Element groesser ist, wird es getauscht
				this.swap(a, i, i + 1);
			}
			update();
		}
		if (!this.checkArray(a)) sortR(a);
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
