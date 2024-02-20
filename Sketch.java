import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * This is a code will produce a picture of a house on a hill.
   * @author: A. Emmanuel-Singh
   */
  public void settings() {
	// put your size call here
    // Called once at the beginning of execution, put your size all in this method
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(46, 140, 191);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // House

    // Foreground of picture (oval)
     fill(78, 140, 70);
     ellipse(200, 400, 500, 400);
 
     // Body of house (rectangle)
     fill(242, 237, 133);
     rect(150, 125, 100, 75);

     // Roof of house (triangle)
     fill(242, 139, 65);
     triangle(150, 125, 250, 125, 200, 75);     

     // Door (rectangle)
     fill(252, 165, 3);
     rect(160, 170, 20,30);

     // Top left bay window (rectangle)
     fill(46, 140, 191);
     rect(160, 140, 30, 15);

    // Upper bay window (rectangle)
    fill(46, 140, 191);
    rect(200, 140, 30, 20);

     // Lower bay window (rectangle)
     fill(46, 140, 191);
     rect(200, 173, 30, 20);

     // Sun 
     fill(252, 231, 3);
     ellipse(400, 0, 100, 100);
  }
  
  // define other methods down here.

}