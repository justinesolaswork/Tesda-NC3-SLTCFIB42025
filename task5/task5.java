
import java.util.*;

public class task5{

    
    public static void main(String[] args) {

        System.out.println("enter three numbers to find largest");
        Scanner input = new Scanner(System.in);
        Boolean largenumapp = true;
        while (largenumapp){
        try {
            entermessage("A");
            int a = input.nextInt();
            entermessage("B");
            int b = input.nextInt();
            entermessage("C");
            int c = input.nextInt();
            int largest = (a>=b)?(a>=c?a:c):(b>=c?b:c);
            System.out.println(a == b && b == c ? "All numbers are equal" : "Largest number is: " + largest);
            largenumapp = false;
        } catch (Exception e) {
            System.out.printf("Invalid input. Please enter three integers.");
            largenumapp = true;
            input.next(); // clear the invalid input    
        }
    }
    }
        public static void entermessage(String letter){
            System.out.printf("Enter number for letter %s :",letter);
        }
}