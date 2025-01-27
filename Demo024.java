import java.util.Scanner;
public class Demo024 {
    public static void main(String[] args) {
        int numOfFri = 3; 
        String[] names = new String[numOfFri];
        String[] phoneNumbers = new String[numOfFri];
        String[] addresses = new String[numOfFri];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numOfFri; i++) {
            System.out.println("Enter information for friend " + (i + 1) + ":");
            System.out.print("Enter name: ");
            names[i] = scanner.nextLine();
            System.out.print("Enter phone number: ");
            phoneNumbers[i] = scanner.nextLine();
            System.out.print("Enter address: ");
            addresses[i] = scanner.nextLine();           
            System.out.println(); 
        }
    }
}
