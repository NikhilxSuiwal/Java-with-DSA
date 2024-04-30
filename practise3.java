// Ques] Write a function which takes 2 number & returns the greatest of the two
import java.util.*;
public class practise3 {
    public static int printGreatest(int a, int b){
        if(a>b){
            System.out.println(a);
        }
        else if(b>a){
            System.out.println(b);
        }
        else{
            System.out.println("Invalid");
        }
        return a&b;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        printGreatest(a, b);
    }
    
}
