package jonas.a23;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class ArrayVisualizer extends JPanel {

	private Integer[] data;

	public ArrayVisualizer(int n) {
		data = new Integer[n];

	}

	public void setData(Integer[] a) {
		data = a;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < data.length; i++) {
//			g.drawString(".", data.length - i, data[i]);
			g.drawLine(i, data.length-data[i], i, data.length);
		}

	}

	public void update() {
		BufferedImage b = new BufferedImage(data.length, data.length, BufferedImage.TYPE_INT_ARGB);
		paintComponent(b.getGraphics());

	}

}