package oldjava;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();

        if (a > 21) {
            System.out.println("seggs");
        } else if (a > 18) {
            System.out.println("homework karle");
        }
        System.out.println("qwertyuioplkjhgfdsamnbvcxz".indexOf("q"));

        // decision making structure
        System.out.println("enter x");
        int x = sc.nextInt();
        if (x < 432) {
            System.out.println("yqwerty");
        }
        // relational op
        // <,>,==,+,!=.
        sc.close();
    }

}
