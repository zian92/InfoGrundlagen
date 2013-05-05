package jonas.a16;

public class Aufgabe16 {

	public static void main(String[] args) {

		int temp = getMinIndex(new int[] { 13, 232, 45, 67, 4, 323, 4, 54, 54, 23, 23, });
		System.out.println(temp);
	}

	public static int getMinIndex(int[] feld) throws NullPointerException {
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
