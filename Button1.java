import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
 <applet code="Button1" width=250 height=150>
 </applet>
*/
public class Button1 extends Applet implements ActionListener 
{
 String msg = "";
    Button bList[] = new Button[2];
    public void init() {
    Button red = new Button("Red");
    Button blue = new Button("Blue");
    // store references to buttons as added
    bList[0] = (Button) add(red);
    bList[1] = (Button) add(blue);
 
    // register to receive action events
    for(int i = 0; i < 2; i++)
    {
        bList[i].addActionListener(this);
    }
 }

 public void actionPerformed(ActionEvent ae)
 {
    for(int i = 0; i < 2; i++)
    {
        if(ae.getSource() == bList[i])
        {
            if(bList[i].getLabel()=="Red")
                setBackground(Color.red);
                if(bList[i].getLabel()=="Blue")
                setBackground(Color.blue);
        }
    }
    repaint();
 }
 public void paint(Graphics g) {
 g.drawString(msg, 6, 100);
 }
}