package Game;

import java.awt.*;
import java.awt.event.MouseEvent;


public abstract class State {

    public abstract void mousePressed(MouseEvent event);

    public abstract void update(Graphics graphics);
}
