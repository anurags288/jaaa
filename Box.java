import java.util.*;
class Box
{
 private double length;
 private double breadth;
 private double height;
 
 public Box()
 {
  length=breadth=height=0;
 }
 public Box(double d)
 {
  length=breadth=height=d;
 }
 public Box(double l ,double b, double h)
 {
  length=l;
  breadth=b;
  height=h;
 }
 public void input()
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter length:");
  length=sc.nextDouble();
  System.out.print("Enter breadth:");
  breadth=sc.nextDouble();
  System.out.print("Enter height:");
  height=sc.nextDouble();
 }
 public void display()
 {
  System.out.println("length="+length+"\n"+"breadth="+breadth+"\n"+"height="+height);
 }
 public double volume()
 {
  return length*breadth*height;
 }
}
class DemoBox
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int k=0;
  Box o1=null;
  while(k!=1)
{
  System.out.print("1 to enter dimensions of the box,\n2 to display dimensions,\n3 to display volume\n4 to exit,\nEnter your choice:");
  int ch=sc.nextInt();
  switch(ch)
  {
   case 1: o1=new Box();
           o1.input();
           break;
   case 2: if(o1==null)
            System.out.println("The box has no dimensions:");
           else
            o1.display();
           break;
   case 3: if(o1==null)
            System.out.println("The box has no dimensions:");
           else
            System.out.println(o1.volume());
           break;
   case 4: k=1;
           break;
   default: System.out.println("Invalid choice");
  }
}
}
}


