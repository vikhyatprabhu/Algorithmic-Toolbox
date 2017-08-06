package week_two;
import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;
        long []fib= new long[(int)m*6];
         fib[0] = 0;
         fib[1]  = 1;
        int i=2;
        for (i=2; i < m*6 ; i++) {
            fib[i]=(fib[i-1]+fib[i-2])%m;
            if(i!=2 && (fib[i-1]==1 && fib[i-2]==0)){
            	break;
            }
        }
        int mod= i-2;
        int index=(int) (n%mod);
        return fib[index] ;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHugeNaive(n, m));
    }
}

