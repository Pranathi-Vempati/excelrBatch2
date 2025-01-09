import java.util.Scanner;
public class Demo18 {
    Scanner obj = new Scanner(System.in);
    double min;
    public Demo18(){
    System.out.println("minutes: ");
    min = obj.nextDouble();
    }
    void month(){
        double months = (min / (60 * 24 * 30));
        System.out.println("minutes to Months :"+ months);
    }
    void years(){
        double years=(min / (60* 24 * 365.25));
        System.out.println("minutes to years: "+ years);
    }
    public static void main(String[] args) {
        Demo18 dem = new Demo18();
        dem.month();
        dem.years();
    } 
}
