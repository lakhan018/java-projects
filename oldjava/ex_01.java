package oldjava;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nter num to be verified");
        int a = scanner.nextInt();
        System.out.println("enter 2nd number");
        int b = scanner.nextInt();
        boolean o = (a > b);
        System.out.println(o);
        scanner.close();
    }
}
