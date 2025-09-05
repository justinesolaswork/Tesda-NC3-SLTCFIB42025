
import java.util.*;

public class task4{
    public static void main(String[] args) {
        System.out.println("enter a word to check if Palindrome");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String reverseversion = new StringBuilder(word).reverse().toString();
        System.out.println(word.equals(reverseversion) ? "Palindrome" : "Not a Palindrome" );
    }
}
