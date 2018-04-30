import java.util.Scanner;

class Recursion {

    int sum, rem;

     int Reverse(int rem, int n) {//To Reverse a Number
        
        if(n == 0) {
            return (rem/10);
        }
        else {
            rem = rem + (n % 10);
            return Reverse(rem*10, n/10);
        }
           
    }


    int Sum(int n) {//To find Sum of digits of a number
        if(n == 0) {
            return sum;
        }
        else {
            sum += n % 10;
            return Sum(n/10);
        }
            
    }

    int FindMax(int a[], int i, int max) {//To find the maximum in a set
        if(i == a.length) 
            return max;
        else {
            if(max < a[i]) {
                max = a[i];
            }
        return FindMax(a, i+1, max);
        }
    }

    int LSearch(int a[], int i, int e) {//Linear Search
        if(i == a.length) 
            return -1;
        else
            if(e == a[i]) {
                return i;
            }
        return LSearch(a, i+1, e);
    }

   

}


class program5 {
    public static void main(String args[]) {
        int choice, N, size;
        boolean ch = true;
        int set[];
	
	N = Integer.parseInt(args[0]);	
	
        Scanner scan = new Scanner(System.in);	
	
        Recursion r = new Recursion();

        do {
            	System.out.println("1. Find Reverse of a Number");
		System.out.println("2. Find Sum of digits of a Number");
		System.out.println("3. Find Maximum number in a Set");
		System.out.println("4. Search for an elment in the Set");
		System.out.println("5. To exit");
		System.out.println("Enter your choice: ");
		 
		choice = scan.nextInt();

        switch(choice) {
            case 1: System.out.println("Reverse of " + N + ": " + r.Reverse(0, N));  
                    break;

            case 2: System.out.println("Sum of Digits of " + N + " is: " + r.Sum(N));
                    break;

            case 3: set = new int[N];

                    System.out.println("Enter your set elements:");
                    for(int i = 0; i < N; ++i) {

                        set[i] = scan.nextInt();
                    }

                    int max = set[0];
                    System.out.println("\nMaximum Number in your set: " + r.FindMax(set, 0, max));
                    break;

            case 4: set = new int[N];

                    System.out.println("Enter your set elements:");
                    for(int i = 0; i < N; ++i) {

                        set[i] = scan.nextInt();
                    }

                    System.out.print("Enter element to be search: ");
                    int elem = scan.nextInt();

                    int pos = r.LSearch(set, 0, elem);

                    if(pos == -1)
                        System.out.println("\nYour element is NOT FOUND!!!!");
                    else
                        System.out.println("\nYour element is Found at position: " + ++pos);
			System.out.println(" ");

                    break;

	    case 5: System.exit(1);
            default: System.out.println("Wrong Choice!!!!!!");
        }
       

        }while(ch);
        
    }
}


