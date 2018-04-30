import java.io.*;
class java19
{
    public static void main(String args[])throws IOException
    { 

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String S1 =  in.readLine();
        System.out.println("Enter the Character u Want To Search");
        char ch =  (char)System.in.read();  
        int n = -1;
         int count = -1;
        do
        {
            ++count;
            n = S1.indexOf(ch,n+1);
        }while(n>=0);
         System.out.println("the Character u Want To Search is coming "+count+" times.");   
    }
}
