public class Exp { 
    public static void main(String[] args) {
        String name = "Siddarama";
        System.out.println(greet(name));  // Call greet and print the returned value
    }

    public static String greet(String naam) {  // Change return type to String
        // naam = "Rahul";                        // Modify the name if needed
        return "Hello, " + naam + "!";         // Return the greeting
    }
}
