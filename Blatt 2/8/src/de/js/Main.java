package de.js;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoubleEndedQueue<Integer> q = new DoubleEndedQueue<Integer>();
		q.enqueFront(1);
		q.enqueBack(2);
		q.enqueFront(5);
		q.enqueBack(7);
		q.printElements();
		q.dequeFront();
		q.printElements();
		
		DoubleEndedQueue<Integer> r = new DoubleEndedQueue<Integer>(q);
		r.printElements();
		r.dequeFront();
		r.printElements();
	}

}
