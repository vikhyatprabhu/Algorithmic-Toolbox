package week_three;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int sum= m;
        int change[]=new int[]{10,5,1};
        int i=0;
        int count=0;
        while(sum>0){
        	int prod=sum/change[i];
        	if(prod>0){
        		sum=sum-prod*change[i];
        		
        		count+=prod;
        	}
        	i++;
        	
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

