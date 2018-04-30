import java.util.*;
class SMdigits
{
 public static void main(String args[])
 {
  int sum=0;
  int product=1;
  int n=Integer.parseInt(args[0]);
  while(n!=0)
  {
    sum+=n%10;
    product*=n%10;
    n=n/10;
  }
  System.out.println("the sum is"+sum+"\n"+"the product is"+product);
}
}
    
