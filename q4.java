import java.util.*;
class q4
{
    public int nprime(int n)
    {
        int c=0;
        int i=1;
        while(c!=n)
        {
            ++i;
            if(isPrime(i))
                ++c;
        }
        return i;

    }

    public boolean isPrime(int n)
    {
        boolean flag=true;
        for(int i=2; i<=n/2; ++i)
        {
            if(n%i==0)
                flag=false;
        }
        return flag;
    }
}

class q4demo
{

    public static void main(String args[])
    {
        q4 o1=new q4();
        int n;
        Scanner sc=new Scanner(System.in);
        if(args.length==0 || Integer.parseInt(args[0])<1)
        {
            do
            {
                System.out.print("Enter a number greater than 0:");
                n=sc.nextInt();
            }
            while(n<1);
        }
        else
            n=Integer.parseInt(args[0]);
        System.out.println("The "+ n+"th prime number is:"+ o1.nprime(n));
    }
}


