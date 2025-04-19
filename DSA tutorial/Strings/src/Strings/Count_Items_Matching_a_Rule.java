package Strings;

import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
        items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
        items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index=0;
        if (ruleKey.equals("color")) {
            index=1;
        } else if (ruleKey.equals("name")) {
            index=2;
        }
        int count=0;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).get(index).equals(ruleValue)){
                count +=1;
            }
        }
        return count;
    }
    
}