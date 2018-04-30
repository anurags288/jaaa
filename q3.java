import java.util.*;
class q3
{
  public int fact(int n)
  {
   int f=1;
   for(int i=1;i<=n;++i)
     f=f*i;
   return f;
  }
  public int gcd(int a,int b)
  {
   if(a==0)
     return b;
   else if(b==0)
     return a;
   else if(a%b==0)
     return b;
   else
     return gcd(b,a%b);
  }
  public int fibo(int n)
  {
   if(n==1)
     return 0;
   else if(n==2)
     return 1;
   else 
     return fibo(n-1)+fibo(n-2);
  }
  public static void main(String args[])
  {
   q3 a=new q3();
   System.out.println(a.fibo(4));
  }
 }
class q3demo
{
  public static void main(String args[])
  {
   
    q3 o1=new q3();
    Scanner sc=new Scanner(System.in);
    int a=0;
    do
    {

 
     System.out.print("1------>Factorial of a number\n2------>Gcd of two positive numbers\n3------>nth term of fibonacci series\n4------>To exit\nEnter your choice:");
     int ch=sc.nextInt();
     switch(ch)
      {

       case 1:{
               int k=-1;
               while(k<0)
               {
                 System.out.print("Enter a number greater than or equal to 0:");
                 k=sc.nextInt();
               }
               System.out.println("The factorial is:"+o1.fact(k));
               break;
              }
       case 2:{
               int k=-1;
               int m=-1;
               while(k<0||m<0)
               {
                System.out.print("Enter a positive number:");
                k=sc.nextInt();
                System.out.print("Enter a positive number:");
                m=sc.nextInt();
               }
               System.out.println("The gcd is:"+o1.gcd(k,m));
               break;
              }
       case 3:{
               int k=0;
               while(k<=0)
               {
                System.out.print("Enter a number greater than 0:");
                k=sc.nextInt();
               }
               System.out.println("The "+k+"th term is:"+o1.fibo(k));
               break;
              }
       case 4: a=1;
               break;
       default:System.out.println("Wrong choice enterd");
     }
   }while(a==0);
}
}
    
     
  
