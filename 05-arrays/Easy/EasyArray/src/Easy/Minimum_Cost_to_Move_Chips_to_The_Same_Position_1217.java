package Easy;

public class Minimum_Cost_to_Move_Chips_to_The_Same_Position_1217 {
    public static void main(String[] args) {
        int [] position={2,2,2,3,3};
        System.out.println(minCostToMoveChips(position));
    }
    public static int minCostToMoveChips(int[] position) {
        int n=position.length;

        int Even=0;
        int Odd=0;

        for(int i=0; i<n; i++){
            if(position[i]%2==0){
                Even++;
            }else{
                Odd++;
            }
        }
        if(Even==n || Odd==n){
            return 0;
        }

        return Math.min(Even,Odd);
    }
}
