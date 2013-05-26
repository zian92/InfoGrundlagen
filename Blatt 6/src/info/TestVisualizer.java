package info;

import java.util.Random;

import javax.swing.JFrame;

import jonas.a23.ArrayVisualizer;

/* Bei der Verwendung von javax.swing mindestens:
 import javax.swing.SwingUtilities;
 */

/**
 * Klasse zur Einbindung der Visualisierung eines Felds von n Zahlen im Bereich [0..n-1] Blatt 6, Aufgabe 23, Sommersemester 2013
 */
public class TestVisualizer
/*
 * Bei der Verwendung von javax.swing: implements Runnable
 */
{
	private ArrayVisualizer av;

	/**
	 * Erzeugt n Elemente im Bereich [0..n-1]
	 * 
	 * @param n
	 *            Anzahl der zu erzeugenden Elemente sowie echte Obergrenze fuer die erzeugten Werte
	 * @return Referenz auf Feld mit erzeugtenWerten.
	 */
	private Integer[] createNumbers(int n) {
		Integer[] data = new Integer[n];
		Random r = new Random(n);
		for (int i = 0; i < n; i++) {
			data[i] = r.nextInt(n);
		}
		return data;
	}

	public void run() {
		int n = 200;
		Integer[] data = createNumbers(n);

	        av = new ArrayVisualizer(n);

		av.setData(data);
		av.update();

		JFrame f = new JFrame();
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    	f.setSize(n, n);
	    	f.add(av);
	    	f.setVisible( true );
		
	}

	public static void main(String[] args) {
		TestVisualizer tv = new TestVisualizer();

		tv.run();

		/*
		 * Bei Verwendung von javax.swing: SwingUtilities.invokeLater(tv);
		 */
	}
}
