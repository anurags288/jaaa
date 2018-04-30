import java.util.Scanner;


class program {

    String conversion(int n, int b) {
    
    char Arr[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
  
    String result = "";
	
	while(n > 0) {
		int rem = n % b;
		result = Arr[rem] + result;
		n = n / b;
	}		

return result;
}
}

class program1 {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number in decimal: ");
        int dec = scan.nextInt();

	System.out.print("\nEnter Base: ");
	
	int base = scan.nextInt();
	
	program c = new program();
	
	String result = c.conversion(dec, base);
	
	System.out.println("Result: " + result);

    }

}

   
