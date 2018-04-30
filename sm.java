import java.util.*;
class SumMul
{
 public static void main(String args[])
 {
  int sum=0;
  int product=1;
  for(int i=0;i<args.length;++i)
   {
      sum=sum+Integer.parseInt(args[i]);
      product=product*Integer.parseInt(args[i]);
   }
 System.out.println("The sum is:"+sum+"\n"+"The product is:"+product);
}
}

 
