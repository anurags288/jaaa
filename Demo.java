// Use Parameters
import java.awt.*;
import java.applet.*;
/*
<applet code="Demo" width=300 height=80>
<param name=fontName value=Courier>
<param name=fontSize value=14>
<param name=leading value=2>
<param name=accountEnabled value=true>
<param name=height value=700>
<param name=width value=800>
<param name=message value=this is to demonstrate passing of parameters to applets>
</applet>
*/
public class Demo extends Applet {
 String fontName;
 int fontSize;
 float leading;
 boolean active;
 float height, width;
 String message;
 // Initialize the string to be displayed.
 public void start() {
 String param;
 fontName = getParameter("fontName");
 if(fontName == null)
 fontName = "Not Found";
  message = getParameter("message");
 if(message == null)
 message = "Not Found";
 param = getParameter("fontSize");
 try {
 if(param != null)
 fontSize = Integer.parseInt(param);
 else
 fontSize = 0;
 } catch(NumberFormatException e) {
     fontSize = -1;
 }
 param = getParameter("height");
 try {
 if(param != null)
 height = Float.valueOf(param).floatValue();
 else
 height = 0;
 } catch(NumberFormatException e) {
 height = -1;
 }
  param = getParameter("width");
 try {
 if(param != null)
 width = Float.valueOf(param).floatValue();
 else
 width = 0;
 } catch(NumberFormatException e) {
 width = -1;
 param = getParameter("accountEnabled");
 if(param != null)
 active = Boolean.valueOf(param).booleanValue();
 }
}
 // Display parameters.
 public void paint(Graphics g) 
 {
 g.drawString("Font name: " + fontName, 0, 10);
 g.drawString("Font size: " + fontSize, 0, 26);
 g.drawString("Height: " + height, 0, 42);
 g.drawString("Width: " + width, 0, 60);
 g.drawString("Message: " + message, 0, 75);
 g.drawString("Account Active: " + active, 0, 90
 );
 }
}