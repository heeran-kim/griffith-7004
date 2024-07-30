package lab2.ex1.ex3;

import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Frame");
        frame.setSize(400, 300);

        Panel panel = new Panel();
        Label label = new Label("Hello, AWT!");
        Button button = new Button("Click Me");

        button.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e){
                label.setText("Button Clicked!");
            }
        });

        panel.add(label);
        panel.add(button);
        frame.add(panel);

        frame.setVisible(true);
    }
}
