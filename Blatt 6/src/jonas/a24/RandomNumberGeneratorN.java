package jonas.a24;

/**
 *  Uebungsgruppe G04-C
 *  Henner Niehaus, Jonas Stadler, Eva Poell
 *
 *  Klasse zur Loesung von Aufgabe 22b / Blatt 6 / Sommersemester 2013.
 *
 *  Realisiert einen Zufallszahlen-Generator, der auf der linearen Kongruenzmetode basiert
 *  Und bei dem erst nach mindestens n Durchlauufen eine Periode auftritt.
 * 
 */
 
public class RandomNumberGeneratorN extends RandomNumberGenerator{
	//Attribute über Getter und Setter in der Oberklasse
 	
 	
 	//Konstruktoren
 	//-------------
 	/**
     *  Default-Konstruktor.
     * 	Belegt alle Werte mit beliebigen
     */
    public RandomNumberGeneratorN() {
    	this(0, 21, 8, 5);
    }
    
    /**
     *  Konstruktor.
     * 	um eine Zufallszahl zwischen 0 und der uebergebenen Obergrenze zu bestimmen
     *
     *  @param m obere Intervallgrenze der Zufallszahlen
     */
    public RandomNumberGeneratorN(int m) {
    	this(0, (10*m)+1, (12*m)+1, m);
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
    public RandomNumberGeneratorN(int z0, int a, int c, int m) {
    	if (z0<0 || a<0 || c<0 || m<=0) {
    		throw new IllegalStateException("Die Werte müssen in den natürlichen Zahlen (inkl. 0, außer m) sein!!");
    	}
    	else if (!isOptimal(a, c, m)) {
    		throw new IllegalStateException("Die Werte müssen den Opimierungsregeln folgen!");
    	}
    	else {
			this.setZ(z0);
			this.setA(a);
			this.setC(c);
			this.setM(m);
		}
    }
    
 	
 	//Methoden
 	//--------
 	/**
 	 *  Hiflsmethode.
 	 *  Ueberpruft ob die Attributwerte den Bedingungen fuer
 	 *  einen optimalen Zufallsgenerator nach der linearen Kongruenzmetode
 	 *  erfuellt:
 	 *	(i)   m ist eine Primzahl
 	 *  (ii)  (a-1) ist ein Vielfaches von m
 	 *  (iii) c ist kein Vielfaches von m
     *
     *  @param a Parameter zur Zufallszahlbestimmung, Multiplikator
     *  @param c Parameter zur Zufallszahlbestimmung, additiver Term
     *  @param m obere Intervallgrenze der Zufallszahlen
     *
     *	@return false, wenn diese Regeln nicht erfuellt werden
 	 */
 	public boolean isOptimal(int a, int c, int m) {
 		if (!isPrime(m)) 		{ return false; }	//(i)   m ist eine Primzahl
 		if (!((a-1) % m == 0)) 	{ return false; }	//(ii)  (a-1) ist ein Vielfaches von m
 		if (c%m == 0)			{ return false; }	//(iii) c ist kein Vielfaches von m
 		
 		return true; 	//Wenn man sich immernoch in der Funktion befindet, sind alle Regeln erfuellt
 	}
 	
 	/**
 	 *  Hilfsmethode.
 	 *  Ueberprueft ob eine Zahl eine Primzahl ist
 	 *  basierend auf dem Prinzip des Siebes des Eratothenes
 	 *  
 	 *	@param x die zu pruefende Zahl
 	 *
 	 *  @return true, wenn es eine Primzahl ist
 	 */
 	public boolean isPrime(int x) {
 		boolean[] isPrime = new boolean[x+1];	//x ist die hoechste zu prüfende Zahl,
 												//also braucht man auch nicht mehr Stellen.
 												//+1, da man die Zelle mit Index 0 ignoriert
 												//dafuer aber eine Zelle mit Index x also Länge-1 will
 		
 		//Am Anfang sind alle Zahlen im Feld potenziell Primzahlen -> alles auf true, bis auf Index 0
 		isPrime[0] = false;
 		for (int i=1; i<=x; i++) {
 			isPrime[i] = true;
 		}
 		
 		//Pruefung welche Zahlen keine Primzahlen sind durch streichen der Vielfachen
 		//beginnt ab 2, denn 1 ist Primzahl und jede Zahl ist ein Vielfaches von 1
 		for (int i=2; i<=x; i++) {
 			//Wenn i noch nicht gestrichen ist, dann ist i eine Primzahl
 			if (isPrime[i]) {
 				//und alle Vielfachen werden getrichen ab i*i
				//denn k*i mit k<i wurde schon als Vielfaches von k gestrichen
				for (int j=i*i; j<=x; j+=i) {
					isPrime[j] = false;
				}
 			}
 			//sonst gehe zur naechsten Zahl ueber
 		}
 		
 		return isPrime[x];
 	}
}
