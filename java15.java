
 
import P1.SumOdd;
import P2.SumEven;
import java.util.Scanner;

class java15
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("ENTER THE NUMBER (N)");
  int N = input.nextInt();

  System.out.println("WHAT OPERATION YOU WANT  :  ");
  System.out.println("(1) ODD ");
  System.out.println("(2) EVEN ");
  System.out.println("SELECT OPTION");
 
  int opt = input.nextInt();

  switch(opt)
  {
  

  case 1  :  SumOdd S1 = new SumOdd();
                 S1.Sum_N_Odd(N);
                 break;

  case 2  :  SumEven S2 = new SumEven();
                 S2.Sum_N_Even(N);
                 break;

  default     :  System.out.println("WRONG INPUT!!!! ");
                
                 break;
                 

  }


}

}

  
