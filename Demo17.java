import java.util.Scanner;
public class Demo17 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter digits Number: ");
        int num = obj.nextInt();
        int tens = num / 10;
        int ones = num % 10;
        int sum = tens + ones;
        System.out.printf("Sum Of %d and %d is : %d",tens,ones,sum);

    }
    
}
