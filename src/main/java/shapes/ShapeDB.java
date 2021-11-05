package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    ArrayList<Shape> shape = new ArrayList<Shape>();

    public void add(Shape newshape)
    {
        shape.add(newshape);
    }

    public void drawShapes(Graphics g)
    {
        for( Shape s: shape )
        {
            s.draw(g);
        }
    }

}
