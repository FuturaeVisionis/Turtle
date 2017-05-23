import turtles.Turtle;
import turtles.TurtleProgram;

/**
 * Created by ronald on 04/12/16.
 */
public class WhileMystery extends TurtleProgram {

    public static void main(String[] args) {
        new WhileMystery().start();
    }
    @Override
    public void run() {
        Turtle crush = new Turtle(100, 100);
        int len = 10;

        while (len < 200){ // 10,20,30,40,50,60,70,.....200 = 20 times
            crush.forward(len);
            crush.left(90);
            crush.forward(len);
            crush.left(90);
            len += 10; // how many times should I run? eg. fill in 10, then it runs 200/10 = 20 times .
        }
        crush.hide();
    }
}
