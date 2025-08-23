package Easy;

import java.util.ArrayList;

public class Kids_With_the_Greatest_Number_of_Candies_1431 {
    public static void main(String[] args) {

        int [] candies={2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));

    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int n=candies.length;

        int max=0;
        for(int i=0; i<n; i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int j=0; j<n; j++){
            candies[j]=candies[j]+extraCandies;
            if(candies[j]>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
