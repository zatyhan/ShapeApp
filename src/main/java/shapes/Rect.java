package shapes;

import java.awt.*;

public class Rect extends Shape {
    public int h;
    public int w;

    public Rect(Point initPos, Color col, int height, int width)
    {
        super(initPos, col);
        h= height;
        w= width;
    }
   public void draw(Graphics g) {
       g.setColor(col);
       g.fillRect(pos.x, pos.y, w, h);
   }

}
