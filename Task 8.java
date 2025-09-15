

public class Task8{
    public static void main(String... varArgs) {

        int totalsum = 0;
        for (String arg : varArgs) {
            int num = Integer.parseInt(arg);
            for(int i=1;i<=num;i++){
           totalsum += i;
        }
        }
    System.out.println("Total Cumulative Sum of " + String.join(", ", varArgs) + " is: " + totalsum);
    }
}
