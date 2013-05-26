package jonas.a23;

import javax.swing.*;


public class a23 {

	public a23() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });	
	}
	  private static void createAndShowGUI() {
	        System.out.println("Created GUI on EDT? "+
	                SwingUtilities.isEventDispatchThread());
	        JFrame f = new JFrame("Swing Paint Demo");
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setSize(500,300);
	        f.setVisible(true);
	    }
}
