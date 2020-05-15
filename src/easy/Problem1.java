package easy;
// Multiples of 3 and 5 less than 1000
public class Problem1 {
    public static void main(String[] args){
//      System.out.println(sumOfMultiplesOfThreeAndFive(999));
        System.out.println(sumDivisible(3, 999) + sumDivisible(5, 999)
                - sumDivisible(15, 999));
    }
//  Naive solution O(N)
    private static long sumOfMultiplesOfThreeAndFive(int num){
        long sum = 0;
        for(int i = 3; i <= num; i++){
            if(i % 3 == 0 || i % 5 == 0)sum += i;
        }
        return sum;
    }
//  Efficient solution O(1)
    private static long sumDivisible(int num, int target){
        long p = 999 / num;
        return num * (p * (p + 1)) / 2;

    }
}
