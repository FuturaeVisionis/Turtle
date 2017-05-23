import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 04/12/16.
 */
public class DrawCenterSquare extends TurtleProgram {
    public static void main(String[] args) {
        new DrawCenterSquare().start();
    }
    @Override
    public void run() {
        double sideLength = this.readDouble(); // the readDouble method is the asking pop-up!
        double start = 100.00 - sideLength / 2.0;

        Turtle boxTurtle = new Turtle(start, start);

        boxTurtle.forward(sideLength); // assigning the given number
        boxTurtle.right(90);
        boxTurtle.forward(sideLength);
        boxTurtle.right(90);
        boxTurtle.forward(sideLength);
        boxTurtle.right(90);
        boxTurtle.forward(sideLength);
        boxTurtle.hide();
    }
}
