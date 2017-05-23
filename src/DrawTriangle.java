import turtles.Turtle;
import turtles.TurtleProgram;
import java.awt.*;

/**
 * Created by ronald on 28/11/16.
 */
public class DrawTriangle extends TurtleProgram {
    public static void main(String[] args) {
        new DrawTriangle().start();
    }

    @Override
    public void run() {

        double one = readDouble();
        double two = readDouble();


        Color mauve = new Color(102, 51, 128);
        Turtle ramses = new Turtle(one, two);
        ramses.setPenColor(mauve);
        ramses.forward(100);
        ramses.left(120);
        ramses.forward(100);
        ramses.left(120);
        ramses.forward(100);
        ramses.left(100);
        ramses.hide();
    }
}
