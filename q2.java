import java.util.*;
class q2
{
  public static void main(String args[])
   { 
     Scanner sc=new Scanner(System.in);
     int sum=0;
     for(int i=0;i<Integer.parseInt(args[0]);++i)
      {
       System.out.print("Enter a number:");
            
       sum+=sc.nextInt();
      }
     System.out.println("The sum is:"+sum);
   }
}

