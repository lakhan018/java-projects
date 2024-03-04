package oldjava;
import java.util.Scanner;

public class pr_stwh {
    public static void main(String[] args) {
        // pr01
        /*
         * int a = 10;
         * if (a == 10) {
         * System.out.println("error1");
         * } else{
         * System.out.println("error2");}
         */
        // pr_2

        Scanner sc = new Scanner(System.in);
        System.out.println("eng");
        float m = sc.nextFloat();
        System.out.println("cs");
        float a = sc.nextFloat();
        System.out.println("chem");
        float b = sc.nextFloat();

        if (a > 33) {
            System.out.println("pass " + " " + a);

        } else {
            System.out.println("fail");
        }
        if (m > 33) {
            System.out.println("pass %f8.2 " + m);

        } else {
            System.out.println("fail");
        }
        if (b > 33) {
            System.out.println("pass %f8.2 " + b);
        } else {
            System.out.println("fail");
        }
        float xyz = a + m + b;
        if (xyz > 120) {
            System.out.println("pass  " + (xyz * .3));
        } else {
            System.out.println("total fail  \nyou need to score more than 40%");
        }
        sc.close();
    }
}