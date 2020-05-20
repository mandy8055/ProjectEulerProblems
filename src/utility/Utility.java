package utility;

import java.util.ArrayList;

public class Utility {
    private Utility() {
    }

    // ------------------------------PROBLEM 1 UTILITY METHODS------------------------------------------
    //  Naive solution O(N)
    public static long sumOfMultiplesOfThreeAndFive(int num) {
        long sum = 0;
        for (int i = 3; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }

    //  Efficient solution O(1)
    public static long sumDivisible(int num, int target) {
        long p = 999 / num;
        return num * (p * (p + 1)) / 2;

    }
//   ------------------------------END OF PROBLEM 1 METHODS------------------------------------------

// ------------------------------PROBLEM 2 UTILITY METHODS------------------------------------------

    //  Recursive Fibonacci Method
    public static long fibonacciRecursive(long num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }

    //  Iterative Fibonacci Method. (Here every third term is the even fibonacci term)
    public static long fibonacciIterative(long limit) {
        long sum = 0;
        long previousToPrevious = 1;
        long previous = 1;
        long current = previousToPrevious + previous;
        while (current < limit) {
            sum += current;
            previousToPrevious = previous + current;
            previous = current + previousToPrevious;
            current = previousToPrevious + previous;
        }
        return sum;
    }
//   ------------------------------END OF PROBLEM 2 METHODS------------------------------------------

// ------------------------------PROBLEM 3 UTILITY METHODS------------------------------------------

    //  Eratosthenes Sieve --> Complexity O(N * log(log N)) --> Most Efficient implementation
    public static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        primes[0] = primes[1] = false;
        primes[2] = true;
//      Mark only odd numbers as true
        for (int i = 3; i <= n; i += 2)
            primes[i] = true;

        for (int i = 3; i <= n; i += 2) {
            if (primes[i]) {
                for (int p = i * i; p <= n; p += i) {
                    primes[p] = false;
                }
            }
        }
        return primes;
    }

    //  Primality testing
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    //  Prime Factorization of the given number Time complexity --> O(sqrt(n))
    public static ArrayList<Long> primeFactorization(long num) {
        ArrayList<Long> primeFactors = new ArrayList<>();
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                while (num % i == 0) {
                    num /= i;
                    primeFactors.add((long) i);
                }
            }
        }
        if (num != 1) primeFactors.add(num);
        return primeFactors;
    }
//   ------------------------------END OF PROBLEM 3 METHODS------------------------------------------

// ------------------------------PROBLEM 4 UTILITY METHODS------------------------------------------

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0, rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }
        return (rev == num);
    }
}