/**
 * Operators
 * @author hadjitejuco
 */
import java.util.Scanner;
public class Sample4 {
    public static void main(String[] args) {
        //Arithmetic Operator
        //+,-,*,/,%
        Scanner scanner = new Scanner(System.in);
//        int l = 5;
//        int w = 10;
        System.out.print("Enter Length: ");
        int l = scanner.nextInt();
        System.out.print("Enter Width: ");
        int w = scanner.nextInt();
        int area = l * w;
        System.out.println("Area is "+area);
        scanner.close();
    }
}
