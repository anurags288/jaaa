import java.util.*;
class instead
{
 String arr[]=new String[100];
  public static void main(String args[]) 
  {
      String str; String str1;
      instead obj=new instead();
      System.out.println("this is a program to find index of given char and checking two strings for eqaulity \n press 1 for index and 2 for equality");
      int ch;char character1;
      Scanner sc=new Scanner(System.in);
      ch=sc.nextInt();
      while(ch==1|| ch==2)
      {
           Scanner sc1=new Scanner(System.in);
          System.out.println("enter a string");
          str=sc1.nextLine();
          if(ch==1)
          {
              System.out.println("enter a character to find location of");
              character1=(sc1.next()).charAt(0);
              obj.index(str,character1);
        }
          if(ch==2)
          {
            System.out.println("enter another string");
            str1=sc1.nextLine();
            obj.equal(str,str1);
        }
          System.out.println("want to do more string operations? if yes enter 1 for index and 2 for equality \nElse press random button");
          ch=sc1.nextInt();
          if(ch!=1 && ch!=2)
          System.out.println("program terminated");
       }
    
    }

  public void index(String str,char character1)
    {
        int c=0;
     
         for(int i=0; i<str.length();i++)
         {
             if(character1==str.charAt(i))
             {
                 System.out.println("the index of "+character1+" = "+i);
                 c++;
             }
     
    }
    if(c==0)
     System.out.println("the character is not in the string");
}
 public void equal(String str,String str1)
    {
        int m=0;
        if(str.length()==str1.length())
        {
         for(int i=0; i<str.length();i++)
         {
             if(str1.charAt(i)!=str.charAt(i))
             {
                 m=1;
               break;
            }
        }
        if(m==0)
        System.out.println("both the strings are equal");
        else
         System.out.println("both the strings are not equal");
        }
        else
         System.out.println("both the strings are not equal");
        }
         }
        