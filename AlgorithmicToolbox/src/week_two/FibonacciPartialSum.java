package week_two;
import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        if (to <= 1)
            return to;
        int [] fib= new int[61];
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; (i<=60 )&& (i <=to+2); ++i) {
        	fib[i]=(fib[i-1]+fib[i-2])%10;
        }

        int lindex=(int) ((to+2)%60);
        int toSum= fib[lindex]-1;
        
       
        int rindex=(int) ((from+1)%60);
        int fromSum= fib[rindex]-1;
        
        if(toSum<fromSum){
        	toSum=toSum+10;
        }
        

        return (toSum-fromSum)%10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}

