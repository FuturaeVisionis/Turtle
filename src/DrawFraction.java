import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 04/12/16.
 */
public class DrawFraction extends TurtleProgram {
    public static void main(String[] args) {
        new DrawFraction().start();
    }

    @Override
    public void run() {
        int divisor = this.readInt(); // initiating + instantiating.

            try {
                Turtle lineTurtle = new Turtle(0, 100);
                lineTurtle.forward(200 /divisor);
                lineTurtle.right(90);
                lineTurtle.forward(150/divisor);
                lineTurtle.hide();

            } catch (Exception e) {
                System.out.println("Enter a number larger than 0!");
                run();
            }
        }
    }
