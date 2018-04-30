import java.awt.*;
import java.applet.*;
/*
<applet code="Banner" width=500 height=500>
</applet>
*/
public class Banner extends Applet implements Runnable {
 String msg = " This message has been put on a banner.";
 Thread t = null;
 int state;
 volatile boolean stopFlag;
 // Set colors and initialize thread.
 public void init() 
 {
    setBackground(Color.yellow);
    setForeground(Color.black);
 }
 // Start thread
 public void start()
 {
    t = new Thread(this);
    stopFlag = false;
    t.start();
 }
 // Entry point for the thread that runs the banner.
 public void run()
 {
    // Redisplay banner
    for( ; ; )
    {
        try
        {
            repaint();
            Thread.sleep(250);
            if(stopFlag)
                break;
            } catch(InterruptedException e) {}
        }
 }
 // Pause the banner.
 public void stop()
 {
    stopFlag = true;
    t = null;
 }
 // Display the banner.
 public void paint(Graphics g)
 {
    char ch;
    ch = msg.charAt(msg.length()-1);
    msg = msg.substring(0, msg.length()-1);
    msg = ch+msg;
    g.drawString(msg, 100, 100);
 }
}