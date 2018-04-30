import java.io.*;
class program4
{
   public static void main(String args[])throws IOException
   {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Number Of Cities");
       int row = Integer.parseInt(in.readLine());
       System.out.println("Enter the Number of Days");
       int col = Integer.parseInt(in.readLine());
       String S[]=new String[row];
        
       int A[][] = new int[row][col];
       int Ar[] = new int[col*row];
       int a = 0;
       System.out.println("Enter The Names Of Cities");
       for(int i = 0;i<row;i++)
       {
         System.out.println("Enter City No. "+(i+1)+".");
         S[i] = in.readLine();
       } 
        
       for(int i = 0;i<row;i++)
        {
          System.out.println("Enter The Temperature of "+S[i]+" City");
          
         for(int j = 0;j<col;j++)
         {
          System.out.println("Enter The Temperature of Day "+(j+1)+".");
            A[i][j] = Integer.parseInt(in.readLine());
            Ar[a++] = A[i][j];
         }
  
        }
        
        int max = Ar[0];
        int min = Ar[0];
        int maxpos = 0,minpos = 0;

        for(int i = 0 ;i<a;i++)
        {
           if(Ar[i]>max)
           {
             max = Ar[i];
             maxpos = i;
           }
           if(Ar[i] < min)
            {
              min = Ar[i];
              minpos = i;
            }
       }    
      System.out.print(minpos+maxpos);
      System.out.println("The maximum Tempertare is on Day "+((maxpos%col)+1)+" and in city "+S[maxpos/col]+" = "+max); 
      System.out.println("The minimun Tempertare is on Day "+((minpos%col)+1)+" and in city "+S[minpos/col]+" = "+min);       
}
}                    
       

  

        
