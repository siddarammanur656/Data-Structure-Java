package Strings;

public class Defanging_an_IP_Address1108 {
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) {
      StringBuilder Builder=new StringBuilder();
      char [] strchar=address.toCharArray();
        for (int i = 0; i < strchar.length; i++) {
            if(strchar[i]=='.'){
                Builder.append("[.]");
            }else{
                Builder.append(strchar[i]);
            }
        }
        return Builder.toString();
    }
}