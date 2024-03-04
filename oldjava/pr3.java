package oldjava;
public class pr3 {
    public static void main(String[] args) {
        // probb01
        String a = "                        HELLO                       ";
        System.out.println(a.toLowerCase());
        // probb2______repalce
        System.out.println(a.replace(" ", "_"));
        // updating variable new string made
        // probb03
        String x = "Dear <!name!> , thanks alot";
        System.out.println(x.replace("name", "lakhan"));
        // it didn't replaced its just printed and for replacement Assgin then relpace
        // like a=+1

        System.out.println(a.indexOf("helo", 7));
        System.out.println(a.indexOf("                                                        ", 0));

        // probb5
        String ab = "q\\m";
        System.out.println(ab + "iub");
    }

}
