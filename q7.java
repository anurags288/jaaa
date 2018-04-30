import java.util.*;
class Complex
{
    private int real,imaginary;

    public Complex()
    {
        real=0;
        imaginary=0;
    }
    public Complex Add(Complex c)
    {
        Complex d=new Complex();
        d.real=real+c.real;
        d.imaginary=imaginary+c.imaginary;
        return d;
    }
    public Complex Subtract(Complex c)
    {
        Complex d=new Complex();
        d.real=real-c.real;
        d.imaginary=imaginary-c.imaginary;
        return d;
    }
    public Complex Multiply(Complex c)
    {
        Complex d=new Complex();
        d.real=real*c.real-imaginary*c.imaginary;
        d.imaginary=real*c.imaginary+imaginary*c.real;
        return d;
    }
    public String toString()
    {
        return real+"+i"+imaginary;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real part:");
        real=sc.nextInt();
        System.out.print("Enter imaginary part:");
        imaginary=sc.nextInt();
    }
}
class q7demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        do
        {

            System.out.print("Enter 1 to add two complex numbers\nEnter 2 subtract two complex numbers\nEnter 3 to multiply two complex numbers\nEnter 4 to exit\nEnter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {

            case 1:
            {
                Complex o1=new Complex();
                Complex o2=new Complex();
                o1.input();
                o2.input();
                System.out.println(o1.Add(o2));
                break;
            }
            case 2:
            {
                Complex o1=new Complex();
                Complex o2=new Complex();
                o1.input();
                o2.input();
                System.out.println(o1.Subtract(o2));
                break;
            }

            case 3:
            {
                Complex o1=new Complex();
                Complex o2=new Complex();
                o1.input();
                o2.input();
                System.out.println(o1.Multiply(o2));
                break;
            }

            case 4:
                k=1;
            }
        }
        while(k!=1);
    }
}














