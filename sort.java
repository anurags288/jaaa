import java.util.*;
class sort
{
  String arr[]=new String[100];
  public static void main(String args[]) 
  {
      String str;
      sort obj=new sort();
      System.out.println("this is a program tp sort strings, if you want to continue, press 1");
      int ch;
      Scanner sc=new Scanner(System.in);
      ch=sc.nextInt();
      while(ch==1)
      {
           Scanner sc1=new Scanner(System.in);
          System.out.println("enter a string");
          str=sc1.nextLine();
          obj.sorting(str);
          System.out.println("want to sort more string? if yes enter 1 \nElse press random button");
          ch=sc1.nextInt();
          if(ch!=1)
          System.out.println("program terminated");
       }
    }

  public void sorting(String str)
    {
         StringTokenizer st= new StringTokenizer(str," ");
         int x=0;
         while(st.hasMoreTokens())
         { 
             arr[x++]=st.nextToken();
         }
      for(int j = 0; j < x; j++) 
      {
          for(int i = j + 1; i <x; i++) 
          {
              if(arr[i].compareTo(arr[j])<0)
              {
                  String t = arr[j];
                  arr[j] = arr[i];
                  arr[i] = t;
              }
          }
            System.out.println(arr[j]);
       }
    }
}

