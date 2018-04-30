import java.util.Scanner;

class OverFlowException extends IndexOutOfBoundsException
{
 public OverFlowException(String s)
 {
  System.out.print(s);
 }

 public String toString()
 {
  return "\n"+" ERROR : ";
 }
}

class UnderFlowException extends IndexOutOfBoundsException
{
 public UnderFlowException(String s)
 {
  System.out.print(s);
 }
 
 public String toString()
 {
  return "\n"+" ERROR : ";
 }
}

class Stack
{
 private int top;
 private int height; 
 private int[] storage;

 public Stack(int size)
 {
  if(size<=0)
   throw new IllegalArgumentException(" SIZE OF STACK SHOULD BE GREATER THAN \'0\' ");
  else
   height = size;
  top = -1;
  storage = new int[height];
 }

 public void push(int num)
 {
  
  if(top+1>=height)
  throw new OverFlowException("THIS IS AN OVER-FLOW CASE");
  storage[++top] = num;
 }
 
 public int pop()
 {
  if(top<0)
  throw new UnderFlowException("THIS IS AN UNDER-FLOW CASE");
  return storage[top--];
 }


 public void display()
 {
  System.out.print(" STACK = ");
  if(top <= -1)
   System.out.print("EMPTY");
  
  for(int i=top; i>=0;i--)
  {
    System.out.print(" "+storage[i]+ " ");
  }

 }

}
class java18
{
 public static void main(String args[])throws OverFlowException,UnderFlowException
 {
  Scanner input = new Scanner(System.in);
  System.out.println(" STACK PROGRAMM ");
  System.out.println("ENTER THE SIZE FOR THE STACK ");
  int size = input.nextInt();
  
  Stack s = new Stack(size);
 
  int choice;
  char ch;
  do{
  System.out.println("===================STACK OPERATIONS==================");
  System.out.println(" (1) PUSH ");
  System.out.println(" (2) POP  ");
  System.out.println("ENTER YOUR CHOICE ");
  choice = input.nextInt();
  
  
  switch(choice)
  {
   
   case 1 : System.out.println("ENTER THE ELEMENTS TO PUSH IN THE GIVEN STACK ");
            try{
            s.push(input.nextInt());
            }
            catch(OverFlowException over)
            {
              System.out.print(over);
              System.out.println("OVER-FLOW ENCOUNTERED ");
              System.out.println();
            }
              break;

   case 2 : try{
             s.pop();
             }
             catch(UnderFlowException under)
              {
               System.out.print(under);
               System.out.println(" UNDER-FLOW ENCOUNTERED ");
               System.out.println();
              }

            break;

   default :  System.out.println(" WRONG INPUT !!!!!!! ");
              break;

   }
   s.display();

   System.out.println("\n" +" DO YOU WANT TO CONTINUE ( Y / N ) ");
   ch = input.next().charAt(0);
   
   

  }
   while(ch == 'y' || ch == 'Y');

  

}

} 
  
  
  
  

