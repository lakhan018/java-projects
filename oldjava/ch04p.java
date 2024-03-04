package oldjava;
import java.util.Scanner;

public class ch04p {
    public static void main(String[] args) {
        /*
         * int a=34;YOU CANNOT PUT ASSIGNEMENT IN IF CONDITION
         * if (a!=1);
         * {System.out.println("yes");}
         */
        // question two
        /* */ System.out.println("hey lak");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("marks 1 ");
        int b = sc.nextInt();
        System.out.println("marks 1 ");
        int c = sc.nextInt();
        System.out.println("marks 1 ");
        if (a > 33 && b > 33 && c > 33) {
            System.out.println("having more than 33 marks in all");
        } else {
            System.out.println("fail in sub");
        }
        int x = (a + b + c) / 3;
        if (x > 44) {
            System.out.println("overall passed " + x);
        }
        sc.close();
    }
}
