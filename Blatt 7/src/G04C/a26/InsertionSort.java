package G04C.a26;

import G04C.ArrayVisualizer;
import G04C.VisualizableSort;

public class InsertionSort extends VisualizableSort {
	
	/**
	 * Ueberschriebener Standardkonstruktor der Oberklasse.
	 * @param av	Referenz auf den ArrayVisualizer fuer die Instanz dieses InsertionSort Objekt
	 */
	public InsertionSort(ArrayVisualizer av) {
		super(av);
	}


	/**
	 * Implementation von InsertionSort.
	 * @param a	Referenz auf das zu sortierende Integer Array Objekt
	 */
	public void sort(Integer[] a) {
		int searchIndex = 0;
		int tempVal = 0;
		
		for(int i = 1; i < a.length; i++){
			
			tempVal = a[i];
			searchIndex = i - 1;
			while((searchIndex >= 0) && (a[searchIndex] > tempVal)){
				a[searchIndex + 1] = a[searchIndex];
				searchIndex--;
				update();
			}
			a[searchIndex + 1] = tempVal;
		}
	}

}
