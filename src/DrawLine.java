import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 28/11/16.
 */
public class DrawLine extends TurtleProgram {

    public static void main(String[] args) {

        new DrawLine().start();
    }

    @Override
    public void run() {
        Turtle yertle = new Turtle(50, 80); // drawing the top line.
        yertle.forward(100);
        yertle.hide();

        yertle = new Turtle(50, 120); // drawing the bottom line
        yertle.forward(100);
        yertle.hide();
    }
}
