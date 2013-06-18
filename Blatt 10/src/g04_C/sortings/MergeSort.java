package g04_C.sortings;

import g04_C.ArrayVisualizer;
import g04_C.VisualizableSort;

public class MergeSort extends VisualizableSort {

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
	public MergeSort(ArrayVisualizer av) {
		super(av);
	}

	/**
	 * 
	 * @param av
	 * @param d
	 */
	public MergeSort(ArrayVisualizer av, Integer[] d) {
		super(av);
		av.setData(d);
		av.paintComponent(av.getGraphics());
	}

	/**
	 * Implementation von BubbleSort.
	 * 
	 * @param a
	 *            Referenz auf das zu sortierende Integer Array
	 */
	public void sort(Integer[] a) {
		av.paintComponent(av.getGraphics());
		count = 0;
		countswap = 0;
		msort(a, 0, a.length - 1);
	}

	protected void msort(Integer[] data, int li, int re) {
		count++;
		int i, j, k;
		int[] b = new int[data.length];

		if (re > li) {
			// zu sortierendes Feld teilen
			int mid = (re + li) / 2;
			// Teilfelder sortieren
			msort(data, li, mid);
			msort(data, mid + 1, re);

			// Hilfsfeld aufbauen
			for (k = li; k <= mid; k++) {
				b[k] = data[k];
			}
			for (k = mid; k < re; k++) {
				b[re + mid - k] = data[k + 1];
				countswap++;
			}

			// Ergebnisse mischen ueber Hilfsfeld b
			i = li;
			j = re;
			for (k = li; k <= re; k++) {
				if (b[i] < b[j]) {
					data[k] = b[i++];
					
				} else {
					data[k] = b[j--];
				}
				countswap++;
			}
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
