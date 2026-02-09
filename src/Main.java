public class Main
{
    public static void main(String[] args)
    {
        double creditCardBalance = 5000;
        double interestRate = .17;

        System.out.println("Your credit card balance is $" + creditCardBalance + " and the interest rate is " + (int) (interestRate * 100) + "%.");
        System.out.println("Interest due after one month is $" + creditCardBalance * interestRate + ".");
        creditCardBalance += creditCardBalance * interestRate;
        System.out.println("Interest due after two months is $" + creditCardBalance * interestRate + ".");
    }
}
