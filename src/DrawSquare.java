import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 03/12/16.
 */
public class DrawSquare extends TurtleProgram {
    public static void main(String[] args) {

        new DrawSquare().start();
    }

    @Override
    public void run() {
        double sideLengtn;
        sideLengtn = this.readDouble();

        Turtle boxTurtle = new Turtle(10, 10);
        boxTurtle.forward(sideLengtn);
        boxTurtle.right(90);
        boxTurtle.forward(sideLengtn);
        boxTurtle.right(90);
        boxTurtle.forward(sideLengtn);
        boxTurtle.right(90);
        boxTurtle.forward(sideLengtn);
        boxTurtle.hide();
    }
}
