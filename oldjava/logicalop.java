package oldjava;
public class logicalop {
    public static void main(String[] args) {
        /*
         * && = and
         * ! = not
         * || = or
         */
        boolean a = true;
        boolean b = false;
        if (a == true && b == true) {
            System.out.println("both are true \n if");
        } else if (a == true || b == true) {
            System.out.println("anyone is true \n else if ");
        } else if (a == true && b != true) {
            System.out.println("b wrong statement \n else if ");
        } else {
            System.out.println("system hang hogya!! \n else");
        }

    }
}
