import java.util.Scanner;

class bitwise{

		void bitPattern(int n) {
		        int m = 1 << 31;
			int c=1;
			while(m != 0) {
				if(c>4) 
					{System.out.print(" ");c=1;}
				if((m&n) == 0)
					System.out.print("0");
				else
					System.out.print("1");
				c++;
				
				m = m >>> 1;
			}
		System.out.println();
	}

}

class program6 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		bitwise b = new bitwise();

		System.out.print("Enter Number: ");
		int num = scan.nextInt();

		b.bitPattern(num);
 		
	}
}
