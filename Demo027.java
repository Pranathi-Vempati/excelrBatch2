import java.util.Scanner;
public class Demo027 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = obj.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
