package henner.a19;

import java.awt.Color;
import java.util.HashMap;
import bookClasses.Picture;


public class OilPaintEffect {
	
	@SuppressWarnings("unused")
	private HashMap<Color, Integer> hMap;
	@SuppressWarnings("unused")
	private Picture pic;
	
	public void run(){
		hMap = new HashMap<Color, Integer>();
		pic = new Picture();
	}
	
	public static void main(String[] args){
		new OilPaintEffect().run();

	}

}
