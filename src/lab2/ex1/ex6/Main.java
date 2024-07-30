package lab2.ex1.ex6;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Drawing Application");
        frame.setSize(400, 300);

        Canvas canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLUE);
                g.fillRect(50 ,10,100,200);
            }
        };

        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Graphics g = canvas.getGraphics();
                g.setColor(Color.RED);
                g.fillOval(e.getX(), e.getY(), 10, 10);
            }
        });

        frame.add(canvas);
        frame.setVisible(true);
    }
}
