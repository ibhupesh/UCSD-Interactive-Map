package module3;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class Earthquake extends PApplet {
	UnfoldingMap map;
	public void setup() {
		size(800,600,OPENGL);
		map= new UnfoldingMap(this, 50,50,700,500, new Google.GoogleMapProvider());
		MapUtils.createDefaultEventDispatcher(this,map);
		
	}
	public void draw() {
		map.draw();
		
	}
}