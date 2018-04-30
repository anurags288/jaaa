import java.util.*;
class Matrix
{ 
  private int arr[][];
  private int row;
  private int column;
  
  Matrix()
  {
     row =column=0;
  } 
  Matrix(int a,int b)
  {
     row=a;
     column=b;
     arr=new int[a][b];
  }
 
  public void input()
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter number of row:");
     row=sc.nextInt();
     System.out.print("Enter number of column:");
     column=sc.nextInt();
     arr=new int[row][column];
  }
  public Matrix Add(Matrix m)
  {  
     Matrix n=new Matrix(row,column);
     for(int i=0;i<row;++i)
       for(int j=0;j<column;++j)
          n.arr[i][j]=arr[i][j]+m.arr[i][j];
     return n;
  }
  public Matrix Subtract(Matrix m)
  {  
     Matrix n=new Matrix(row,column);
     for(int i=0;i<row;++i)
       for(int j=0;j<column;++j)
          n.arr[i][j]=arr[i][j]-m.arr[i][j];
     return n;
  }
  public Matrix Multiply(Matrix m)
  {  
     Matrix c=new Matrix(row,m.column);
     int k=0;
     for(int i=0;i<row;++i)
      for(int j=0;j<m.column;++j)
       while(k++<column)
        arr[i][j]+=arr[i][k]+m.arr[k][j];
     return c;
  }
  public void display()
  {
    for(int i=0;i<row;++i)
      {
      for(int j=0;j<column;++j)
        System.out.print(arr[i][j]+" ");
      System.out.println();
      }
      
   }
   public static void main(String args[])
   {
     Matrix o1=new Matrix();
     o1.input();
     Matrix o2=new Matrix();
     o2.input();
     Matrix o3=o1.Multiply(o2);
     o3.display();
   }
}
        
     
     













  
  
  
       

