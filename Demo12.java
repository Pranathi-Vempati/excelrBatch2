import java.util.Scanner;
public class Demo12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("height: ");
        float height = obj.nextFloat();
        System.out.println("Base: ");
        float base = obj.nextFloat();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: "+area);
    } 
}
