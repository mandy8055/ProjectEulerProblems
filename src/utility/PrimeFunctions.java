package utility;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFunctions {
    private PrimeFunctions() {
    }

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
    public static ArrayList<Integer> primeFactorization(int num) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                while (num % i == 0) {
                    num /= i;
                    primeFactors.add(i);
                }
            }
        }
        if (num != 1) primeFactors.add(num);
        return primeFactors;
    }
}
