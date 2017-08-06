package week_two;
import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
   
    return ((long) a * b)/ gcd(a,b);
  }

  private static int gcd(int a, int b) {
	   
	    if(a%b==0){
	    	return b;
	    } else{
	    	return gcd(b,a%b);
	    }}   
  
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
