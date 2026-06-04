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

    String bunnyStage = "Baby";

    int[] stageIncrease = {1, 2, 3, 4, 5};
    int bunnySize = 1;
    int currentSize = 45;  // Current Size (Baby)



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


             // Size
        for (int i = 0; i < stageIncrease.length; i++) {

        }

        drawBunny();

        fill(0);
        textSize(50);
        text("Stage:  " + bunnyStage, 400, 80);

        textSize(24);
        text("Clicks:  " + clicks, 50, 50);


   

        

    }


    public void drawBunny() {
        // Outer Ears
        fill(255, 200, 210);
        stroke(3);
        ellipse(x + 490, y + 615, 12 * bunnySize, 40 * bunnySize);
        ellipse(x + 510, y + 615, 12 * bunnySize, 40 * bunnySize);

        // Inner Ears
        fill(255, 180, 190);
        noStroke();
        ellipse(x + 490, y + 615, 6 * bunnySize, 26 * bunnySize);
        ellipse(x + 510, y + 615, 6 * bunnySize, 26 * bunnySize);


        // Body
        fill(255, 255, 255);
        stroke(0);
        strokeWeight(2);
        ellipse(x + 500, y + 685, 55 * bunnySize, 50 * bunnySize);

        // Head
        stroke(0);
        strokeWeight(2);
        fill(255, 255, 255);
        circle(x + 500, y + 650, 45 * bunnySize);

        // Eyes
        fill(0);
        noStroke();
        circle(x + 490, y + 645, 4 * bunnySize);
        circle(x + 510, y + 645, 4 * bunnySize);

        // Nose
        fill(255, 150, 160);
        circle(x + 500, y + 652, 3 * bunnySize);



        // tail
        fill(255, 255, 255);
        stroke(0);
        strokeWeight(2);
        circle(x + 465, y + 690, 16 * bunnySize);

       

    }




    public void mousePressed() {
        clicks++;

        if (clicks < childStage) {
           bunnyStage = "Baby";
           bunnySize = stageIncrease[0]; // Multiplier 1
        }
        
        else if (clicks < pubertyStage) {
            bunnyStage = "Child";
            bunnySize = stageIncrease[1]; // Multiplier 2
        }

        else if (clicks < teenStage) {
            bunnyStage = "Puberty";
            bunnySize = stageIncrease[2]; // Multiplier 3
        }
        else if (clicks < adultStage) {
            bunnyStage = "Teen";
            bunnySize = stageIncrease[3]; // Multiplier 4
        }

        else if (clicks >= adultStage && clicks <= 120) {
            bunnyStage = "Adult";
            bunnySize = stageIncrease[4]; // Multiplier 5
        
        }
        else {
            clicks = 0;
            bunnyStage = "Baby";
            bunnySize = stageIncrease[0]; // Reset Back to 1
        }


    }



    

    /** Additional helper methods below */

}
