import java.util.Scanner;

public class Main {
    public static double annuityPresentValueCalc (double c, double i, int n){
        // c = cash flow per period (payment amount)
        // i = interest rate
        // n = number of payments
        return c * ((1 - Math.pow((1 + i), (-n))) / i);
    }

    public static void main(String[] args) {
        // CREATE AN INSTANCE OF SCANNER NAMED s
        Scanner s = new Scanner(System.in);

//        Calculator 3: A calculator that determines the present value of an
//        ordinary annuity. (Note: this is difficult)

//        a. It would accept the monthly payout, expected interest rate,
//        and years to pay out from the user
//
//        b. It would display the present value of that annuity

//        Example: To fund an annuity that pays $3,000 monthly for 20
//        years and earns an expected 2.5% interest, you would need to
//        invest $566,141.46 today.

        // INTRO
        System.out.println("\n--------------- Annuity Present Value Calculator ---------------");

        // USER INPUT VARIABLES
        System.out.println("\nPlease enter the monthly payout amount e.g. 3000: ");
        double monthlyPayout = s.nextDouble();

        System.out.println("\nPlease enter the expected interest rate e.g. 2.5: ");
        double rawExpectedInterest = s.nextDouble();
        // convert yearly rate % into monthly rate decimals
        double expectedInterest = rawExpectedInterest / 100 / 12;

        System.out.println("\nPlease enter the number of years to pay out e.g. 20: ");
        int years = s.nextInt();
        // convert payout period from yearly to monthly
        int numberOfPayment = years * 12;

        // OUTPUT
        double presentValue = annuityPresentValueCalc(monthlyPayout, expectedInterest, numberOfPayment);

        // DISPLAY
        System.out.printf("\nTo fund annuity that pays $%.2f monthly \nfor %d years and \nearns an expected %.2f%% interest \nyou would need to invest $%.2f today."
        ,monthlyPayout, years, rawExpectedInterest, presentValue);
    }
}