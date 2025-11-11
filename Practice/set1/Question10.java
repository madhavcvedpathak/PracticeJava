package Practice.set1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question10 {
    public static boolean isPrime(long num){
        if(num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (long i = 3; i * i <= num; i += 2){
            if (num % i == 0) return false;
        }
        return true;
    }

    public static List<Long> generatePrimes(long limit) {
        List<Long> primes = new ArrayList<>();
        for (long i = 2; i <= limit; i++){
            if (isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }

    public static int countPrimeSum(long N) {
        List<Long> primes = generatePrimes(N); // to generate primes
        int count = 0;
        long sum = 0;
        for (int i = 0; i < primes.size(); i++){
            sum += primes.get(i);
            if (sum > N ) break;
            if(sum != 2 && isPrime(sum)){ //it should prime
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int result = countPrimeSum(N); //count primes
        System.out.println(result);
    }
}
//🧠 What it’s doing:
//
//Get all primes ≤ N.
//
//Start adding them one by one:
//
//sum = 2
//
//sum = 2 + 3 = 5
//
//sum = 2 + 3 + 5 = 10
//
//sum = 2 + 3 + 5 + 7 = 17
//
//and so on...
//
//Each time:
//
//If sum is prime and ≤ N, it increases count.
//
//If sum exceeds N, stop.
//
//Return total count.
//
//Example (N = 20)
//
//primes = [2,3,5,7,11,13,17,19]
//
//sum sequence: 2, 5, 10, 17, 28 …
//
//Among them, 5 and 17 are prime and ≤ 20
//✅ count = 2
//Some prime numbers can be expressed as a sum of other consecutive prime numbers.
// For example 5 = 2 + 3, 17 = 2 + 3 + 5 + 7, 41 = 2 + 3 + 5 + 7 + 11 + 13.
// Your task is to find out how many prime numbers which satisfy this property are present in the
// range 3 to N subject to a constraint that summation should always start with number 2.
//
//Write code to find out the number of prime numbers that satisfy the
// above-mentioned property in a given range.