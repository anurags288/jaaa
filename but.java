import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
 <applet code="but" width=500 height=500>
 </applet>
 */
public class but extends Applet implements ActionListener
{
String msg;
Button btlist[]=new Button[3];
public void init()
{
 Button yes= new Button("Yes");
 Button no= new Button("No");
 Button maybe=new Button("Maybe");
 
 btlist[0]=(Button) add(yes);
 btlist[1]=(Button) add(no);
 btlist[2]=(Button) add(maybe);

 for(int i=0; i<3;i++)
 {
     btlist[i].addActionListener(this);
    }
}
public void actionPerformed(ActionEvent ae){
for(int i=0;i<3;i++)
{
  if(btlist[i]==ae.getSource())
  msg="you pressed "+btlist[i].getLabel();
 
}
 repaint();
}
public void paint(Graphics g)
{
 g.drawString(msg,100,100);
}
}