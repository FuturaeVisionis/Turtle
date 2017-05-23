import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 28/11/16.
 */
public class TurtleMystery extends TurtleProgram {

    public static void main(String[] args) {
        new TurtleMystery().start();
    }


    @Override
    public void run() {
        Turtle squishy;
        squishy = new Turtle(50, 150);
        squishy.right(90);
        squishy.forward(30);
        squishy.left(90);
        squishy.forward(40);
        squishy.left(90);
        squishy.forward(30);
        squishy.hide();

        squishy = new Turtle(70, 30);
        squishy.right(45);
        squishy.forward(30);
        squishy.hide();

        squishy = new Turtle(70, 30);
        squishy.right(135);
        squishy.forward(30);
        squishy.hide();
    }
}

