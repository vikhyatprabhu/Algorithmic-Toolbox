package week_three;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        List<Item>valueByWeight=new ArrayList<>(values.length);
        for(int i=0;i<values.length;i++){
        	valueByWeight.add(new Item(values[i],weights[i]));
        }
        Collections.sort(valueByWeight,new Comparator<Item>(){

			@Override
			public int compare(Item o1, Item o2) {
				if(((double)o1.value/o1.weight)<=(((double)o2.value/o2.weight))){
					return -1;
				} else if(((double)o1.value/o1.weight)>=(((double)o2.value/o2.weight))){
					return 1;
				}
				return 0;
			}
        	
        });
        
        while(capacity>0 && !valueByWeight.isEmpty()){
          Item curr= valueByWeight.remove(valueByWeight.size()-1);
          int chosen= 0;
          if(capacity>=curr.weight){
        	  capacity= capacity-curr.weight;
        	  chosen= curr.weight;
        	  
          } else{
        	  chosen=capacity;
        	  capacity=0;
          }
          value+=chosen* (((double)curr.value/curr.weight));
        	
        }

        return value;
    }
    private static class Item{
    	int weight;
        int value;
        Item(int value,int weight){
        	this.value=value;
        	this.weight=weight;
        	
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
