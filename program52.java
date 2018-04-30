import java.io.*;
class recrusive
{
static int reverse(int a, int r)
{ 
 if(a==0)
  return r;
  else
 {
   r+=(a%10)*10;
  return reverse(a/10,r);
 }
}

static int sum_of_digits(int a, int s)
{
 if(a==0)
 return s;
 else
  {
  s+= a%10;
  return sum_of_digits(a/10,s);
  }
}
 
	public static void main(String args[])throws IOException
{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int c,a;
		System.out.println("\tPLEASE ENTER A CHOICE");
		System.out.println("1. To get the reverse of Integer entered");
		System.out.println("2. For sum of the digits of the entered Integer:");
		System.out.println("3. To find Max number in a set of N Integer :");
		System.out.println("4. To search for a given number in a set of Integer :");
		System.out.println("\t***END OF MENU***");
		
		c=Integer.parseInt(br.readLine());
		
	
	switch(c)
	{
		case 1: System.out.println("Enter Integer");
			a =Integer.parseInt(br.readLine());
			int rev = reverse(a,0);
			System.out.println("Reverse of Number is : "+rev);break;
		case 2: System.out.println("Enter Integer");
			a =Integer.parseInt(br.readLine());
			int sum = sum_of_digits(a,0);
			System.out.println("Sum of Digits of Integer is : "+sum);break;
		case 3: int A[] = new int[100];
			int count=0;
			System.out.println("Enter N integers: ");
			while(Integer.parseInt(br.readLine())
			{
			A[] = Integer.parseInt(br.readLine();
			count++;
			}
			int Max = max(A,count);
			
		
	}
}
}

