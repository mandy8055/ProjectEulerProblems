package utility;

public class Fibonacci {
//  Static class. No instance of this class can be created
    private Fibonacci(){}
//  Recursive Fibonacci Method
    public static long fibonacciRecursive(long num){
        if(num == 0)return 0;
        if(num == 1)return 1;
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }
//  Iterative Fibonacci Method. (Here every third term is the even fibonacci term)
    public static long fibonacciIterative(long limit){
        long sum = 0;
        long previousToPrevious = 1;
        long previous = 1;
        long current = previousToPrevious + previous;
        while(current < limit){
            sum += current;
            previousToPrevious = previous + current;
            previous = current + previousToPrevious;
            current = previousToPrevious + previous;
        }
        return sum;
    }
}
