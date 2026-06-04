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
    int clicks = 0;
    
    // Declaring Stages Variables
    int childStage = 10;
    int pubertyStage = 30;
    int teenStage = 60;
    int adultStage = 100;

    int bunnySize = 1;
    String bunnyStage = "Baby";


    @Override
    public void settings() {
        size(1200, 800); 
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        background(135, 206, 235);

        drawBabyBunny();

        fill(0);
        textSize(24);
        text("Stage:  " + bunnyStage, 50, 80);
        text("Clicks:  " + clicks, 50, 50);



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


        // Body
        fill(255, 255, 255);
        stroke(0);
        strokeWeight(2);
        ellipse(x + 500, y + 685, 55, 50);

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



        // tail
        fill(255, 255, 255);
        stroke(0);
        strokeWeight(2);
        circle(x + 465, y + 690, 16);

       

    }


    


    public void mousePressed() {
        clicks++;

        if (clicks < childStage) {
           bunnyStage = "Baby";
        }
        
        else if (clicks < pubertyStage) {
            bunnyStage = "Child";
        }

        else if (clicks < teenStage) {
            bunnyStage = "Puberty";
        }
        else if (clicks < adultStage) {
            bunnyStage = "Teen";
        }
        else if (clicks == adultStage) {
            bunnyStage = "Adult";
        }
        else {
            clicks = 0;
            bunnyStage = "Baby";

        }


    }



    

    /** Additional helper methods below */

}
