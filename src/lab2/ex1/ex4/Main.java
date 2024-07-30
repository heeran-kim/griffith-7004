package lab2.ex1.ex4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Frame");
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        Label label = new Label("Hello, AWT!");
        Button button = new Button("Click Me");

        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
