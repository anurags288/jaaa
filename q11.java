import java.util.*;
class Stack
{
 private int arr[];
 private int top;
 
 Stack(int size)
 {
   arr=new int[size];
   top=-1;
 }
 void push()
 {
  if(top==arr.length-1)
    System.out.println("The stack is full");
  else
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter an element to push:");
   arr[++top]=sc.nextInt();   }
 }
 int pop()
 {
  if(top == -1)
   {
    System.out.println("The Stack is empty");
    return -999;
   }
  else
    return arr[top--];
 }
 void display()
 {
  if(top==-1)
   System.out.println("The stack is empty");
  else
   for(int i=top;i>=0;--i)
     System.out.println(arr[i]);
  }
}
class q11demo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int d=-1;
  while(d<=0)
  {
    System.out.println("Enter size of the stack:");
    d=sc.nextInt();
  }  
  int k=0; 
  Stack o1=new Stack(d);
  do
  {

  System.out.print("1--->Push\n2--->Pop\n3--->Display\n4--->Exit\nEnter your choice:");
  int ch=sc.nextInt();
  switch(ch)
  {
     case 1: o1.push();
             break;
 
     case 2: int u=o1.pop();
             if(u ==-999)
              break;
             else
              System.out.println(u);
             break;
     case 3: o1.display();
             break;
     case 4: k=1;
             break;
     default: System.out.println("Wrong choice entered");
             break;
  }
 }while(k!=1);
}
}
  
           
             
