package Practice.SetEasy;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("No. of Vehicles: ");
        int n = s.nextInt(); // Num of vehicle
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Vehicle no.:");
            arr[i] = s.nextInt(); // add vehicles no
        }

        System.out.print("Enter date: ");
        int date = s.nextInt(); // date value
        System.out.print("Enter Fine: ");
        int fine = s.nextInt(); // fine amt

        int countEven = 0, countOdd = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0)
                countEven++;
            else
                countOdd++;
        }

        if (date % 2 != 0){ // If date is odd.
            if(countEven==0)
                System.out.println("0");
            else // Only odd are allowed, if even came multiply fine.
                System.out.println(countEven * fine);
        }
        else {    // If date is Even.
            if (countOdd == 0)
                System.out.println("0");
            else // Only Even are allowed, if odd came multiply fine.
                System.out.println(countOdd * fine);
        }
    }
}
// Particulate matters are the biggest contributors to Delhi pollution.
// The main reason behind the increase in the concentration of PMs include
// vehicle emission by applying Odd Even concept for all types of vehicles.
// The vehicles with the odd last digit in the registration number will be
// allowed on roads on odd dates and those with even last digit will on even dates.
//
//Given an integer array a[], contains the last digit of the registration number
// of N vehicles traveling on date D(a positive integer). The task is to calculate
// the total fine collected by the traffic police department from the vehicles
// violating the rules.
//
//Note : For violating the rule, vehicles would be fined as X Rs.