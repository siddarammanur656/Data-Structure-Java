package Easy;

import java.util.Arrays;

public class Find_the_Highest_Altitude_1732 {
    public static void main(String[] args) {
        int [] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int currentAlt=0;
        int maxAlt=0;

        for(int i=0; i<gain.length; i++){
            currentAlt +=gain[i];
            maxAlt =Math.max(maxAlt,currentAlt);
        }
        return maxAlt;
    }
}
