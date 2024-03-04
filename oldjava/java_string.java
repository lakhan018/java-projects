package oldjava;

public class java_string {
    public static void main(String[] args)

    {
        String a = "lakhan";
        // String a1 = new String("Lakhan");
        // System.out.println(a1);

        /*
         * int value = a.length();// (wrtie assignment name)
         * System.out.println(value);
         * 
         * String x = a.toLowerCase();
         * System.out.println(x);
         * 
         * String y = a.toUpperCase();
         * System.out.println(y);
         */
        String po = ("          hello           ");
        String nts = po.trim();
        System.out.println(nts);

        System.out.println(a.substring(3));
        // index in py
        System.out.println(a.substring(0));
        System.out.println(a.substring(3, 5));// start and end inluding INdexx

        System.out.println(a.replace('l', 'd'));
        System.out.println(a.replace("lak", "khan"));

        // replacment of char and string

        System.out.println(a.startsWith("l"));
        System.out.println(a.endsWith("han"));

        // char at (index) find what character at index postion

        System.out.println(a.charAt(3));

        // retrun index number from chaacter
        System.out.println(a.indexOf("l", 0));

        System.out.println(a.indexOf("ytre", 1));
        // if not present outpiut will come = -1

        /*
         * index from run from left to fight
         * but last indx of runs from rigght to left
         */
        System.out.println(a.lastIndexOf("l", 1));
        System.out.println(a.equals("lakhan"));
        System.out.println(a.endsWith(po));
        System.out.println(a.equalsIgnoreCase("LAKHAN"));
        String x = "hello janvi";
        System.out.println(x);
        /*
         * EXCAPE SEQUENCE CHARACTER
         * MEANS CHARACTER AFTER BLACKSLAsh
         */
        System.out.println("uie uiskfui iyFGku \" ");
        System.out.println(a.matches(po));
    }
}
