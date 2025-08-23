package Easy;

public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args) {
        int [][] accounts={
                {1, 2, 3},
                {3, 5, 1}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int RichestWealth=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=0; j<accounts[i].length; j++){
                sum +=accounts[i][j];
            }

            if(sum>=RichestWealth){
                RichestWealth=sum;
            }
        }
        return RichestWealth;
    }
}
