package de.js;

/**
 * Eine Double-ended Queue (Deque) kombiniert die Eigenschaften einer FIFO-Queue und einer LIFO-Queue: man kann an beiden Enden der Warteschlange Elemente anfügen, einsehen und loschen.
 * 
 * @author Jonas Stadler
 * 
 * @param <T>
 */
public class DoubleEndedQueue<T> implements DoubleEndQueue<T> {

	/**
	 * front = first
	 * 
	 * back = last
	 */
	private java.util.LinkedList<T> data;

	public DoubleEndedQueue() {
		data = new java.util.LinkedList<T>();
	}

	/**
	 * Coppy-Constructor, option zum anfügen der Schlange am Ende oder Anfang.
	 * 
	 * @param Q
	 *            DoubleEndedQueue<T>
	 * @param backOrFront
	 *            EnqueFront = false
	 */
	public DoubleEndedQueue(DoubleEndedQueue<T> Q, boolean backOrFront) {
		if (!Q.isEmpty()) {
			if (backOrFront) {
				this.enqueQue(Q);
			} else {
				this.enqueQueFront(Q);
			}
		}
	}

	/**
	 * Coppy-Constructor, fuegt Schlange am Ende an.
	 * 
	 * @param Q
	 *            DoubleEndedQueue<T>
	 */
	public DoubleEndedQueue(DoubleEndedQueue<T> Q) {
		this(Q, false);
	}

	@Override
	public void enqueFront(T element) {
		if (element != null) data.addFirst(element); // sofern element nicht null, wird es der Liste an erster Stelle angefuegt.
	}

	@Override
	public void enqueBack(T element) {
		if (element != null) data.addLast(element);// sofern element nicht null, wird es der Liste an letzter Stelle angefuegt.
	}

	@Override
	public T frontFront() {
		try {
			return data.getFirst(); // gibt das erste Element wieder.
		} catch (Exception e) {
			return null; // fals ein Fehler auftritt, wird NULL zurueck gegeben.
		}
	}

	@Override
	public T frontBack() {
		try {
			return data.getLast();// gibt das letzte Element wieder.
		} catch (Exception e) {
			return null;// fals ein Fehler auftritt, wird NULL zurueck gegeben.
		}
	}

	@Override
	public void dequeFront() {
		if (!data.isEmpty()) data.removeFirst(); // Falls die Liste nicht Leer ist, wird erste Element entfaernt.
	}

	@Override
	public void dequeBack() {
		if (!data.isEmpty()) data.removeLast();// Falls die Liste nicht Leer ist, wird letzte Element entfaernt.
	}

	@Override
	public Boolean isEmpty() {
		return data.isEmpty(); // Ueberpruefe, ob Liste leer.
	}

	public void enqueQue(DoubleEndedQueue<T> Q) {
		while (!Q.isEmpty()) {
			this.enqueBack((T) Q.frontFront());
			Q.dequeFront();
		}
	}

	public void enqueQueFront(DoubleEndedQueue<T> Q) {
		while (!Q.isEmpty()) {
			this.enqueFront((T) Q.frontFront());
			Q.dequeFront();
		}
	}

	public void printElements() {
		System.out.println("#  " + "Print Elements");
		System.out.println("#--" + "----------------------------------");
		System.out.println("#  ");
		if (data.isEmpty()) {
			System.out.println("#  " + "Schlange Leer");
		} else {
			for (int i = 0; i < data.size(); i++) {
				System.out.println("#  " + "Element " + (i + 1) + " : " + data.get(i).toString());
			}
		}
		System.out.println("#  ");
		System.out.println("#" + "------------------------------------");
		System.out.println();
	}
}
