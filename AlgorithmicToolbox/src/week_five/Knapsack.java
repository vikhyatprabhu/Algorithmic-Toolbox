package week_five;


import java.util.*;

public class Knapsack {
	static int optimalWeight(int W, int[] w) {
		// write you code here
		int value[][] = new int[W+1][w.length+1];
		for (int i = 1; i <= w.length; i++) {
			for(int w_i=1;w_i<=W;w_i++){
				value[w_i][i]=value[w_i][i-1];
				if(w[i-1]<=w_i){
					int value_=value[w_i-w[i-1]][i-1]+w[i-1];
					if(value[w_i][i]<value_){
						value[w_i][i]=value_;
					}
				}
			}
		}
		return value[W][w.length];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int W, n;
		W = scanner.nextInt();
		n = scanner.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = scanner.nextInt();
		}
		System.out.println(optimalWeight(W, w));
	}
}
