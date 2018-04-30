import java.util.*;
class Fraction
{
    private int num,deno;

    public Fraction()
    {
        num=0;
        deno=1;
    }
    public Fraction(int n,int d)
    {
        int g=gcd(Math.abs(n),Math.abs(d));
        if(d<0)
        {
            d=-d;
            n=-n;
        }
        num=n/g;
        deno=d/g;
    }
    public Fraction add(Fraction f)
    {
        Fraction t=new Fraction();
        t.num=num*f.deno+deno*f.num;
        t.deno=deno*f.deno;
        t=new Fraction(t.num,t.deno);
        return t;
    }
    public Fraction input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter numerator:");
        int n=sc.nextInt();
        int d=0;
        while(d==0)
        {
            System.out.println("enter denominator:");
            d=sc.nextInt();
        }
        return new Fraction(n,d);
    }


    public Fraction subtract(Fraction f)
    {
        Fraction t=new Fraction();
        t.num=num*f.deno-deno*f.num;
        t.deno=deno*f.deno;
        t=new Fraction(t.num,t.deno);
        return t;
    }
    public Fraction multiply(Fraction f)
    {
        Fraction t=new Fraction();
        t.num=num*f.num;
        t.deno=deno*f.deno;
        t=new Fraction(t.num,t.deno);
        return t;
    }
    public String toString()
    {
        return (num+"/"+deno);
    }
    public int gcd(int a,int b)
    {
        if(a==0)
            return b;
        else if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
class q9demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        int ch;
        do
        {
            System.out.print("\nMENU\n1--->Add\n2--->Subtract\n3--->Multiply\n4--->Exit\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:
            {
                Fraction o1=new Fraction();
                o1=o1.input();
                Fraction o2=new Fraction();
                o2=o2.input();
                System.out.println(o1.add(o2));
                break;
            }
            case 2:
            {
                Fraction o1=new Fraction();
                o1=o1.input();
                Fraction o2=new Fraction();
                o2=o2.input();
                System.out.println(o1.subtract(o2));
                break;
            }
            case 3:
            {
                Fraction o1=new Fraction();
                o1=o1.input();
                Fraction o2=new Fraction();
                o2=o2.input();
                System.out.println(o1.multiply(o2));
                break;
            }
            case 4:
                k=1;
                break;
            default:
                System.out.println("Wrong choice entered");
            }
        }
        while(k!=1);
    }


}






