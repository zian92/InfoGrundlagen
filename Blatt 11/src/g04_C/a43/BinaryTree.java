package g04_C.a43;

/**
 *  Eine Moeglichkeit, einen binaeren Baum zu modellieren.
 *  Diese Modellierung entspricht der induktiven Definition 6.1
 *  Aufgabe 43 / Blatt 11 / Sommersemester 2013
 */
public class BinaryTree<T> {

    private BinaryTree<T> leftChild;   //  Referenz auf linken Teilbaum.
    private BinaryTree<T> rightChild;  //  Referenz auf rechten Teilbaum.
    private T data;                    //  Datenfeld

    /**
     *  Konstruktor fuer einen Teilbaum ohne Kinder.
     *  @param data Referenz auf das im Datenfeld zu speichernde Objekt.
     */
    BinaryTree(T data) {
	this(data, null, null);
    }

    /**
     *  Konstruktor fuer einen Teilbaum ohne Kinder.
     *  @param data Referenz auf das im Datenfeld zu speichernde Objekt.
     *  @param leftChild Referenz auf den linken Teilbaum.
     *  @param rightChild Referenz auf den rechten Teilbaum.
     */
    BinaryTree(T data, BinaryTree<T> leftChild, BinaryTree<T> rightChild) {
        this.leftChild  = leftChild;
        this.rightChild = rightChild;
        this.data       = data;
    }

    /**
     *  Gibt eine Referenz auf das im Datenfeld verwaltete Objekt zurueck.
     *  @return Referenz auf das im Datenfeld verwaltete Objekt.
     */
    public T getData() {
	return data;
    }
    
    /**
     *  Speichert die uebergebene Referenz im Datenfeld.
     *  @param Neu zu speicherende Objektreferenz.
     */
    public void setData(T data) {
	this.data = data;
    }

    /**
     *  Gibt eine Referenz auf den linken Teilbaum zurueck.
     *  @return Referenz auf den linken Teilbaum.
     */
    public BinaryTree<T> getLeftChild() {
	return leftChild;
    }
    
    /** 
     *  Setzt einen neuen linken Teilbaum.
     *  @param Referenz auf den neuen linken Teilbaum.
     */
    public void setLeftChild(BinaryTree<T> leftChild) {
	this.leftChild = leftChild;
    }
    
    /**
     *  Gibt eine Referenz auf den rechten Teilbaum zurueck.
     *  @return Referenz auf den rechten Teilbaum.
     */
    public BinaryTree<T> getRightChild() {
	return rightChild;
    }
    
    /** 
     *  Setzt einen neuen rechten Teilbaum.
     *  @param Referenz auf den neuen rechten Teilbaum.
     */
    public void setRightChild(BinaryTree<T> rightChild) {
	this.rightChild = rightChild;
    }

    /**
     *  Erzeugt eine "balanced parentheses"-Repraesentation des
     *  am aktuellen Knoten gespeicherten Teilbaums inklusive der
     *  String-Repraesentation des an der Wurzel verwalteten Datenobjekts.
     *  @return Textuelle Darstellung der "balanced parentheses"-Repraesentation.
     */
    public String balancedParenthesesRepresentation() {

	String representation = "";

	/*
	  Hier Loesung einfuegen.
	 */

	return representation;
   }

}
