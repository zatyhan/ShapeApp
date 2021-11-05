import drawingUI.DrawingUIController;
import shapes.Drawing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Drawing Window"); //why cant i make this private
        DrawingUIController UI= new DrawingUIController();
        f.add(UI.getMainPanel());
        f.setSize(500, 600);
        f.setBackground(Color.WHITE);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
