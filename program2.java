class program2
{
public static void main(String args[])
{
int even=0,odd=0,a;
for(int i=0;i<args.length;i++)
{
        a = Integer.parseInt(args[i]);
	if(a%2==0)
	  even+=a;
	else
	  odd+=a;
}
System.out.println("Sum of ODD numbers is :"+odd);
System.out.println("Sum of even numbers is :"+even);
}
}
