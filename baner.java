import java.awt.*;
import java.applet.*;
/*
 <applet code="baner" width=500 height=500>
 </applet>
 */
public class baner extends Applet implements Runnable
{
String msg=" this is a banner";
int state;
volatile boolean flag;
Thread t= null;
public void init()
{
 
 setBackground(Color.green);
 setForeground(Color.black);
}
public void start()
{
  t= new Thread(this);

 flag=false;
 t.start();
}
public void run()
{
for(;;)
{
  try
  {
      repaint();
      Thread.sleep(250);
      if(flag==true)
      break;
    }
    catch(InterruptedException e){}
}
}

 

public void stop()
{
 flag=true;
 t=null;}

public void paint(Graphics g)
{
 char ch;
 ch=msg.charAt(msg.length()-1);
 msg=msg.substring(0,(msg.length()-1));
 msg=ch+msg;
 g.drawString(msg,100,100);
}
}
 
