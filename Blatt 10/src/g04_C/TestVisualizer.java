package g04_C;

import g04_C.sortings.BubbleSort;
import g04_C.sortings.InsertionSort;
import g04_C.sortings.SelectionSort;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;

public class TestVisualizer implements Runnable {

	private JFrame myFrame;
	private ArrayVisualizer av;

	private void setupFrame() {
		myFrame = new JFrame("Visualizer");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(av);
		myFrame.pack();
		myFrame.setVisible(true);
	}

	@Override
	public void run() {
		RandomArrayGenerator rg = new RandomArrayGenerator(200);
		av = new ArrayVisualizer(200, (byte) 2);

		Integer[] data = rg.createPermutation();
		av.setData(data);
		setupFrame();

		SelectionSort b = new SelectionSort(av);
		b.sort(data);
		System.out.println("Durchläufe: "+b.getCount());
		System.out.println("Vertauschungen: "+b.getCountSwap());

	}

	public static void main(String[] args) {
		TestVisualizer tv = new TestVisualizer();
		SwingUtilities.invokeLater(tv);
	}
}
