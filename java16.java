
import java.util.Scanner;

class java16
{
 public static void main(String args[])throws ArithmeticException
 {
  Scanner input = new Scanner(System.in);
  System.out.println("TRY DIVIDE_BY_ZERO");
  System.out.println("ENTER THE FIRST INTEGER");
  int a = input.nextInt();
  System.out.println("ENTER THE SECOND INTEGER");
  int b = input.nextInt();

  try
  {
   int result = a/b;
   System.out.println("result of (a / b) is : "+ " " +result);
   if(b==0)
   throw new ArithmeticException();
   

  }

  catch(ArithmeticException e)
  {
   System.out.println(" ERROR : INTEGER CAN'T BE DIVIDED BY ZERO ");
   System.out.println(e);
  }

 }

}
