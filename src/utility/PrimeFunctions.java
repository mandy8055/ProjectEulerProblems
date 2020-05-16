package utility;
import java.util.Arrays;

public class PrimeFunctions {
    private PrimeFunctions(){}
//  Eratosthenes Sieve --> Complexity O(N * log(log N))
    public static boolean[] sieve(int n){
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for(int i = 2; i * i < n; i++){
            if(primes[i]){
                for(int p = 2 * i; p <= n; p += i){
                    primes[p] = false;
                }
            }
        }
        return primes;
    }
//  Primality testing
    public static boolean isPrime(int n){
        if(n <= 1)return false;
        if(n == 2)return true;
        if(n % 2 == 0)return false;
        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0)return false;
        }
        return true;
    }
//  Prime Factorization of the given number

}
