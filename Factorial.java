import java.util.*;
class Factorial
{
 private int fact(int k)
 {
  if(k==1)
     return 1;
  else
     return k*fact(k-1);

 }

 public static void main(String args[])
 {

  Factorial O1=new Factorial();
  if(args.length==0)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter a number:");
   System.out.println(O1.fact(sc.nextInt()));
  }
 else
   System.out.println(O1.fact(Integer.parseInt(args[0])));
}
}

            
