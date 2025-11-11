package Practice.set1;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for taking user input

        // Declaring variables
        double p, s, mi, sum, emi, sq;
        int y, n, k, yrs, l = 0;
        double[] bank = new double[5]; // To store total repayment for both banks

        // Taking principal amount input
        System.out.println("Enter the principal amount");
        p = sc.nextDouble();

        // Taking total loan tenure (in years)
        System.out.println("Enter tenature year");
        y = sc.nextInt();

        // Loop for both banks (Bank A and Bank B)
        for (k = 0; k < 2; k++)
        {
            System.out.println("Enter the no of slabs");
            n = sc.nextInt(); // Number of interest slabs for the current bank
            sum = 0;          // Reset total repayment sum for this bank

            // Loop for each slab
            for (int i = 0; i < n; i++)
            {
                System.out.println("Enter the period :");
                yrs = sc.nextInt();                 // Years for this slab

                System.out.println("Enter the intrest :");
                s = sc.nextDouble();                // Annual interest rate for this slab

                // Here it's directly using the entered interest as a whole number.
                mi = 0;                             // monthly interest (not used correctly)
                sq = Math.pow((1 + s), yrs * 12); // (1 + s) raised to power of total months
                emi = (p * (s)) / (1 - 1 / sq);   // EMI formula (incorrect units)
                sum = sum + emi;                    // Add this EMI to the total repayment sum
            }

            // Store total repayment of this bank in the array
            bank[l++] = sum;
        }

        // Compare which bank has less total repayment
        if (bank[0] < bank[1])
            System.out.println("Bank A"); // Bank A is cheaper
        else
            System.out.println("Bank B"); // Bank B is cheaper
    }
}
//There are two banks – Bank A and Bank B. Their interest rates vary.
// You have received offers from both banks in terms of the annual rate of interest,
// tenure, and variations of the rate of interest over the entire tenure.
// You have to choose the offer which costs you the least interest and reject the other.
// Do the computation and make a wise choice.
//
//The loan repayment happens at a monthly frequency and Equated Monthly Installment (EMI)
// is calculated using the formula given below :
//
//EMI = loan amount * monthly interest rate / ( 1 – 1 / (1 + monthly interest rate)^(number of years * 12))
//
//Constraints:
//
//1 <= P <= 1000000
//1 <=T <= 50
//1<= N1 <= 30
//1<= N2 <= 30
//Input Format:
//
//First line: P principal (Loan Amount)
//Second line: T Total Tenure (in years).
//Third Line: N1 is the number of slabs of interest rates for a given period by Bank A.
// The first slab starts from the first year and the second slab starts from the end of the first slab and so on.
//Next N1 line will contain the interest rate and their period.
//After N1 lines we will receive N2 viz. the number of slabs offered by the second bank.
//Next N2 lines are the number of slabs of interest rates for a given period by Bank B.
// The first slab starts from the first year and the second slab starts from the end of the first slab and so on.
//The period and rate will be delimited by a single white space.
//Output Format: Your decision is either Bank A or Bank B.