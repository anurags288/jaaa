import java.util.*;
class occur
{
 String str;
 int arr[]= new int[26];
 public static void main(String args[])
 {
     occur obj=new occur();
     obj.input();
     obj.count();
     obj.display();
    }
 public void input()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter any string");
     str=sc.nextLine();
 }
 
 public void count()
 {
     int k=0;
     for(char a='a';a<='z';a++)
     {
         int c=0;
         for(int i=0;i<str.length();i++)
         {
             if(a==str.charAt(i)||a==Character.toLowerCase(str.charAt(i)))
             c++;
          }
            arr[k++]=c;
        }
    }
 public void display()
  {
      System.out.println("occurences of each alphabet in the string :  ");
      
      System.out.println("alphabet                             occurence");
      for(int i=0; i<=25;i++)
      {
          if(arr[i]!=0)
          {
              System.out.println( ((char)(i+65))+"                                      "+arr[i]); 
            }
        }
    }

}
      