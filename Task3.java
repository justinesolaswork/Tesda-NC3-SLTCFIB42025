public class Task3 {
    public static void main(String[] args) {
        // Change the variables in the first section, so that each if statement resolves as true.
        
        String a = "Wow";
        String b = "Wow";
        String c = "different";
        String d = "Wowl";

        boolean b1 = a == b;
        boolean b2 = d.equals(b + "l");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("success!");
        }
    }
}
