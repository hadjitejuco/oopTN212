/**
 * https://github.com/hadjitejuco/oopTN212
 * https://github.com/hadjitejuco/oopTN212.git
 * Demonstrate the use variables in Java
 * @author hadjitejuco
 */
public class Sample1 {
    public static void main(String[] args) {
        //primitive data types
        //print
        //println
        //printf // ansi print format
        int age = 25;                   //format %d
        double salary = 45000.80;       //%f
        char initial ='H';              //%c
        boolean isEmployed = true;      //%b
        System.out.print("Using Print Option: ");
        System.out.print("Age: "+age+", ");
        System.out.print("Salary: "+salary+"\n");
        
        System.out.println("Using Println Option:");
        System.out.println("Initials: "+initial);
        System.out.println("Employed: "+isEmployed);
        
        System.out.printf("Using printf: Age: %d, Salary: %.2f, Initial: %c, Emp %b",age,salary,initial,isEmployed);
        System.out.println();
    }
}
