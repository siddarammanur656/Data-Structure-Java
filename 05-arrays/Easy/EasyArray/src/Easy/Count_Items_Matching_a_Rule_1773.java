package Easy;

import java.util.List;

public class Count_Items_Matching_a_Rule_1773 {
    public static void main(String[] args) {
        String ruleKey="type";
        String ruleValue="phone";
        List<List<String>> items= List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int indexKey;
        if(ruleKey.equals("type")){
            indexKey=0;
        }else if(ruleKey.equals("color")){
            indexKey=1;
        }else{
            indexKey=2;
        }

        int count=0;
        for(int i=0; i<items.size(); i++){
            if(items.get(i).get(indexKey).equals(ruleValue)){
                count +=1;
            }
        }
        return count;
    }
}
