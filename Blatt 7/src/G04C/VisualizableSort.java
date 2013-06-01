package G04C;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Abstrakte Oberklasse, die eine Grundfunktionalitaet fuer Visualisierung und Testen von Sortier-Verfahren bereit stellt.
 */
abstract public class VisualizableSort {

	// Referenz auf die Visualisierungskomponente
	protected ArrayVisualizer av;
	protected Timer timer;
	protected Integer[] data;

	/**
	 * Konstruktor, der eine Referenz auf eine Objekt der Klasser <code>ArrayVisualizer</code> entgegen nimmt. Dieses Objekt wird in der <code>update</code>-Methode genutzt, um den aktuellen Zustand des Felds zu visualisieren.
	 * 
	 * @param av
	 *            Referenz auf Visualisierungs-Objekt
	 */
	public VisualizableSort(ArrayVisualizer av) {
		this.av = av;
	}

	/**
	 * Methode, die ein uebergebenes Feld von <code>Integer</code>- Werten sortiert. Die Einschraenkung auf diese konkrete Implementierung von <code>Comparable</code> ist gewollt, da auch z.B. Counting Sort realisiert werden soll.
	 * 
	 * @param a
	 *            Zu sortierendes Feld.
	 */
	abstract public void sort(Integer[] a);

	/**
	 * Aktualisiert die Visualisierungskomponente und wartet die angegebene Anzahl an Millisekunden.
	 * 
	 * @param milliseconds
	 *            Anzahl zu wartender Millisekunden
	 */
	public void update(long milliseconds) {
		// veranlasst die Laufzeitumgebung dazu, den durch die Parameter spezifizierten Bereich des ArrayVisualizers (~> JPanel) sofort neuzuzeichnen
		// durch ein explizites aufrufen der ueberschriebenen paintComponent Methode in ArrayVisualizier.
		av.paintImmediately(0, 0, av.getWidth(), av.getHeight());
		
		// laesst diesen Thread (da er der Aufrufer der statischen Methode Thread.sleep ist)  fuer die angegebene Zeit in Millisekunden pausieren.
		try{
			Thread.sleep(milliseconds);
		} catch(InterruptedException e){

		}
	}

	/**
	 * Aktualisiert die Visualisierungskomponente und wartet 1 ms.
	 */
	public void update() {
		update(1L);
	}

	/**
	 * Vertausche in einem gegebenen Feld die Eintraege an den beiden gegebenen Stellen.
	 * 
	 * @param a
	 *            Eingabefeld
	 * @param indexA
	 *            Index des ersten zu tauschenden Elements.
	 * @param indexB
	 *            Index des zweiten zu tauschenden Elements.
	 */
	public void swap(Integer[] a, int indexA, int indexB) {
		Integer temp = a[indexA];
		a[indexA] = a[indexB];
		a[indexB] = temp;
	}

	/**
	 * Drucke Laenge und Inhalt eines gegebenen Felds auf dem Bildschirm.
	 * 
	 * @param a
	 *            Auszugebendes Feld.
	 */
	public void printArray(Integer[] a) {
		if (a != null) {

			System.out.println("Das Array enthaelt " + a.length + " Elemente.");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}

	/**
	 * Ueberpruefe, ob ein gegebenes Feld sortiert ist.
	 * 
	 * @param a
	 *            Zu ueberpruefendes Feld.
	 * @return <code>true</code>, falls das Feld sortiert ist, <code>false</code> sonst.
	 */
	public boolean checkArray(Integer[] a) {
		boolean isSorted = true;
		for (int i = 0; i < a.length - 1; i++) {
			if(!isSorted) break; // damit der algo nicht immer das ganze Array durchlaufen muss, auch wenn bereits klar ist, dass es min. eine Fehlstellung gibt  
			isSorted = isSorted && (a[i].compareTo(a[i + 1]) <= 0);
		}
		if (isSorted) {
			System.out.println("Das Array ist sortiert.");
		} else {
			System.out.println("Das Array ist nicht sortiert!");
		}
		return isSorted;
	}
}