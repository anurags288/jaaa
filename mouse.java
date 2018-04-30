import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
 <applet code=mouse width=500 height=500>
 </applet>
 */
public class mouse extends Applet implements MouseListener, MouseMotionListener
{
String msg="";
int X=10,Y=20;
public void init()
{
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
X=0;
Y=10;
msg="mouse clicked";
repaint();
}
public void mouseEntered(MouseEvent me)
{
X=0;
Y=10;
msg="mouse entered";
repaint();
}
public void mouseExited(MouseEvent me)
{
X=0;
Y=10;
msg="mouse exited";
repaint();
}
public void mousePressed(MouseEvent me)
{
X=me.getX();
Y=me.getY();
msg="mouse pressed";
repaint();
}
public void mouseReleased(MouseEvent me)
{
X=me.getX();
Y=me.getY();
msg="mouse released";
repaint();
}

public void mouseDragged(MouseEvent me)
{
X=me.getX();
Y=me.getY();
msg="mouse dragged at"+X+","+Y;
repaint();
}

public void mouseMoved(MouseEvent me)
{
X=me.getX();
Y=me.getY();
showStatus("mouse moving at"+X+","+Y);
}
public void paint(Graphics g)
{
g.drawString(msg,X,Y);
}
}