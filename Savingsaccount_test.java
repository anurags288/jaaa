
class SavingsAccount
{
    static double annualInterestRate;
    private double savingsBalance;
    
    SavingsAccount(double S)
    {
         savingsBalance = S;
    }
    
    static
    {
        annualInterestRate = 0;
    }
    
    double savingsBalance()
    {
         return savingsBalance;
    }
    
    double calculateMonthlyInterest()
    {
         
         double interest = ((savingsBalance * annualInterestRate)/1200);
         savingsBalance += interest;
         return interest;
    }
    
    static void modifyInterestRate(double I)
    {
         annualInterestRate = I;
    }
    
}

class Savingsaccount_test
{
    public static void main(String args[])
    {
        double interest;
        SavingsAccount saver1 = new SavingsAccount(20000);
        SavingsAccount saver2 = new SavingsAccount(30000);
        SavingsAccount.annualInterestRate = 4.0;
        System.out.println();
        System.out.println("Initial Balance is: "+saver1.savingsBalance());
        System.out.println("Interest is: "+saver1.calculateMonthlyInterest());
        System.out.println("Total Balance is: "+saver1.savingsBalance());
        System.out.println();
        System.out.println("Initial Balance is: "+saver2.savingsBalance());
        System.out.println("Interest is: "+saver2.calculateMonthlyInterest());
        System.out.println("Total Balance is: "+saver2.savingsBalance());
        System.out.println();
        SavingsAccount.modifyInterestRate(5);
        System.out.println("Initial Balance is: "+saver1.savingsBalance());
        System.out.println("Interest is: "+saver1.calculateMonthlyInterest());
        System.out.println("Total Balance is: "+saver1.savingsBalance());
        System.out.println();
        System.out.println("Initial Balance is: "+saver2.savingsBalance());
        System.out.println("Interest is: "+saver2.calculateMonthlyInterest());
        System.out.println("Total Balance is: "+saver2.savingsBalance());
    }
}
        
