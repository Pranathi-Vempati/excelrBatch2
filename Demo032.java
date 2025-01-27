import java.util.HashSet;

public class Demo032 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Bird");
        set.add("Fish");
        System.out.println("HashSet contents (Homogeneous Strings): ");
        for (String animal : set) {
            System.out.println(animal);
        }
    }
}
