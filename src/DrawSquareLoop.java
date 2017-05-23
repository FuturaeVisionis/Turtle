import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 04/12/16.
 */
public class DrawSquareLoop extends TurtleProgram {
    public static void main(String[] args) {
        new DrawSquareLoop().start();
    }

    @Override
    public void run() {
        double sideLength = this.readDouble();

        Turtle boxTurtle = new Turtle(100 - sideLength / 2, 100 - sideLength / 2);

        // This is where the for loop starts

        for (int draw = 0; draw < 4; boxTurtle.forward(sideLength), boxTurtle.right(80), draw++);


        // This is where the while loop starts
        int draw = 0;

        while (draw < 4) {
            boxTurtle.forward(sideLength);
            draw++;
            boxTurtle.right(80);
        }

        int write = 0;

        //This is where the do-while loop starts.
        do

        {
            boxTurtle.forward(sideLength);
            write++;
            boxTurtle.right(80);

        } while (write < 4);

        boxTurtle.hide();

    }
}
