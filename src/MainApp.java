import Thing.java.Thing;
import processing.core.PApplet;

public class MainApp extends PApplet {

    public static void main(String[] args) {
        PApplet.main("MainApp", args);
    }

    Thing myThing;ls
    public void settings() {
        size(800,600);
    }

    public void setup() {
        background(255);
        myThing = new Thing(this);
    }

    public void draw() {
        stroke(0);
        fill(255, 0, 255);
        ellipse(width/2, height/2, 100, 100);
        myThing.doSomething();
    }
}