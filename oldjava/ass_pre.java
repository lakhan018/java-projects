package oldjava;
public class ass_pre {
    public static void main(String[] args) {
        // Associavity and precedence
        int a = 6 *5 - 34 / 2; // precedence
        /*
         * BODMAS
         * 30-17
         * 13
         */
        System.out.println(a);

        int b = 60 / 5 - 34 * 2;
        // assciativity
        /*
         * BODMAS
         * 12-68
         * -56.
         */
        System.out.println(b);

    }

}
// https://www.javatpoint.com/associativity-of-operators-in-java
// = works right to left