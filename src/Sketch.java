import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Your Name
 */


public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    // Declaring Variables
    int x = 50;
    int y = 50;
    int bunnySize = 1;
    String bunnyStage = "Baby";


    @Override
    public void settings() {
        size(1200, 800); 
    }

    @Override
    public void setup() {
        background(135, 206, 235);

    }

    @Override
    public void draw() {
        drawBunny();
    }


    public void drawBunny() {
        // Outer Ears
        fill(255, 200, 210);
        stroke(3);
        ellipse(x + 450, 400, 30, 100);
        ellipse(x + 550, 400, 30, 100);


        // Head
        fill(255, 255, 255);
        circle(x + 500, x + 450, 100);
       

    }


    

    /** Additional helper methods below */

}
