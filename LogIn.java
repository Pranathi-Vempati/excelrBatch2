import java.util.Scanner;
public class LogIn {
    String loginId,pwd,reply;
    void details(){
        Scanner obj = new Scanner(System.in);
        do{
            System.out.println("Welcome to mallareddy university.");
            System.out.println("Have you visited our site earlier?(yes or no).");
            reply=obj.nextLine().trim();
            if(reply.equalsIgnoreCase("no")){
                System.out.println("loginId : ");
                loginId=obj.nextLine();
                System.out.println("Password : ");
                pwd=obj.nextLine();
            }else{
                System.out.println("You are valued customer");
            }
            System.out.println("Would you like to try again(yes or no).");
            reply=obj.nextLine().trim();
        }while(reply.equals("yes"));
    }
    public static void main(String[] args){
        LogIn de = new LogIn();
        de.details();
    }
}
