import java.io.*;
import java.util.Scanner;
class Person_details
{
    private String name,fathersName,dob;
    private int age;
    
    Person_details(String name,String FN,String DOB,int A)
    {
        this.name = name;
        fathersName = FN;
        dob = DOB;
        age = A;
    }
    
     public String toString()
    {
        String S = "";
        S = "Name: "+name+"\nFather's Name: "+fathersName+"\nDate Of Birth: "+dob;
        S = S + "\nAge: "+age;
        return S;
    }
}
    
    class Student extends Person_details
{
    private String Class;
    private int rollNo,marks_obtained;
    
    Student(String name,String FN,String DOB,int A,String C,int RN,int M)
    {
        super(name,FN,DOB,A);
        Class = C;
        rollNo = RN;
        marks_obtained = M;
    }
    
    public String toString()
    {

        String S = super.toString();
        S += "\nClass: "+Class+"\nRoll No. : "+rollNo+"\nMarks Obtained: "+marks_obtained;
        return S;
    }
}
   
class Person
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
 	  
 	        
        
        System.out.println("Enter Student's name : ");
        String SN = input.next();
        
 	  System.out.println("Enter Father's name : ");
        String FN = input.next();
        
        System.out.println("Enter Student's age : ");
           int a = input.nextInt();
        
        System.out.println("Enter Course:  ");
        String c = input.next();
        
        System.out.println("Enter Student's Roll number : ");
          int SR = input.nextInt();
        
        System.out.println("Enter Student's Date of Birth : ");
        String DOB = input.next();
       
        System.out.println("Enter Student's marks : ");
          int SM = input.nextInt();
        
        
        
        Student ob = new Student(SN,FN,DOB,a,c,SR,SM);
        System.out.println(ob);
    }
}
        
