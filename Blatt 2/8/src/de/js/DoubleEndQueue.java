package de.js;

public interface DoubleEndQueue<T> {
	
	public void enqueFront(T element);
	
	public void enqueBack(T element);
	
	public T frontFront() throws IllegalStateException;
	
	public T frontBack() throws IllegalStateException;
	
	public void dequeFront();
	
	public void dequeBack();
	
	public Boolean isEmpty();

}
