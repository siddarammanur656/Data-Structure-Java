package Hard;

import java.util.PriorityQueue;

public class Max_Value_of_Equation_1499 {
    public static void main(String[] args) {
        int [][] points= {{1, 3}, {2, 0}, {5, 10}, {6, -10}};
        int k=1;
        System.out.println(findMaxValueOfEquation(points,k));
    }
    //brute force approch good for small arrays and it will not work big array it will generate time limit exceeded;
    public static int findMaxValueOfEquation(int[][] points, int k) {
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
    public static int findMaxValueOfEquation1(int[][] points, int k) {
        int maxValue = Integer.MIN_VALUE;

        // PriorityQueue as a max-heap: stores [y - x, x]
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[0], a[0])
        );

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            // Remove points that are too far from current x
            while (!maxHeap.isEmpty() && x - maxHeap.peek()[1] > k) {
                maxHeap.poll();
            }

            // If a valid candidate exists, update the max value
            if (!maxHeap.isEmpty()) {
                int candidate = maxHeap.peek()[0]; // y_i - x_i
                maxValue = Math.max(maxValue, x + y + candidate);
            }

            // Add current point to the heap
            maxHeap.offer(new int[]{y - x, x});
        }
        return maxValue;
    }
}
