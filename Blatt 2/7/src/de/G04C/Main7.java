package de.G04C;

/**
 * Uebungsgruppe G04-C Henner Niehaus, Jonas Stadler, Eva Poell
 * 
 */
public class Main7 {

	public Main7() {
	}

	/**
	 * Teste die klasse Que
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Que<Integer> q = new Que<Integer>(Integer.class, 3);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		try {
			q.dequeue();
			q.dequeue();
			q.dequeue();
			q.dequeue();
		} catch (Exception e) {
		}
	}
}
