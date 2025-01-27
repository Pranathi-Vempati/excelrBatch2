import java.util.ArrayList;

public class Demo030 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        System.out.println("ArrayList contents: ");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
