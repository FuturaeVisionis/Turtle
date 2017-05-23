import acm.graphics.GOval;
import acm.program.GraphicsProgram;

import java.awt.*;

/**
 * Created by ronald on 04/12/16.
 */
public class BasicBall extends GraphicsProgram {
    public static void main(String[] args) {
        new BasicBall().start();

    }
    @Override
    public void run() {
        Color red = new Color(255, 0, 0);
        GOval ball = new GOval(25, 25, 50, 50);
        ball.setFilled(true);
        ball.setFillColor(red);
        this.add(ball);
    }
}
