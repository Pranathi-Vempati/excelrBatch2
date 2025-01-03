import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a UserName: ");
        String user = obj.nextLine();
        System.out.println("Enter a Password: ");
        String password = obj.nextLine();
        while(user.equals("user001") && password.equals("user_001")){
            System.out.print("Happy New Year!");
            break;
        }

    }
}
