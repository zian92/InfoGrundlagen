package jonas.a24;

/**
 *  Uebungsgruppe G04-C
 *  Henner Niehaus, Jonas Stadler, Eva Poell
 *
 *  Klasse zur Loesung von Aufgabe 22a / Blatt 6 / Sommersemester 2013.
 *
 *  Realisiert einen Zufallszahlen-Generator, der auf der linearen Kongruenzmetode basiert
 * 
 */
 
public class RandomNumberGenerator {
	
	//Attribute
 	//---------
 	private int z;		//aktuelle Zufallszahl -> z_i
 	private int a, c;	//Parameter zur Zufallszahlbestimmung
 	private int m;		//Modulus und obere Intervallgrenze
 	
 	
 	//Konstruktoren
 	//-------------
 	/**
     *  Default-Konstruktor.
     * 	Belegt alle Werte mit beliebigen
     */
    public RandomNumberGenerator() {
    	this(0, 17, 6, 4);
    }
    
    /**
     *  Konstruktor.
     * 	um eine Zufallszahl zwischen 0 un der uebergebenen Obergrenze zu bestimmen
     *
     *  @param m obere Intervallgrenze der Zufallszahlen
     */
    public RandomNumberGenerator(int m) {
    	this(0, 17, 6, m);
    }
    
    /**
     *  Konstruktor
     * 	Belegt alle Werte mit den uebergebenen
     *
     *  @param z0 Startwert, untere Intervallgrenze
     *  @param a Parameter zur Zufallszahlbestimmung, Multiplikator
     *  @param c Parameter zur Zufallszahlbestimmung, additiver Term
     *  @param m obere Intervallgrenze der Zufallszahlen
     *
     *  @throws IllegalStateException falls die uebergebenen Werte nicht in den nat. Zahlen mit 0 sind
     */
    public RandomNumberGenerator(int z0, int a, int c, int m) {
    	if (z0<0 || a<0 || c<0 || m<0) {
    		throw new IllegalStateException("Die Werte müssen in den natürlichen Zahlen (inkl. 0) sein!!");
    	}
    	else {
			this.z = z0;
			this.a = a;
			this.c = c;
			this.m = m;
		}
    }
    
 	
 	//Methoden
 	//--------
 	
 	//Setter
 	/**
 	 *  Setter-Methode.
 	 *  Setzt die aktuelle Zufallszahl
 	 *  @param z die neue Zufallszahl
     *
     *  @throws IllegalStateException falls die uebergebenen Werte nicht in den nat. Zahlen mit 0 sind
 	 */
 	public void setZ(int z) {
 		if (z<0) {
    		throw new IllegalStateException("Die Werte müssen in den natürlichen Zahlen (inkl. 0) sein!!");
    	}
    	else {
    		this.z = z;
    	}
 	}
 	/**
 	 *  Setter-Methode.
 	 *  Setzt den Parameter a zur Zufallszahlbestimmung, Multiplikator 
 	 *  @param a Parameter zur Zufallszahlbestimmung, Multiplikator
     *  @throws IllegalStateException falls die uebergebenen Werte nicht in den nat. Zahlen mit 0 sind
 	 */
 	public void setA(int a) {
 		if (a<0) {
    		throw new IllegalStateException("Die Werte müssen in den natürlichen Zahlen (inkl. 0) sein!!");
    	}
    	else {
    		this.a = a;
    	}
 	}
 	/**
 	 *  Setter-Methode.
 	 *  Setzt den Parameter c zur Zufallszahlbestimmung, additiver Term 
 	 *  @param c Parameter zur Zufallszahlbestimmung, additiver Term
     *  @throws IllegalStateException falls die uebergebenen Werte nicht in den nat. Zahlen mit 0 sind
 	 */
 	public void setC(int c) {
 		if (c<0) {
    		throw new IllegalStateException("Die Werte müssen in den natürlichen Zahlen (inkl. 0) sein!!");
    	}
    	else {
    		this.c = c;
    	}
 	}
 	/**
 	 *  Setter-Methode.
 	 *  Setzt die obere Intervallgrenze der Zufallszahlen
 	 *  @param m obere Intervallgrenze der Zufallszahlen     
     *  @throws IllegalStateException falls die uebergebenen Werte nicht in den nat. Zahlen mit 0 sind
 	 */
 	public void setM(int m) {
 		if (m<0) {
    		throw new IllegalStateException("Die Werte müssen in den natürlichen Zahlen (inkl. 0) sein!!");
    	}
    	else {
    		this.m = m;
    	}
 	} 	
 	//Getter
 	/**
 	 *  Getter-Funktion.
 	 *  Uebergibt die aktuelle Zufallszahl
	 *  Von der Ausgabe her auquivalent zu next(), aber ohne Neuberechnung
 	 */
 	public int getZ() {
 		return z;
 	}/**
 	 *  Getter-Funktion.
 	 *  Uebergibt den Parameter a zur Zufallszahlbestimmung, Multiplikator 
 	 */
 	public int getA() {
 		return a;
 	}/**
 	 *  Getter-Funktion.
 	 *  Uebergibt den Parameter c zur Zufallszahlbestimmung, additiver Term 
 	 */
 	public int getC() {
 		return c;
 	}/**
 	 *  Getter-Funktion.
 	 *  Uebergibt die obere Intervallgrenze der Zufallszahlen
 	 */
 	public int getM() {
 		return m;
 	}
 	 
	//Zum Berechnen und Zurueckgeben einer Zufallszahl:
	/**
	 *  Gibt die aktuelle Zufallszahl aus
	 *  und berechnet eine neue, die neue Aktuelle zwischengespeichert wird
	 */
	public Integer next() {
		//Zwischenspeichern:
		int zi = z;
		
		//neue berechnen:
		z = (a*zi + c) % m;	//ginge auch mit a*z
		
		//alte ausgeben:
		return zi;		
	}

}
