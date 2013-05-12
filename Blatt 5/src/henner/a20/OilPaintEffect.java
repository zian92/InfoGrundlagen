package henner.a20;

import java.awt.Color;
import java.util.HashMap;
import bookClasses.Picture;


public class OilPaintEffect {
	
	private HashMap<Color, Integer> hMap;
	private Picture pic;
	
	public void run(){
		hMap = new HashMap<Color, Integer>();
		pic = new Picture();
	}
	
	public static void main(String[] args){
		new OilPaintEffect().run();

	}

}
