package easy;
import utility.Utility;
import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args){
        ArrayList<Long> arr = Utility.primeFactorization(600851475143L);
        System.out.println(arr.get(arr.size() - 1));
    }
}
