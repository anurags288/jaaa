import java.util.Scanner;
class Person
{
    private String name;
    private Address address;
    
    Person(String name,String S,String T,String St,String C,int P)
    {
          this.name = name;
        address = new Address(S,T,St,C,P);
    }
    
    public String toString()
    {
        String S = "";
        S = "Name: "+name+ address.toString();
        return S;
    }
}

class Address
{
    private String street,town,state,country;
    private int pincode;
    
    Address(String S,String T,String St,String C,int P)
    {
        street = S;
        town = T;
        state = St;
        country = C;
        pincode = P;
    }
    
    public String toString()
    {
        
        String S = "";
        S+="\nStreet: "+street+"\nTown: "+town;
        S = S + "\nState: "+state+"\nCountry: "+country;
        S = S + "\nPincode: "+pincode;
        return S;
    }
}

class Person11
{
    public static void main(String args[])
    {
         
        Scanner input = new Scanner(System.in);
 	  
 	        
        
        System.out.println("Enter  name : ");
        String N = input.next();
        
 	  System.out.println("Enter street ");
        String S = input.next();
        
        System.out.println("Enter State : ");
        String ST = input.next();
        
        System.out.println("Enter town  ");
        String T = input.next();
    
        
        System.out.println("Enter Country : ");
        String C = input.next();
       
        System.out.println("Enter Pincode : ");
          int P = input.nextInt();
        
        
        
        Person ob = new Person(N,S,ST,T,C,P);
        System.out.println(ob);   
    
    }
}
        
