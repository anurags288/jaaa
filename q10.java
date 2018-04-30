import java.util.*;
class Matrix
{
    private int arr[][];
    private int row;
    private int column;
    Matrix(int r,int c)
    {
        row=r;
        column=c;
        arr=new int[row][column];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements,each after pressing enter:");
        for(int i=0; i<row; ++i)
            for(int j=0; j<column; ++j)
                arr[i][j]=sc.nextInt();
    }
    Matrix Add(Matrix o1)
    {
        Matrix m= new Matrix(row,column);
        for(int i=0; i<m.row; ++i)
            for(int j=0; j<m.column; ++j)
                m.arr[i][j]=arr[i][j]+o1.arr[i][j];
        return m;
    }
    Matrix Subtract(Matrix o1)
    {
        Matrix m= new Matrix(row,column);
        for(int i=0; i<m.row; ++i)
            for(int j=0; j<m.column; ++j)
                m.arr[i][j]=arr[i][j]-o1.arr[i][j];
        return m;
    }
    Matrix Multiply(Matrix o1)
    {
        Matrix m= new Matrix(row,o1.column);
        for(int i=0; i<row; ++i)
            for(int j=0; j<o1.column; ++j)
            {
                int k=0;
                int sum=0;
                while(k<row)
                {
                    sum=sum+arr[i][k]*o1.arr[k][j];
                    ++k;
                }
                m.arr[i][j]=sum;
            }
        return m;
    }
    Matrix Transpose()
    {
        Matrix m = new Matrix(row,column);
        for(int i=0; i<row; ++i)
            for(int j=0; j<column; ++j)
                m.arr[i][j]=arr[j][i];
        return m;
    }
    int Trace()
    {
        int sum=0;
        for(int i=0; i<row; ++i)
            sum+=arr[i][i]+arr[i][row-i-1];
        sum-=arr[row/2][row/2];
        return sum;
    }
    void display()
    {
        for(int i=0; i<row; ++i)
        {
            for(int j=0; j<column; ++j)
                System.out.print(arr[i][j]+" ");

            System.out.println();
        }
    }
}
class q10demo
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int k=0;
        int ch;
        do
        {
            System.out.print("\nMENU\n1--->Add\n2--->Subtract\n3--->Multiply\n4--->Transpose\n5--->Trace\n6--->Exit\nEnter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:
            {
                System.out.print("Number of rows?:");
                int r1=sc.nextInt();
                System.out.print("Number of columns?:");
                int c1=sc.nextInt();
                Matrix o1=new Matrix(r1,c1);
                System.out.println("For second matrix");
                System.out.print("Number of rows?:");
                int r2=sc.nextInt();
                System.out.print("Number of columns?:");
                int c2=sc.nextInt();
                Matrix o2=new Matrix(r2,c2);
                if(r1!=r2||c1!=c2||r1<=0||r2<=0||c1<=0||c2<=0)
                    System.out.println("This operation cannot be performed");
                else
                {   o1.input();
                    o2.input();
                    Matrix o3=o1.Add(o2);
                    o3.display();
                }
                break;
            }
            case 2:
            {
                System.out.print("Number of rows?:");
                int r1=sc.nextInt();
                System.out.print("Number of columns?:");
                int c1=sc.nextInt();
                Matrix o1=new Matrix(r1,c1);
                System.out.println("For second matrix");
                System.out.print("Number of rows?:");
                int r2=sc.nextInt();
                System.out.print("Number of columns?:");
                int c2=sc.nextInt();
                Matrix o2=new Matrix(r2,c2);
                if(r1!=r2||c1!=c2||r1<=0||r2<=0||c1<=0||c2<=0)
                    System.out.println("This operation cannot be performed");
                else
                {   o1.input();
                    o2.input();
                    Matrix o3=o1.Subtract(o2);
                    o3.display();
                }
                break;
            }


            case 3:
            {
                System.out.print("Number of rows?:");
                int r1=sc.nextInt();
                System.out.print("Number of columns?:");
                int c1=sc.nextInt();
                Matrix o1=new Matrix(r1,c1);
                System.out.println("For second matrix");
                System.out.print("Number of rows?:");
                int r2=sc.nextInt();
                System.out.print("Number of columns?:");
                int c2=sc.nextInt();
                Matrix o2=new Matrix(r2,c2);
                if(c1!=r2)
                    System.out.println("This operation cannot be performed");
                else
                {   o1.input();
                    o2.input();
                    Matrix o3=o1.Multiply(o2);
                    o3.display();
                }
                break;
            }
            case 4:
            {
                System.out.print("Number of rows?:");
                int r1=sc.nextInt();
                System.out.print("Number of columns?:");
                int c1=sc.nextInt();
                Matrix o1=new Matrix(r1,c1);
                if(r1<=0||c1<=0)
                    System.out.println("This operation cannot be performed");
                else
                {   o1.input();
                    Matrix o3=o1.Transpose();
                    o3.display();
                }
                break;
            }
            case 5:
            {
                System.out.print("Number of rows?:");
                int r1=sc.nextInt();
                System.out.print("Number of columns?:");
                int c1=sc.nextInt();
                Matrix o1=new Matrix(r1,c1);
                if(r1<=0||c1<=0||r1!=c1)
                    System.out.println("This operation cannot be performed");
                else
                   {
                    o1.input();
                    System.out.println(o1.Trace());
                   }


                break;
            }
            case 6:
                k=1;
                break;
            default:
                System.out.println("Wrong choice entered");
            }
        }
        while(k!=1);
    }
}
