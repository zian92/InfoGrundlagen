package G04C.a26;

import G04C.ArrayVisualizer;
import G04C.VisualizableSort;

public class SelectionSort extends VisualizableSort {
	
	/**
	 * Ueberschriebener Standardkonstruktor der Oberklasse.
	 * @param av	Referenz auf den ArrayVisualizer fuer die Instanz dieses SelectionSort Objekt
	 */
	public SelectionSort(ArrayVisualizer av) {
		super(av);
	}


	/**
	 * Implementation von SelectionSort.
	 * @param a	Referenz auf das zu sortierende Integer Array Objekt
	 */
	public void sort(Integer[] a) {
		int minIndex = 0;
		
		for(int i = 0; i < a.length - 1; i++){
			minIndex = i;
			for(int j = i + 1; j < a.length; j++){
				if(a[j] < a[minIndex])
					minIndex = j;
			}
			if(i != minIndex)
				swap(a, i, minIndex);
			update();
		}
	}

}
