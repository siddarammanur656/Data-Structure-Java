package Hard;

import java.util.PriorityQueue;

public class Max_Value_of_Equation_1499 {
    public static void main(String[] args) {
        int [][] points= {{1, 3}, {2, 0}, {5, 10}, {6, -10}};
        int k=1;
        System.out.println(findMaxValueOfEquation(points,k));
    }
    public static int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)-> b[0]-a[0]);
        int maxValue = Integer.MIN_VALUE;
        for(int[] point : points){
            int xj = point[0];
            int yj = point[1];
            while(!maxHeap.isEmpty() && xj - maxHeap.peek()[1] > k){
                maxHeap.poll();
            }
            if(!maxHeap.isEmpty()){
                maxValue = Math.max(maxValue, yj+xj+maxHeap.peek()[0]);
            }
           
            maxHeap.offer(new int[] {yj-xj, xj});
        }
        return maxValue;
    }
    
    //brute force approch good for small arrays and it will not work big array it will generate time limit exceeded;
    public static int findMaxValueOfEquation2(int[][] points, int k) {
        int max=Integer.MIN_VALUE;

        for(int i=0; i<points.length; i++){
            int xi=points[i][0];
            int  yi=points[i][1];

            for(int j=i+1; j<points.length; j++){
                int xj=points[j][0];
                int yj=points[j][1];

                if(Math.abs(xi-xj)<=k){
                    int value=yi+yj+Math.abs(xi-xj);
                    max=Math.max(max,value);
                }
            }
        }
        return max;
    }
}
