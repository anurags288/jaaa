import java.util.Scanner;

public class BitPattern 
{
 void bitPattern(int num) 
 {
			
	 int str = 1 << 31;
     int j=0;
	 while(str != 0) 
         {
         if(j%4==0)
		 System.out.print(" ");
		 if((str & num) == 0)
		 {
		 System.out.print("0");
		
		 }
		 else
		 {
		 System.out.print("1");
		 
		 }
		j++;	
		 str = str >>> 1;
		 
         }
  }
} 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
