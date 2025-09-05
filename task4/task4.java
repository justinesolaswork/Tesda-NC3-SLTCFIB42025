
// import java.util.*;

// public class task4{
//     public static void main(String[] args) {
//         System.out.println("enter a word to check if Palindrome");
//         Scanner input = new Scanner(System.in);
//         String word = input.nextLine();
//         String reverseversion = new StringBuilder(word).reverse().toString();
//         System.out.println(word.equals(reverseversion) ? "Palindrome" : "Not a Palindrome" );
//     }
// }
class P{ public static void main(String[] a){
    System.out.println(a[0].equalsIgnoreCase(new StringBuilder(a[0]).reverse().toString())?"Palindrome":"Not a Palindrome");
}}