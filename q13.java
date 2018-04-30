import java.util.*;
class TwoDim
{
 private int x;
 private int y;
 TwoDim()
 {
  x=y=0;
 }
 TwoDim(int a,int b)
 {
  x=a;
  y=b;
 }
 void print()
 {
  System.out.print("The coordinates are "+x+","+y);
 }
 }
 class ThreeDim extends TwoDim
 {
  private int z;
  ThreeDim()
  {
   super();
   z=0;
  }
  ThreeDim(int a,int b,int c)
  {
   super(a,b);
   z=c;
  }
  void print()
  {
   super.print();
   System.out.println(","+z);
  }
}
class q13demo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter coordinate:");
  int a=sc.nextInt();
  System.out.print("Enter coordinate:");
  int b=sc.nextInt();
  System.out.print("Enter coordinate:");
  int c=sc.nextInt();	
  TwoDim o1=new ThreeDim(a,b,c);
  o1.print();
  }
}
  
 
  
