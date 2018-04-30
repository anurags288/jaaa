class myException extends Exception 
{
 private String  detail;
 myException(String a)
 {
     detail=a;
    }
   public String toString()
    {
        return "myException "+detail;
    }
}
class demo
{
 public static void compute(int c) throws myException
 {
     if(c>10)
     {
         throw new myException("demo");
        }
        System.out.println("normal execution");
    }
    public static void main(String args[])
    {
        try{
        compute(5);
        compute(11);}
        catch(myException e){
        System.out.println("caught"+e);
    }
}}
    
     
     
  
 