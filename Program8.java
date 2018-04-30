import java.io.*;
class Program8
{
 
    double Area(double r) 
    {
         return ((22.0/7.0)*r*r);
    }

    double Area(double a,double b,double c) 
    { if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==b*b+a*a)
        {double s = (a+b+c)/2;
         return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
         }
         else{
         System.out.println("Wrong Input. Triangle not possible. Program terminating...");
         System.exit(0);
           return -1;
             }
    }
    
    double Area(double length,double breadth) 
    {
         return (length*breadth);
    }


  
    public static void main(String args[])throws IOException
    {
          
          double a1,a2,a3,Area = 0;
          Program8 obj = new Program8();
          if(args[0].equalsIgnoreCase("circle"))
          {
            a1 = Double.parseDouble(args[1]);
            Area = obj.Area(a1);
            
          }
          
          else if(args[0].equalsIgnoreCase("rectangle"))
          {
            a1 = Double.parseDouble(args[1]);
            a2 = Double.parseDouble(args[2]);
            Area = obj.Area(a1,a2);
          }

          else if(args[0].equalsIgnoreCase("triangle"))
          {
            a1 = Double.parseDouble(args[1]);
            a2 = Double.parseDouble(args[2]);
            a3 = Double.parseDouble(args[3]);
            Area = obj.Area(a1,a2,a3);
            
          }
 
          else
           System.out.println("Wrong Input");
           
          System.out.println("Area of "+args[0]+" is "+Area);  
    }
}
             
