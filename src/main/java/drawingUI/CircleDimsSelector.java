package drawingUI;

import javax.swing.*;

public class CircleDimsSelector extends JPanel {
    private JSlider slider;

    public CircleDimsSelector()
    {
        slider= new JSlider(1,100,1);
        this.add(slider);
    }

    public int getCurrentRadius()
    {
        return slider.getValue();
    }

}
