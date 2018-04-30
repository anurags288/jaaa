import java.io.*;
class program3
{ 
static boolean is_prime(int n)
	{
         for(int i=2;i<=n/2;i++)
		{if(n%i == 0)
			return false;
		}		
			return true;
	}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=0;int i=2;
if(args.length == 0)
{
	System.out.println("Please Enter value of n");
	a=Integer.parseInt(br.readLine());
}
else 
a=Integer.parseInt(args[0]);
System.out.println(a+"th PRIME NO IS : ");
while(a != 0)
{	 	
	 if(is_prime(i))
		{a--;}	
	 i++;

}
System.out.println("\t"+--i);
	}
}
