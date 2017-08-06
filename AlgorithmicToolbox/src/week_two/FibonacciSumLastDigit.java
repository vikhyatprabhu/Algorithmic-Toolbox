package week_two;
import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;
        int [] fib= new int[61];
        fib[0] = 0;
        fib[1]= 1;
       

        for (int i = 2; i <= 60 && (i<=n+2) ; i++) {
        	fib[i]=(fib[i-1]+fib[i-2])%10;
        }
        long lindex=(n+2)%60;
         int index= (int) (lindex);
         if(fib[index]==0){
        	 return 9;
         }
        return fib[index]-1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = getFibonacciSumNaive(n);
        System.out.println(s);
    }
}

