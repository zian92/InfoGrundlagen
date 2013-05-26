package jonas.a23;

/**
 * Uebungsgruppe G04-C Henner Niehaus, Jonas Stadler, Eva Poell
 */
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class ArrayVisualizer extends JPanel {

	/**
	 * serial Version
	 */
	private static final long serialVersionUID = 1L;

	private Integer[] data;

	public ArrayVisualizer(int n) {
		data = new Integer[n];

	}

	public void setData(Integer[] a) {
		data = a;
	}

	/**
	 * Zeichnet zu jedem Wert aus dem Integer-Array einen einzelnen Punkt
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < data.length; i++) {
			g.drawString(".", data.length - i, data[i]);// zeichnet zu jedem Wert von data einen punkt auf die zeichenflaeche.
			// g.drawLine(i, data.length - data[i], i, data.length); // zeichnet einen balken vom unteren ender der zeichenfläche bis zum wert
		}

	}

	public void update() {
		BufferedImage image = new BufferedImage(data.length, data.length, BufferedImage.TYPE_INT_ARGB); // eryeugt ein bild um graphics zu beommen
		paintComponent(image.getGraphics());
	}

}