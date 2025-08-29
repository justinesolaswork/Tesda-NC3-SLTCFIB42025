    //OUT PUT SHOULD BE H3ll0 w0rld 2.0 true
    // Primitives Only Expect(long and double)
public class Task2 {
    public static void main(String[] args) {
        char H = 'H';
        int three = 3;
        short one = 1;
        short zero = 0;
        char w = 'w';
        char r = 'r';
        char d = 'd';
        float twoPointZero = 2.0F;
        boolean bool = true;

        String output = "" 
            + H + three + one + one + zero + " "
            + w + zero + r + one + d + " "
            + twoPointZero + " "
            + bool;

        System.out.println(output); 
        // Output: H3ll0 w0rld 2.0 true
    }
}
