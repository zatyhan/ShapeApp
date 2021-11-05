package shapes;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {

    private Shape cir;
    private Shape rect;
    private Shape sqr;
    private JFrame f;
    private JButton button;
    private JPanel panel;
//    private Canvas canvas; // doesnt make sense
//    ArrayList<Shape> shape= new ArrayList<Shape>();
    ShapeDB shapedb= new ShapeDB();
    public Drawing()
    {
//        Point pr= new Point(150,100);
//        Color cr = new Color(0x995511);
//        Point p = new Point(200,120);
//        Color c = new Color(0x123456);
//        Point ps = new Point(300, 70);
//        Color cs = new Color(0x552233);
//        cir = new Circle(p, c, 100);
//        rect = new Rect(pr, cr, 50, 30);
//        sqr = new Square(ps, cs, 60);
//
//        shapedb.add(cir);
//        shapedb.add(rect);
//        shapedb.add(sqr);

    }


    public void addRect(Point point, Color col)
    {
        Rect cir= new Rect(point, col, 50, 60);
        shapedb.add(cir);
    }
    public void addCircle(Point point, Color col, int rad)
    {
        Circle cir= new Circle(point, col, rad);
        shapedb.add(cir);
    }

    public void addSquare(Point point, Color col)
    {
        Square sq= new Square(point, col, 50);
        shapedb.add(sq);
    }

    public void paint(Graphics g) { // when does the new Drawing() call this function?

        shapedb.drawShapes(g);
    }
}
