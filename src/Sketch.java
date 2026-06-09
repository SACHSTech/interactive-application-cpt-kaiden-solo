import processing.core.PApplet;
import java.util.ArrayList;

/**
 * Template for programs with Processing graphics output.
 * @author Your Name
 */


public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    // Declaring Instructions Page Variables
    boolean showInstructions = true;


  // Declaring Variables
    int x = 50;
    int y = 50;
    int clicks = 0;
    
    // Declaring Stages Variables
    int childStage = 10;
    int pubertyStage = 30;
    int teenStage = 60;
    int adultStage = 100;
    int reverseStage = 120;

    String bunnyStage = "Baby";
    String[] stageName = {"Baby", "Child", "Puberty", "Teen", "Adult"};
    

    int stage = 0;
    int clicksRequired = 10;

    // Array list 
    ArrayList<Integer> bunnyColors = new ArrayList<Integer>();
    int currentColorIndex = 0;


    ArrayList<Integer> leftOver = new ArrayList<Integer>();




    @Override
    public void settings() {
        size(1200, 800); 
    }

    @Override
    public void setup() {
        
        bunnyColors.add(color(255, 255, 255));  // white
        bunnyColors.add(color(255, 0, 0));  // Red
        bunnyColors.add(color(255, 255, 0));  // Yellow
        bunnyColors.add(color(0, 255, 0));  // Green
        bunnyColors.add(color(0, 0, 255));  // Blue



    }

    @Override
    public void draw() {

        if (showInstructions) {
            background(40, 44, 52); 

            fill(135, 206, 235); 
            textAlign(CENTER);
            textSize(50);
            text("Bunny Growth Simulator", width / 2, 200);

            fill(255);
            textSize(30);
            text("INSTRUCTIONS", width / 2, 300);
    
            textSize(20);
            fill(220);
            text("1. Click anywhere on the screen (except the transform button) to gain Clicks.", width / 2, 370);
            text("2. When you reach the 'Clicks Required', click the black 'Transform' box to evolve.", width / 2, 420);
            text("3. Press any key on your keyboard to change the bunny's colors.", width / 2, 470);

            fill(0, 255, 150);
            textSize(26);
            text("CLICK ANYWHERE TO START :)", width / 2, 650);
    
            // Reset allignment
            textAlign(LEFT);

    }
    
    else {
        
        background(135, 206, 235);

        drawBabyBunny();
        drawChildBunny();
        drawPubertyBunny();
        drawTeenBunny();
        drawAdultBunny();
        transformButton();
        
        fill(0);
        textSize(50);
        text("Stage:  " + bunnyStage, 400, 80);

        textSize(24);
        text("Clicks:  " + clicks, 50, 50);

        // Transform text click
        fill(255);
        textSize(40);
        text("Transform", 800, 530);

        // Miniumum Clicks Required Text
        fill(0);
        textSize(20);
        text("Clicks Required: " + clicksRequired, 750, 425);


        fill(0);
        textSize(16);

        for (int i = 0; i < leftOver.size(); i++) {
            int savedScore = leftOver.get(i);
            text("- Evolved to " + stageName[i + 1] + " (Leftover Clicks: " + savedScore + ")", 750, 200 + (i * 30));
        }

    }
        
}



    public void drawBabyBunny() {
        if (bunnyStage.equals("Baby")) {

            // Tail and body
            fill(bunnyColors.get(currentColorIndex)); 
            stroke(0);
            strokeWeight(2);
            circle(x + 465, y + 690, 16);
            ellipse(x + 500, y + 685, 55, 50);

            // Ears
            fill(255, 200, 210);
            ellipse(x + 490, y + 615, 12, 40);
            ellipse(x + 510, y + 615, 12, 40);

            // Head
            fill(bunnyColors.get(currentColorIndex));
            circle(x + 500, y + 650, 45);
            
            // eyes
            fill(0); 
            circle(x + 490, y + 645, 4); 
            circle(x + 510, y + 645, 4);
            
            // nose
            fill(255, 150, 160); 
            circle(x + 500, y + 652, 3);

            // Pacifier
            fill(100, 200, 255);
            circle(x + 500, y + 658, 8);
            noFill();
            strokeWeight(1.5f);
            arc(x + 500, y + 658, 12, 12, 0, PI);
            strokeWeight(2);
        }
    }


    
    public void drawChildBunny() {
        if (bunnyStage.equals("Child")) {
            // Tail and Body
            fill(bunnyColors.get(currentColorIndex)); 
            stroke(0); 
            strokeWeight(2);
            circle(x + 450, y + 660, 22);
            ellipse(x + 500, y + 650, 80, 70);
            
            // Paws
            fill(bunnyColors.get(currentColorIndex));
            ellipse(x + 515, y + 680, 14, 10);
            ellipse(x + 485, y + 680, 14, 10);


            // Ears
            fill(255, 200, 210);
            ellipse(x + 485, y + 560, 16, 60);
            ellipse(x + 515, y + 560, 16, 60);
            
            // Head
            fill(bunnyColors.get(currentColorIndex)); 
            circle(x + 500, y + 600, 65);
            
            //  eyes
            fill(0); 
            circle(x + 485, y + 595, 6); 
            circle(x + 515, y + 595, 6);
            
            // nose
            fill(255, 150, 160); 
            circle(x + 500, y + 602, 5);

            // Mouth
            noFill();
            strokeWeight(2);
            arc(x + 500, y + 604, 10, 8, 0, PI);


            // Arms
            fill(bunnyColors.get(currentColorIndex));
            ellipse(x + 475, y + 655, 16, 12);
            ellipse(x + 525, y + 655, 16, 12);
        }
    }



    public void drawPubertyBunny() {
        if (bunnyStage.equals("Puberty")) {

            // Tail and Body
            fill(bunnyColors.get(currentColorIndex)); 
            stroke(0); 
            strokeWeight(2);
            circle(x + 435, y + 620, 26);
            ellipse(x + 500, y + 610, 105, 100);
            
            // Ears
            fill(255, 200, 210);
            ellipse(x + 480, y + 490, 20, 80);
            ellipse(x + 520, y + 490, 20, 80);
            
            // Head
            fill(bunnyColors.get(currentColorIndex));
            circle(x + 500, y + 540, 85);
            
            // eyes
            fill(0); 
            circle(x + 480, y + 535, 8); 
            circle(x + 520, y + 535, 8);
            
            // nose
            fill(255, 150, 160); 
            circle(x + 500, y + 542, 6);

            // Whiskers
            stroke(100); 
            strokeWeight(1);
           
            for (int i = 0; i < 2; i++) {
          
            float yPubertyBunny = i * 4; 
    
            // Left whiskers
            line(x + 465, y + 546 + yPubertyBunny, x + 440, (y + 544) + (i * 8));
    
            // Right whiskers
            line(x + 535, y + 546 + yPubertyBunny, x + 560, (y + 544) + (i * 8));
    }

            // arms
            fill(bunnyColors.get(currentColorIndex));
            ellipse(x + 460, y + 620, 16, 25);
            ellipse(x + 540, y + 620, 16, 25);

            // mouth
            noFill();
            strokeWeight(2);
            arc(x + 496, y + 546, 9, 8, 0, HALF_PI + QUARTER_PI);
            arc(x + 504, y + 546, 9, 8, HALF_PI, PI);
            

            // legs
            fill(bunnyColors.get(currentColorIndex));
            ellipse(x + 465, y + 658, 24, 14); // Left leg
            ellipse(x + 535, y + 658, 24, 14); // Right leg
        }
    }


    public void drawTeenBunny() {
        if (bunnyStage.equals("Teen")) {

            // Tail and body
            fill(bunnyColors.get(currentColorIndex)); 
            stroke(0); 
            strokeWeight(2);
            circle(x + 420, y + 580, 32);
            ellipse(x + 500, y + 570, 130, 130);
            

            // Arms
            fill(bunnyColors.get(currentColorIndex));
            ellipse(x + 450, y + 580, 26, 18);
            ellipse(x + 550, y + 580, 26, 18);


            // Headphones
            stroke(255, 50, 50);
            strokeWeight(6);
            noFill();
            arc(x + 500, y + 520, 115, 60, 0, PI);

            fill(50);
            noStroke();
            ellipse(x + 440, y + 525, 20, 30);
            ellipse(x + 560, y + 525, 20, 30);
            stroke(0);


            // Ears
            fill(255, 200, 210);
            ellipse(x + 475, y + 410, 24, 110);
            ellipse(x + 525, y + 410, 24, 110);
            
            // Head
            fill(bunnyColors.get(currentColorIndex)); 
            circle(x + 500, y + 480, 105);
            
            // eyes
            fill(0); 
            circle(x + 475, y + 475, 9); 
            circle(x + 525, y + 475, 9);
            
            // nose
            fill(255, 150, 160); 
            circle(x + 500, y + 484, 8);


            // legs
            fill(bunnyColors.get(currentColorIndex));
            ellipse(x + 455, y + 630, 30, 18); // Left leg
            ellipse(x + 545, y + 630, 30, 18); // Right leg


            // mouth
            noFill();
            arc(x + 495, y + 491, 11, 9, 0, HALF_PI + QUARTER_PI);
            arc(x + 505, y + 491, 11, 9, HALF_PI, PI);


            // whiskers
            stroke(50);
            strokeWeight(1.2f);
           
           
           for (int i = 0; i < 3; i++) {
            
            float yTeenBunny = i * 5;
    
            // Left whiskers
            line(x + 468, y + 488 + yTeenBunny, x + 420 - (i * 5), (y + 482) + (i * 11));
    
            // Right whiskers
            line(x + 532, y + 488 + yTeenBunny, x + 580 + (i * 5), (y + 482) + (i * 11));
        
        }
    }
}

    public void drawAdultBunny() {
        if (bunnyStage.equals("Adult")) {

            // Tail and Body
            fill(bunnyColors.get(currentColorIndex)); 
            stroke(0); 
            strokeWeight(2);
            circle(x + 400, y + 540, 40);
            ellipse(x + 500, y + 520, 165, 160);
            
            // Ears
            fill(255, 200, 210);
            ellipse(x + 470, y + 320, 30, 140);
            ellipse(x + 530, y + 320, 30, 140);
            
            // Head
            fill(bunnyColors.get(currentColorIndex));
            circle(x + 500, y + 410, 130);
            
            // eyes
            fill(0); 
            circle(x + 470, y + 400, 11); 
            circle(x + 530, y + 400, 11);
            
            // nose
            fill(255, 150, 160); 
            circle(x + 500, y + 415, 10);


            // Legs
            fill(bunnyColors.get(currentColorIndex));
            ellipse(x + 445, y + 595, 38, 24); // Left leg
            ellipse(x + 555, y + 595, 38, 24); // Right leg


            // Arms
            fill(bunnyColors.get(currentColorIndex));
            ellipse(x + 430, y + 530, 24, 38);
            ellipse(x + 570, y + 530, 24, 38);


            // whiskers
            stroke(30);
            strokeWeight(1.8f);

          for (int i = 0; i < 3; i++) {
    
        float yAdultBunny = i * 5;

        // Left whiskers
        line(x + 460, y + 420 + yAdultBunny, x + 380 - (i * 5), (y + 410) + (i * 15));

        // Right whiskers
        line(x + 540, y + 420 + yAdultBunny, x + 620 + (i * 5), (y + 410) + (i * 15));
}

            // mouth
            noFill();
            strokeWeight(2.2f);
            arc(x + 494, y + 424, 12, 10, 0, HALF_PI + QUARTER_PI);
            arc(x + 506, y + 424, 12, 10, HALF_PI, PI);
        }
    }



    public void mousePressed() {

        if (showInstructions) {
            showInstructions = false;
            return;
        }


      if (mouseX >= 750 && mouseX <= 1050 && mouseY >= 450 && mouseY <= 600) {
            
            if (bunnyStage.equals("Baby") && clicks >= childStage) {

                leftOver.add(clicks - childStage);
                clicks -= childStage;   
                bunnyStage = stageName[1];         
                clicksRequired = pubertyStage; 
            }
            else if (bunnyStage.equals("Child") && clicks >= pubertyStage) {
                
                leftOver.add(clicks - pubertyStage);
                clicks -= pubertyStage;        
                bunnyStage = stageName[2];         

                clicksRequired = teenStage;     
            }

            else if (bunnyStage.equals("Puberty") && clicks >= teenStage) {

                leftOver.add(clicks - teenStage);
                clicks -= teenStage;            
                bunnyStage = stageName[3];         
                clicksRequired = adultStage;    
            }

            else if (bunnyStage.equals("Teen") && clicks >= adultStage) {

                leftOver.add(clicks - adultStage);
                clicks -= adultStage;           
                bunnyStage = stageName[4];         
                clicksRequired = reverseStage;         
            }

            else if (bunnyStage.equals("Adult")) {
                
                leftOver.clear();
                clicks = 0;
                bunnyStage = stageName[0];         
                clicksRequired = childStage;
            }
            
        } else {
            // clicked outside the box
            clicks++;
        }


    
    }


    public void keyPressed() {
        currentColorIndex++;

        if (currentColorIndex >= bunnyColors.size()) {
            currentColorIndex = 0;
        }
    }

    public void transformButton() {
        fill(0);
        rect(750, 450, 300, 150);

    }
}
