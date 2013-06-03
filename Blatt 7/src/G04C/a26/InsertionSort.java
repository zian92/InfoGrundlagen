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
	
	/**
	 * Wrapper Methode zur rekursiven Implementation von Insertion Sort
	 * @param a	Referenz auf das zu sortierende Integer Array Objekt
	 */
	public void sortR(Integer[] a) {

		sortInner(a, 1);
		
	}
	
	/**
	 * Eigentliche InsertionSort Methode (rekursiv)
	 * @param a	das zu sortierende Array
	 * @param i	Index des aktuell einzusortierenden Elements
	 */
	private void sortInner(Integer[] a, int i) {
		int searchIndex = 0;
		int tempVal = 0;
			
		tempVal = a[i];
		searchIndex = i - 1;
		while((searchIndex >= 0) && (a[searchIndex] > tempVal)){
			a[searchIndex + 1] = a[searchIndex];
			searchIndex--;
			update();
		}
		a[searchIndex + 1] = tempVal;
		i++;
		if(i < a.length)
			sortInner(a, i);
	}

}
