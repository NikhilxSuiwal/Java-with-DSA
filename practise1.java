// Ques1] Enter 3 number from the user & make a function to print their average
import java.util.*;
public class practise1 {
    public static int calculateAverage(int a, int b, int c){
        int average=a+b+c;
        int div= average/3;
        System.out.println(div);
        return average;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        calculateAverage(a, b, c);
    }
}
