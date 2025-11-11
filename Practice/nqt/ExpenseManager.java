package Practice.nqt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExpenseManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Expense Manager =====");

        // Step 1: Get total income
        System.out.print("Enter your total income: ₹");
        double income = sc.nextDouble();

        // Step 2: Get number of expense categories
        System.out.print("How many expense categories do you want to add? ");
        int n = sc.nextInt();

        // Using LinkedHashMap to preserve insertion order
        Map<String, Double> expenses = new LinkedHashMap<>();

        // Step 3: Enter expense category and amount
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter category name: ");
            String category = sc.next();

            System.out.print("Enter amount for " + category + ": ₹");
            double amount = sc.nextDouble();

            expenses.put(category, amount);
        }

        // Step 4: Calculate total expenses
        double totalExpenses = 0;
        for (double amt : expenses.values()) {
            totalExpenses += amt;
        }

        // Step 5: Calculate total savings
        double savings = income - totalExpenses;

        // Step 6: Display full report
        System.out.println("\n===== Expense Summary =====");
        System.out.printf("Total Income: ₹%.2f%n", income);
        System.out.printf("Total Expenses: ₹%.2f%n", totalExpenses);
        System.out.printf("Total Savings: ₹%.2f%n", savings);

        System.out.println("\n----- Expense Breakdown -----");
        for (Map.Entry<String, Double> entry : expenses.entrySet()) {
            System.out.printf("%-15s : ₹%.2f%n", entry.getKey(), entry.getValue());
        }

        // Step 7: Advice section
        System.out.println("\n===== Financial Advice =====");
        if (savings < 0)
            System.out.println("⚠️ You are overspending! Try cutting down expenses.");
        else if (savings < income * 0.2)
            System.out.println("💡 Warning: Your savings are below 20% of income. Try saving more!");
        else
            System.out.println("✅ Great job! You’re managing your money wisely.");
    }
}
