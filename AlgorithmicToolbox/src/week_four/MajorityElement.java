package week_four;
import java.util.*;
import java.io.*;

public class MajorityElement {
    private static int getMajorityElement(int[] a, int left, int right) {
        if (left == right) {
            return -1;
        }
        if (left + 1 == right) {
            return a[left];
        }
        int mid=(right-left)/2;
        int leftCandidate= getMajorityElement(a,left,left+mid+((right-left)%2==0?0:1));
        int rightCandidate= getMajorityElement(a,left+mid+1,right);
        if(isMajorityElement(a,left,right,leftCandidate)){
        	return leftCandidate;
        } else if(isMajorityElement(a, left, right, rightCandidate)){
        	return rightCandidate;
        }
        
        return -1;
    }
    
    private static boolean isMajorityElement(int []a, int left,int right, int candidate){
    	int count=0,i=left;
    	while(i!=right){
    		if(a[i]==candidate){
    			count++;
    		}
    		i++;
    	}
    	int half= (right-left)/2;
    	if(count>half){
    		return true;
    	
    	}
    	return false;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (getMajorityElement(a, 0, a.length) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

