package jonas.a15;

public class Aufgabe16 {
	private int[] feld = null;

	public Aufgabe16(int[] feld) {
		this.feld = feld;
	}

	public int getMinIndex() {
		if (feld.length == 0 || feld == null) throw new NullPointerException();
		int minIndex = 0;
		int minVal = feld[0];

		for (int i = 0; i < feld.length; i++) {
			if (feld[i] < minVal) {
				minVal = feld[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
