import java.util.Scanner;
public class Demo6 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a UserName: ");
        String user = obj.nextLine();
        System.out.println("Enter a Password: ");
        String password = obj.nextLine();
        while(user.equals("Pranathi") && password.equals("Pranathi@123")){
            System.out.print("Welcome "+user);
            break;
        }

    }
}