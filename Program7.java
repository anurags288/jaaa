import java.util.Scanner;

class Conversion 
{

    public String result;
    int count=0;
    
    String conversion(int n) 
    {
    
     char res[] = {'0','1'};
  
     result = "" ;
	
	  while(n > 0) 
	  {
		int rem = n % 2;
		result = res[rem] + result;
		count++;
		n = n / 2;
		
	  }
	  
      if ( result == "" )
      {
        result = " 0 " ;
      }
       
      return result;
    }

   }
 
 
class Program7
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter two integer values");
   int x = input.nextInt();
   int y = input.nextInt();
   String s1;
   Conversion c = new Conversion();
   String s2=c.conversion(x);
   String s3=c.conversion(y);
   
   System.out.println ( x + " = " + s2 ) ;
   System.out.println ( y + " = " + s3 ) ;
   
   System.out.println("left shifting the first number by the second" + "  " + (x<<y) );
   s1=c.conversion(x<<y);
   System.out.println(s2+" << "+s3 +" = " +s1);
   
   System.out.println("right shifting the first number by the second" + "  " + (x>>y) );
   s1=c.conversion(x>>y);
   System.out.println(s2 + " >> "+ s3 + " = "+s1);
   
   System.out.println("exclusive OR of  the first number by the second bitwise" + "  " + (x^y) );
   s1=c.conversion(x^y);
   System.out.println(s2 + " ^ " + s3 +" = "+s1);
   
   System.out.println("OR of  the first number by the second bitwise" + "  " + (x|y) );
   s1=c.conversion(x|y);
   System.out.println(s2 + " | " + s2 +" = " +s1);
  
   System.out.println("AND of the first number by the second" + "  " + (x&y) );
   s1=c.conversion(x&y);
   System.out.println(s2 + " & " + s3 +" = " +s1);
   
   
   System.out.print("the one's complement of first number"+ " = "); 
   BitPattern b = new BitPattern();
   b.bitPattern(~x);
   
   System.out.println ( ) ;
   
    System.out.print("the one's complement of second number"+" = ");
    BitPattern b1 = new BitPattern();
    b1.bitPattern(~y);
    

 }
 }           
 
 

