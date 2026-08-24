import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        System.out.println(numbers);
        System.out.println("\nSize of the HashSet: " + numbers.size());
        System.out.println("set contains " + numbers.contains(10));
        numbers.remove(10);
        System.out.println("set after removal of 10 " + numbers);
        numbers.clear();
        System.out.println("set after clearing " + numbers);
    }
}
