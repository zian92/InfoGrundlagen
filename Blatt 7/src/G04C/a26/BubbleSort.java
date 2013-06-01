package G04C.a26;

import G04C.ArrayVisualizer;
import G04C.VisualizableSort;

public class BubbleSort extends VisualizableSort {

	/**
	 * count Attribut zum Zaehlen der Schleifendurchlaeufe.
	 */
	private int count;

	/**
	 * Ueberschriebener Standardkonstruktor der Oberklasse.
	 * @param av	Referenz auf den ArrayVisualizer fuer die Instanz dieses BubbleSort Objekt
	 */
	public BubbleSort(ArrayVisualizer av) {
		super(av);
	}

	/**
	 * 
	 * @param av
	 * @param d
	 */
	public BubbleSort(ArrayVisualizer av, Integer[] d) {
		super(av);
		av.setData(d);
		av.paintComponent(av.getGraphics());
	}

	/**
	 * Implementation von BubbleSort.
	 * @param a	Referenz auf das zu sortierende Integer Array
	 */
	public void sort(Integer[] a) {
		av.paintComponent(av.getGraphics());
		count = 0;
		int len = a.length - 2;

		while (!this.checkArray(a)) {// wiederhohlung solange array nicht sortiert
			for (int i = 0; i <= len; i++) {
				if (a[i] > a[i + 1]) { // falls das erste Element groesser ist, wird es getauscht
					this.swap(a, i, i + 1);
					count++;
					super.update();
				}
			}
		}
	}
	
	/**
	 * Rekursive Implementierung von BubbleSort.
	 * @param a	Referenz auf das zu sortierende Integer Array.
	 */

	public void sortR(Integer[] a) {
		for (int i = 0; i <= a.length - 2; i++) {
			if (a[i] > a[i + 1]) { // falls das erste Element groesser ist, wird es getauscht
				this.swap(a, i, i + 1);
			}
		}
		if (!this.checkArray(a)) sortR(a);
	}
	
	/**
	 * Selektor für das Count Attribut.
	 * @return
	 */
	public int getCount() {
		return count;
	}
}
