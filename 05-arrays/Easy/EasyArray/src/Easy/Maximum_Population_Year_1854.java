package Easy;

public class Maximum_Population_Year_1854 {
    public static void main(String[] args) {
        int [][] logs= {
                {2000, 2010},
                {2005, 2015},
                {2010, 2020}
        };
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int [] arr= new int[101];
        int max=0;

        for(int [] q:logs){
            int birth=q[0];
            int death=q[1];

            for(int i=birth;i<death; i++){
                arr[i-1950]++;
                max=Math.max(max,arr[i-1950]);
            }
        }

        int year=1950;
        for(int i=year; i<=2050; i++){
            if(arr[i-1950]==max){
                year=i;
                break;
            }
        }
        return year;
    }
}
