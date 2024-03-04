package oldjava;

import java.util.Scanner;

public class swtch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        /*
         * if (age > 56) {
         * System.out.println("experinced boi");
         * } else if (age > 45 && age < 56) {
         * System.out.println("semiexpreinced");
         * } else if (age > 36 && age < 45) {
         * System.out.println("sem-semi");
         * } else if (age > 18 && age < 36) {
         * System.out.println("sem-semi-semi");
         * } else {
         * System.out.println("nalla berojgar");
         * }
         * sc.close();
         * System.out.println("SWITCH");
         * //SWITCH CASEEEEEE
         */
        switch (age) {
            case 18:
                System.out.println("18");
                break;

            case 25:
                System.out.println("25");
                break;

            case 65:
                System.out.println("ded");
                break;
            case 70:
                System.out.println("khtm nhi hua ab tak");
                break;
            default:
                System.out.println("mar ja ");
                break;

        }
        sc.close();
    }
}
