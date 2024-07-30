package lab2.ex1.ex2;

import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Frame;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Frame");
        frame.setSize(400, 300);

        Panel panel = new Panel();
        Label label = new Label("Hello, AWT!");
        Button button = new Button("Click Me");

        panel.add(label);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
}
