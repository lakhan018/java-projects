package oldjava;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter english marks out of 100");
        float english = sc.nextInt();
        System.out.println("Enter physics marks out of 100");
        float physics = sc.nextInt();
        System.out.println("Enter maths marks out of 100");
        float Maths = sc.nextInt();
        System.out.println("Enter  cs marks out of 100");
        float cs = sc.nextInt();
        System.out.println("Enter chem marks out of 100");
        float chem = sc.nextInt();
        float x = (english + Maths + physics + chem + cs) / 5;
        System.out.println("total percentage for you  id " + x + "%");
        sc.close();

    }
}
