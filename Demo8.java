import java.util.Scanner;
public class Demo8 {
    int age;
    String name,rollno;
    void detailsOfStudent(){
        Scanner obj = new Scanner(System.in);
        name=obj.nextLine();
        age=obj.nextInt();
        obj.nextLine();
        rollno=obj.nextLine();
    }
    void displayDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("rollno: "+rollno);
    }
    public static void main(String[] args){
        Demo8 dem = new Demo8();
        dem.detailsOfStudent();
        dem.displayDetails();
    }
    
}
