package oldjava;
import java.util.Scanner;

public class prac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello lakhan");
        String x = sc.nextLine();
        System.out.println("which is your fav color");
        String color = sc.nextLine();
        System.out.println("now i will guess");
        System.out.println("tell lakhan whats her fav color");
        String colorl = sc.nextLine();
        System.out.println(color.equalsIgnoreCase(colorl));
        System.out.println(x);
        sc.close();

    }
}