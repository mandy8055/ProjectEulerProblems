package easy;
// Static Import (Point to note)
import static utility.Utility.sumDivisible;
// Multiples of 3 and 5 less than 1000
public class Problem1 {
    public static void main(String[] args){
//      System.out.println(sumOfMultiplesOfThreeAndFive(999));
        System.out.println(sumDivisible(3, 999) + sumDivisible(5, 999)
                - sumDivisible(15, 999));
    }
}
