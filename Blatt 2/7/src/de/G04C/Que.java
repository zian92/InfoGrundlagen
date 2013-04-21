package de.G04C;
/**
 * Uebungsgruppe G04-C Henner Niehaus, Jonas Stadler, Eva Poell
 * 
 */
import java.lang.reflect.Array;
/**
 * Eine Schlange mit zirkulaerem Feld.
 * @author Jonas
 *
 * @param <T>
 */
public class Que<T> implements ADTQueue<T> {
	T[] data = null;
	int maxSize = 0;
	int first = 0;
	int last = 0;
	int count = 0;

	/**
	 * Erstaellt eine neue Schlange
	 * @param clas Klasseninformationen für <T>
	 * @param size Groesse des Zirkels
	 */
	@SuppressWarnings("unchecked")
	public Que(Class<T> clas, int size) {
		data = (T[]) Array.newInstance(clas, size);// Benutze Array native methode um ein Array zu erstellen, dessen Typ erst bekannt ist, wenn diese Klasse benutzt wird
		this.maxSize = size;
	}

	@Override
	public boolean isEmpty() {
		return (count == 0) ? true : false;
	}

	@Override
	public void enqueue(T element) {
		if (count < maxSize) {// ueberpruefe ob maximale groesse erreicht ist
			if (!isEmpty()) this.changeLast(); // falls schlange nicht leer, wird position des ersten elementes veraendert
			data[last] = (T) element; 
			count++; // erhoehe den Zahler
		}
	}

	@Override
	public T front() throws IllegalStateException {
		if (!isEmpty())
			return data[first]; // falls array nicht leer, wird das erste elment der schlange zurueckt gegeben
		else throw new IllegalStateException();
	}

	@Override
	public void dequeue() throws IllegalStateException {
		if (!isEmpty()) {
			this.changeFirst(); // veraendert das zaehler des ersten elementes
			count--; // setzt den count des faeldes herunter
		} else throw new IllegalStateException();
	}

	/**
	 * Veraendert die Position des ersten Elementes.
	 */
	private void changeFirst() {
		first--; 
		if (first < 0) first += maxSize; // fals der zaehler kleiner als 0 ist, wird das max aufgerechnet 
	}

	/**
	 * Veraendert die Position des letzten Elements.
	 */
	private void changeLast() {
		last++;
		if (last >= maxSize) last -= maxSize;//falls der zaehler groesser als das max, wird das max abgezogen
	}

}
