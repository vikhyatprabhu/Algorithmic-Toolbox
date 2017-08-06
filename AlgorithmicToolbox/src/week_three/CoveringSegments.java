package week_three;
import java.util.*;

public class CoveringSegments {

    private static Object[] optimalPoints(Segment[] segments) {
        List<Segment> segList= Arrays.asList(segments);
        Collections.sort(segList,new Comparator<Segment>(){

			@Override
			public int compare(Segment o1, Segment o2) {
				if(o1.end>o2.end){
					return 1;
				} if(o1.end<o2.end){
					return -1;
				}
				return 0;
			}
        	
        });
        int i=0;
        List<Integer> optPoints= new ArrayList<>();
        while(i<segList.size()){
        	optPoints.add(segList.get(i).end);
        	int j=i;
        	while(i<segList.size()-1 && segList.get(j).end>=segList.get(i+1).start){
        		i++;
        		if(i==segList.size()-1){
        			break;
        		}
        	}
        	i++;
        	
        	
        }
        
        return optPoints.toArray();
    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        Object[] points = optimalPoints(segments);
        System.out.println(points.length);
        for (Object point : points) {
            System.out.print((Integer)point + " ");
        }
    }
}
 
