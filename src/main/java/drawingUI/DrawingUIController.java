package drawingUI;

import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    private JPanel cpanel= new JPanel(new GridLayout(3,1));
    private JPanel mainpanel= new JPanel(new GridLayout(2,1 ));
    private ShapeSelector sSel;
    private ColourSelector cSel;
    private CircleDimsSelector dimsSelector;
    public DrawingUIController() //constructor
    {
        dimsSelector= new CircleDimsSelector();
        sSel = new ShapeSelector();
        cSel= new ColourSelector();
//        cpanel.setBackground(Color.GREEN);
        cpanel.add(sSel);
        cpanel.add(cSel);
        cpanel.add(dimsSelector);

        mainpanel.setBackground(Color.WHITE);
        Drawing d= new Drawing();
        mainpanel.add(cpanel);
        mainpanel.add(d);

        d.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                int num=0;
                int rad= dimsSelector.getCurrentRadius();
                Color col = cSel.getCurrentColor();
                num=sSel.getCurrentShape();
                if (num == 1)
                {
                    d.addCircle(point, col, rad);
                    d.repaint();
                }
                else if (num ==2)
                {
                    d.addRect(point, col);
                    d.repaint();
                }
                else if (num ==3)
                {
                    d.addSquare(point, col);
                    d.repaint();
                }
//                if (num==1)
//                {
//                    d.addCircle(point1);
//                    d.repaint();
//                }
//                else if (num==2)
//                {
//                    d.addRect();
//                    d.repaint();
//                }
//                else if (num==3)
//                {
//                    d.addSquare();
//                    d.repaint();
//                }

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public JComponent getMainPanel()
    {
        return mainpanel;
    }

}
