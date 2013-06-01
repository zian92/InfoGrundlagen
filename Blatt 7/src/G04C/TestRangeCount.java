package G04C;

import G04C.a28.RangeCount;

/**
 * Testklasse zu Aufgabe 28 / Blatt 7 / Sommersemester 2013
 */
public class TestRangeCount {

	/**
	 * Ueberpruefe, ob der Wert, der vom RangeCount-Objekt als Anzahl der Elemente in [a..b-1] berechnet wird, mit dem angegebenen Wert uebereinstimmt.
	 * 
	 * @param rc
	 *            Zu testendes Objekt
	 * @param a
	 *            Untere Grenze des Intervals
	 * @param b
	 *            Obere Grenze des Intervals (exklusive)
	 * @param expect
	 *            Erwarteter Wert
	 * @return <code>true</code>, falls der erwartete Wert mit dem berechneten Wert uebereinstimmt, <code>false</code> sonst.
	 */
	private boolean checkExpect(RangeCount rc, Integer a, Integer b, int expect) {
		int count = rc.count(a, b);

		if (count != expect) {
			System.out.println("Test fehlgeschlagen: rc.count(" + a + "," + b + ") = " + count + " != " + expect);
			return false;
		}

		return true;
	}

	public void run() {

		boolean passed = true;

		@SuppressWarnings("unused")
		Integer[] data = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };

		RangeCount rc = new RangeCount(data);

		// Alle Werte liegen im Bereich.
		passed = passed && checkExpect(rc, 0, 10, 9);

		// Die Zahl 0 kommt nicht vor.
		passed = passed && checkExpect(rc, 0, 1, 0);

		// Die Zahl 3 kommt einmal vor.
		passed = passed && checkExpect(rc, 3, 4, 1);

		// Die Zahl 1 kommt zweimal vor.
		passed = passed && checkExpect(rc, 1, 2, 2);

		// Der Anfragebereich ist das leere Intervall.
		passed = passed && checkExpect(rc, 10, 10, 0);

		// Der Anfragebereich ist das leere Intervall.
		passed = passed && checkExpect(rc, 5, 3, 0);

		// Der Anfragebereich liegt ausserhalb von [0..k-1].
		passed = passed && checkExpect(rc, 90, 99, 0);

		// Der Anfragebereich liegt teilweise ausserhalb von [0..k-1].
		passed = passed && checkExpect(rc, 7, 99, 1);

		if (passed) {
			System.out.println("Es wurden alle Tests bestanden.");
		} else {
			System.out.println("Es wurden nicht alle Tests bestanden.");
		}
	}

	public static void main(String[] args) {

		TestRangeCount trc = new TestRangeCount();
		trc.run();
	}
}