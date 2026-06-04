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
        drawBabyBunny();
    }


    public void drawBabyBunny() {
        // Outer Ears
        fill(255, 200, 210);
        stroke(3);
        ellipse(x + 490, y + 615, 12, 40);
        ellipse(x + 510, y + 615, 12, 40);

        // Inner Ears
        fill(255, 180, 190);
        noStroke();
        ellipse(x + 490, y + 615, 6, 26);
        ellipse(x + 510, y + 615, 6, 26);

        // Head
        stroke(0);
        strokeWeight(2);
        fill(255, 255, 255);
        circle(x + 500, y + 650, 45);

        // Eyes
        fill(0);
        noStroke();
        circle(x + 490, y + 645, 4);
        circle(x + 510, y + 645, 4);

        // Nose
        fill(255, 150, 160);
        circle(x + 500, y + 652, 3);

        // Body
        fill(255, 255, 255);
        stroke(0);
        strokeWeight(2);
        ellipse(x + 500, y + 685, 55, 50);


        // tail
        fill(255, 255, 255);
        stroke(0);
        strokeWeight(2);
        circle(x + 465, y + 690, 16);

       

    }



    


    

    /** Additional helper methods below */

}
