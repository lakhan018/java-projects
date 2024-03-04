package oldjava;
import java.util.Scanner;

public class helo {
    public static void main(String[] args) {
        System.out.println("HHello vsode");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a out de number main");
        int a = scanner.nextInt();
        System.out.println(a + "  !st scanner work");
        boolean b1 = scanner.hasNextInt();
        System.out.println(b1);
        scanner.close();
    }
}