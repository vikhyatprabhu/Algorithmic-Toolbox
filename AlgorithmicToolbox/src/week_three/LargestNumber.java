package week_three;
import java.util.*;

public class LargestNumber {
    private static String largestNumber(String[] a) {
    	List<String> num= new ArrayList(Arrays.asList(a));
    	
    	String result="";
    	while(!num.isEmpty()){
    		String maxDigit="";
    		for (String digit : num){
    			if (isGreaterorEqual(digit,maxDigit)){
    				maxDigit=digit;
    			}
    		}
    		
    		
    		num.remove(maxDigit);
    		result=result+maxDigit;
    		
    		
    	}
    	return result;
        
    }

    private static boolean isGreaterorEqual(String digit, String maxDigit) {
		return Integer.valueOf(digit+maxDigit)>=Integer.valueOf(maxDigit+digit);
		
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}

