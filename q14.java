import java.util.*;
abstract class Shape
{
 abstract double Area();
 abstract void Display();
}
class Rectangle extends Shape
{
 double Area()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter length:");
  double l=sc.nextInt();
  System.out.println("Enter breadth:");
  double b=sc.nextInt();
  return l*b;
 }
 void Display()
 {
  System.out.println("The area is:"+Area());
 }
}
class Circle extends Shape
{
 double Area()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter radius:");
  double r=sc.nextInt();
  return 3.14*r*r;
 }
 void Display()
 {
  System.out.println("The area is:"+Area());
 }
}
class q14demo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int k=0;
  do
   {
    System.out.print("1-->Area of Rectangle\n2-->Area of Circle\n3-->Exit\nEnter your choice:");
    int ch=sc.nextInt();
    switch(ch)
        {
          case 1: {
                  Shape o1=new Rectangle();
                  o1.Display();
                  break;
                  }
 
          case 2: {
                   Shape o1=new Circle();
                   o1.Display();
                   break;
                  }
          case 3: k=1;
                   break;
          default:System.out.println("Wrong choice enterd:");
                  break;
         }
   }while(k!=1);
}
} 

 
 
