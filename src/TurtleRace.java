import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 28/11/16.
 */
public class TurtleRace extends TurtleProgram {
    public static void main(String[] args) {
        new TurtleRace().start();

    }

    @Override
    public void run() {

        Turtle upper;
        Turtle cur;

        cur = new Turtle(10, 60); // cur is the new turtle

        upper = cur; // upper is cur
        cur.forward(90); // you are saying "upper" --> forward

        cur = new Turtle(10, 140);
        cur.forward(90);

        cur = upper; // cur is upper
        cur.forward(90); // cur forward
    }
}
/*

        Turtle upper = new Turtle(10, 140);
        Turtle cur = new Turtle(10, 60);
        cur.forward(90);
        upper.forward(90);
        upper.forward(90);

    }
}
*/