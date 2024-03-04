package oldjava;
import java.util.Scanner;

public class ex_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tell your income yearly ");
        int tax = sc.nextInt();
        if (tax < 500000) {
            System.out.println("tax equals 0% " + "pay " + tax * (0 / 100));
        } else if (tax >= 500000 && tax < 750000) {

            System.out.println("tax equals 5% " + "pay " + (tax * (5 / 100)));
        } else if (tax >= 750000 && tax < 1000000) {
            System.out.println("tax equals 10% " + "pay " + tax * (10 / 100));
        } else {
            System.out.println("amir or enter valid value");
        }
        
        sc.close();
    }
}
