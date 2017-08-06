package week_three;
import java.util.*;

public class DotProduct {
    private static long maxDotProduct(int[] a, long[] b) {
        //write your code here
        long result = 0;
        Arrays.sort(a);
     // reverse the array
     for(int i=0;i<a.length/2;i++) {
          // swap the elements
          int temp = a[i];
          a[i] = a[a.length-(i+1)];
          a[a.length-(i+1)] = temp;
     }
     Arrays.sort(b);
     for(int i=0;i<b.length/2;i++) {
         // swap the elements
         long temp = b[i];
         b[i] = b[b.length-(i+1)];
         b[b.length-(i+1)] = temp;
    }
        
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextLong();
        }
        System.out.println(maxDotProduct(a, b));
    }
}

