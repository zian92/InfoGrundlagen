package de.js;

/**
 * 
 * @author Jonas Stadler
 *
 * @param <T> 
 */
public interface DoubleEndQueue<T> {
	/**
	 * Fuegt eine Element an erster Stelle ein.
	 * @param element 
	 */
	public void enqueFront(T element);
	
	/**
	 * Fuegt ein Element an letzter Stell ein.
	 * @param element
	 */
	public void enqueBack(T element);
	
	/**
	 * Gibt das erste Element wieder.
	 * @return erste Element
	 */
	public T frontFront();
	
	/**
	 * Gibt das letzte Element wieder.
	 * @return letzte Element
	 */
	public T frontBack();
	
	/**
	 * Loescht das erste Element.
	 */
	public void dequeFront();
	
	/**
	 * Loescht das letzte Element.
	 */
	public void dequeBack();
	
	/**
	 * Ueberprueft ob die Schlange leer ist.
	 * @return True fuer eine leere Schlange.
	 */
	public Boolean isEmpty();

}
