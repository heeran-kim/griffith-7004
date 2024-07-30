package lab2.ex1.ex5;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Drawing Application");
        frame.setSize(400, 300);

        Canvas canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillRect(50, 50, 100, 100);
            }
        };

        frame.add(canvas);
        frame.setVisible(true);
    }
}
