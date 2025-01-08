import java.util.*;
public class PS2001 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = obj.nextInt();
        int mu = ((num / 100) + 1)* 100;
        System.out.println(mu);
    }
}
