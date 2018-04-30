import java.util.*;
class Box
{
    private double length;
    private double breadth;
    private double height;

    public Box()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length:");
        length=sc.nextDouble();
        System.out.print("Enter breadth:");
        breadth=sc.nextDouble();
        System.out.print("Enter height:");
        height=sc.nextDouble();
    }
    public String toString()
    {
        return "Dimensions of the box are:"+"\n"+"length="+length+"\n"+"breadth="+breadth+"\n"+"height="+height;
    }

    public Box(double l ,double b, double h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public double SurfaceArea()
    {
        return 2*(length*breadth+breadth*height+height*length);
    }
    public double Volume()
    {
        return length*breadth*height;
    }
}
class q8demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        do
        {

            System.out.print("Enter 1 to calculate Surface area\nEnter 2 calculate volume\nEnter 3 to display\nEnter 4 to exit\nEnter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {

            case 1:
            {
                Box o1=new Box();
                System.out.println(o1.SurfaceArea());
                break;
            }
            case 2:
            {
                Box o1=new Box();
                System.out.println(o1.Volume());
                break;
            }

            case 3:
            {
                Box o1=new Box();
                System.out.println(o1);
            }

            case 4:
                k=1;
            }
        }
        while(k!=1);
    }
}


