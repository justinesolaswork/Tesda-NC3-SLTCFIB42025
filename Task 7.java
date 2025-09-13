import java.util.*;

public class Task7{
        int add(int a,int b){
        return a+b;
    }
        int substract(int a,int b){
        return a-b;
    }
        int devide(int a,int b){
        return a/b;
    }
        int multiply(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        String operations[] = {"add","substract","devide","multiply"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        for(String operation:operations){
            Task7 obj = new Task7();
            switch(operation){
                case "add":
                System.out.printf("Addition of %d and %d is : %d\n",a,b,obj.add(a, b));
                break;
                case "substract":
                System.out.printf("Substraction of %d and %d is : %d\n",a,b,obj.substract(a, b));
                break;
                case "devide":
                System.out.printf("Devide of %d and %d is : %d\n",a,b,obj.devide(a, b));
                break;
                case "multiply":
                System.out.printf("Multiplication of %d and %d is : %d\n",a,b,obj.multiply(a, b));
                break;
            }
        }
    }
}
