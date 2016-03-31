package binarystar;

import processing.core.PApplet;

public class Main extends PApplet {

	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	public static final int FRAME_RATE = 30;

	public static PApplet Processing;
	
	public Main() {
		Processing = this;
	}
	
	public static void main(String args[]) {
		//PApplet.main(new String[] { "--present", "binarystar.Main" }); // set to fullscreen
		PApplet.main(new String[] { "binarystar.Main" });
	}
	
	public void setup() {
		// Setup things
		background(0);
		frameRate(FRAME_RATE);
	}
	
	public void settings() {
		size(WIDTH, HEIGHT);
	}
	
	public void draw() {

	}
}
