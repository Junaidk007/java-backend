import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("one", 1);
        

        for(Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Map.Entry is used to store individual key-value pair
        // entrySet() return a set of key-value pairs 
    }
}
