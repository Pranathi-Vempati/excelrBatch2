import java.util.LinkedHashSet;
import java.util.Iterator;
public class Demo033 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        Iterator<Integer> iterator = set.iterator();
        System.out.println("LinkedHashSet contents (Homo Integers): ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
