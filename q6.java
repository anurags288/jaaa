import java .util.*;
class q6
{   
    int arr[];
    public void printeven()
    {
        for(int i=0; i<arr.length; ++i)

            if(arr[i]%2==0)
                System.out.println(arr[i]);

    }
    public void printodd()
    {
        for(int i=0; i<arr.length; ++i)

            if(arr[i]%2==1)
                System.out.println(arr[i]);

    }
    public void SumandAvg()
    {
        int sum=0;
        for(int i=0; i<arr.length; ++i)
            sum+=arr[i];
        System.out.println("The sum is:"+sum+"\n"+"The average is"+(sum*1.0)/arr.length);
    }
    public void printrev()
    {
        for(int i=arr.length-1; i>=0; --i)
            System.out.println(arr[i]);
    }
}
class q6demo
{
    public static void main(String args[])
    {
        int i=0,k=0;
        q6 o1=new q6();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array:");
        o1.arr=new int[sc.nextInt()];
        System.out.println("enter elements");
        while(i!=o1.arr.length)
            o1.arr[i++]=sc.nextInt();
        do
        {

            System.out.print("Enter 1 to print even valued elements\nEnter 2 to print odd valued elements\nEnter 3 to calculate sum and average of elements\nEnter 4 to print array in reverse order\nEnter 5 to exit\nEnter your choice:");
            int ch=sc.nextInt();
            switch(ch)
            {

            case 1:
                o1.printeven();
                break;

            case 2:
                o1.printodd();
                break;

            case 3:
                o1.SumandAvg();
                break;
            case 4:
                o1.printrev();
                break;
            case 5:
                k=1;
                break;
            }
        }
        while(k!=1);
    }
}











