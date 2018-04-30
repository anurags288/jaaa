import java.util.Scanner;


class TwoDim
{

 int x, y;

 TwoDim()
 {
  x=0;
  y=0;
 }

 TwoDim(int x1 , int y1)
 {
  x = x1;
  y = y1;
 }

 void print()
{
 
 System.out.println("THE X COORDINATE IS : " + x);
 System.out.println("THE Y COORDINATE IS : " + y);

}

}

class ThreeDim extends TwoDim
{

 int z;
 
 ThreeDim( int x1,int y1,int z1)
  {
   super(x1,y1);
   z =z1;

  }

  void print()
  {
   super.print();
   System.out.println("THE Z COORDINATE IS : " +z);

  }

}


class java13
{
 public static void main(String args[])
 {
  
  Scanner input = new Scanner(System.in);
  int X ,Y , Z;
  System.out.println("ENTER THE X COORDINATE :");
  X = input.nextInt();

  System.out.println("ENTER THE Y COORDINATE :");
  Y = input.nextInt();
  
  System.out.println("ENTER THE Z COORDINATE :");
  Z = input.nextInt();

  System.out.println("IN TWO DIMENSION :");
  TwoDim T1 = new TwoDim(X,Y);
  T1.print();

  System.out.println();
  ThreeDim T2 = new ThreeDim(X,Y,Z);
  System.out.println("IN THREE DIMENSION  :");

  T1 = T2;
  T1.print();


}


}
  
