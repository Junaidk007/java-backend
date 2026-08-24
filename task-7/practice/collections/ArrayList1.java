import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Junaid");
        names.add("Sania");
        names.add("Junaid");
        System.out.println(names);
        System.out.println("\nSize of the ArrayList: " + names.size());
        System.out.println("list contains" + names.contains("Junaid"));
        names.set(2, "Anubhav");
        
    }
}