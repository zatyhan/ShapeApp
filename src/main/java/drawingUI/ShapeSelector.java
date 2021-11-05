package drawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel {

    JRadioButton radCirc;
    JRadioButton radRect;
    JRadioButton radSquare;
    ButtonGroup g;

    public ShapeSelector(){
        radCirc= new JRadioButton("Circle");
        radRect= new JRadioButton("Rectangle");
        radSquare= new JRadioButton("Square");
        g= new ButtonGroup();
        g.add(radCirc);
        g.add(radRect);
        g.add(radSquare);
        radCirc.setSelected(true);
        this.add(radCirc);
        this.add(radRect);
        this.add(radSquare);
    }

    public int getCurrentShape()
    {
        int sel=0;
        if (radCirc.isSelected())
        {
            sel= 1;
        }
        else if (radRect.isSelected())
        {
            sel= 2;
        }
        else if (radSquare.isSelected())
        {
            sel= 3;
        }
        return sel;
    }



}
