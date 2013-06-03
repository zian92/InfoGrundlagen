package G04C;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import G04C.a26.BubbleSort;
import G04C.a26.InsertionSort;
import G04C.a26.SelectionSort;

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

		// Integer[] data = { 349, 2, 234, 35, 345, 345, 346, 356, 23, 4, 7, 7,
		// 3, 5, 2, 4, 6, 56, };
		Integer[] data = rg.createPermutation();

		av.setData(data);
		setupFrame();
//		// BubbleSort
//		BubbleSort bubble = new BubbleSort(av);
//		bubble.sort(data);

//		// BubbleSort rekursiv
//		BubbleSort bubble = new BubbleSort(av);
//		bubble.sortR(data);
		
//		// SelectionSort
//		 SelectionSort selec = new SelectionSort(av);
//		 selec.sort(data);

//		// InsertionSort
//		 InsertionSort ins = new InsertionSort(av);
//		 ins.sort(data);
		
//		// InsertionSort rekursiv
//		 InsertionSort ins = new InsertionSort(av);
//		 ins.sortR(data);
	}

	public static void main(String[] args) {
		TestVisualizer tv = new TestVisualizer();
		SwingUtilities.invokeLater(tv);
	}
}
