import java.util.Scanner;
import java.lang.Math;

class NegativeNumber extends IllegalArgumentException
{

public String toString()
{
 return "NEGATIVE NUMBER EXCEPTION EXAMPLE" ;
 
}
}

class function
{
public void meth(int n)throws NegativeNumber
 {
  
  if(n<0)
  throw new NegativeNumber();
  else
  System.out.println("THE GIVEN NUMBER IS : "+n);
  

 

}

}
class java17
{


 public static void main(String args[])
 { 
  Scanner input = new Scanner(System.in);
  System.out.println("ENTER AN INTEGER ");
  int x = input.nextInt();
  
  try{
  function N = new function();
  N.meth(x);
  }

 catch(NegativeNumber e)
 {
  System.out.println(" ERROR : NEGATIVE NUMBERS ARE NOT ALLOWED");
  System.out.println(e);
 }
  }

}
