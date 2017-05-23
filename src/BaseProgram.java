import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 28/11/16.
 */
public class BaseProgram extends TurtleProgram {
    public static void main(String[] args) {
        new BaseProgram().start();
    }

    @Override
    public void run() {
        Turtle Raphael = new Turtle(50, 100);
        Raphael.forward(100);
        Raphael.hide();

    }
}
