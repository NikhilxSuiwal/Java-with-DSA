// Make a function to multiply 2 numbers and return the products
import java.util.*;
public class function2 {
    public static int calculateProduct(int a, int b){
        int multiply= a*b;
        return multiply;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int product= calculateProduct(a,b);
        System.out.println("The Product of two number is "+product);
    }
}
