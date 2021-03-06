package de.G04C;

/**
 * Uebungsgruppe G04-C Henner Niehaus, Jonas Stadler, Eva Poell
 * 
 * Testklasse zu Aufgabe 8, Blatt 2
 * 
 */
public class Main8 {

	/**
	 * Ruft die Methoden zum Testen auf
	 */
	public static void main(String[] args) {
		DoubleEndedQueue<Integer> q1 = new DoubleEndedQueue<Integer>();
		q1.enqueBack(11);
		q1.enqueBack(12);
		q1.enqueBack(13);

		/*
		 * Que 2
		 */
		DoubleEndedQueue<Integer> q2 = new DoubleEndedQueue<Integer>();
		q2.enqueFront(31);
		q2.enqueFront(32);
		q2.enqueFront(33);

		/*
		 * Que 3
		 */
		DoubleEndedQueue<Integer> q3 = new DoubleEndedQueue<Integer>();
		q3.enqueFront(21);
		q3.enqueFront(22);
		q3.enqueFront(23);

		/*
		 * Tests
		 */
		q3.enqueQue(q2); // fuege Que 2 an
		q3.enqueQueFront(q1); // fuege Que 1 forne an
		q3.printElements();

		for (int i = 0; i < 10; i++) { // deque all
			try {
				q3.dequeFront();
			} catch (Exception e) {
			}
		}
		q3.printElements();
	}

}
