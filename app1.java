

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 <applet code="app1" width=500 height=500>
 </applet>
 */
class frame1 extends Frame
{
 frame1(String title)
 {
     super(title);
    MyWindowAdapter adapter= new MyWindowAdapter(this);
    addWindowListener(adapter);
}
public void paint(Graphics g)
{
 g.drawString("this is A frame window",10,10);
}
}
class MyWindowAdapter extends WindowAdapter
{
 frame1 obj;
 MyWindowAdapter(frame1 obj)
 {
     this.obj=obj;
    }
    public void windowClosing(WindowEvent we)
    {
        obj.setVisible(false);
    }
}
public class app1 extends Applet
{
 Frame obj2;
 public void init()
 {
     obj2=new frame1("this is a frame");
     obj2.setSize(250,250);
     obj2.setVisible(true);
    }
    public void stop()
    {
        obj2.setVisible(false);
    }
    public void start()
    {
      obj2.setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawString("this is an applet window",10,20);
    }
}