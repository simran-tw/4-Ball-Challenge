import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int SPEED = 1;
    final static int DAIMETER = 20;
    int circleA=0,circleB=0,circleC=0,circleD=0;

    public static void main(String[] args) {
       PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        DrawEllipse();
    }

    private void DrawEllipse() {
        int HEIGHT_FROM_TOP = HEIGHT / 5;

        ellipse(circleA, HEIGHT_FROM_TOP, DAIMETER, DAIMETER);
        circleA=circleA+SPEED;
        ellipse(circleB, 2*HEIGHT_FROM_TOP, DAIMETER, DAIMETER);
        circleB=circleB+2*SPEED;
        ellipse(circleC, 3*HEIGHT_FROM_TOP, DAIMETER, DAIMETER);
        circleC=circleC+3*SPEED;
        ellipse(circleD, 4*HEIGHT_FROM_TOP, DAIMETER, DAIMETER);
        circleD=circleD+4*SPEED;
    }
}
