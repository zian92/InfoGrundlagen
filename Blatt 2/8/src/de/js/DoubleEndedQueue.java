package de.js;

public class DoubleEndedQueue<T> implements DoubleEndQueue<T> {
	/*
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
		if(element != null)		data.addFirst(element);
	}

	@Override
	public void enqueBack(T element) {
		if(element != null)	data.addLast(element);
	}

	@Override
	public T frontFront() throws IllegalStateException {
		return data.getFirst();
	}

	@Override
	public T frontBack() throws IllegalStateException {
		return data.getLast();
	}

	@Override
	public void dequeFront() {
		if (!data.isEmpty()) data.removeFirst();
	}

	@Override
	public void dequeBack() {
		if (!data.isEmpty()) data.removeLast();
	}

	@Override
	public Boolean isEmpty() {
		return data.isEmpty();
	}

	private void enqueQue(DoubleEndedQueue<T> Q) {
		if (!Q.isEmpty()) for (int i = 0; i < Q.data.size(); i++) {
			this.enqueBack((T) Q.frontFront());
			Q.dequeFront();
		}
	}

	private void enqueQueFront(DoubleEndedQueue<T> Q) {
		if (!Q.isEmpty()) for (int i = 0; i < Q.data.size(); i++) {
			this.enqueFront((T) Q.frontFront());
			Q.dequeBack();
		}
	}

	public void printElements() {
		System.out.println("#  "+"Print Elements");
		System.out.println("#--"+"----------------------------------");
		System.out.println("#  ");
		if (data.isEmpty()) {
			System.out.println("#  "+"Schlange Leer");
		} else {
			for (int i = 0; i < data.size(); i++) {
				System.out.println("#  "+"Element " + (i + 1) + " : " + data.get(i).toString());
			}
		}
		System.out.println("#  ");
		System.out.println("#"+"------------------------------------");
		System.out.println();
	}
}
