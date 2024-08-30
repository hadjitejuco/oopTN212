
/**
 * Java User Input (scanner)
 * @author hadjitejuco
 */
//Java utility package
import java.util.Scanner;

public class Sample3 {
    public static void main(String[] args) {
        //String, integer, double
        //create a scanner object
        Scanner input = new Scanner(System.in);
        //Input a string type
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter a Decimal number: ");
        double num = input.nextDouble();
        System.out.println();
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Number is "+num);
        
        //close scanner class
        input.close();
       
    }
}
