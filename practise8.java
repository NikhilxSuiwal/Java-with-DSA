// Two no. are entered by the user  x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.*;
public class practise8 {
    public static int printPower(int x, int n){
        int result=1;
        for(int i=1; i<=n; i++){
            result= result*x;
        }
        System.out.println("x to the power n is: "+ result);
        return x &n;
    }
    public static void main(String[]args){
        System.out.print("Enter x: ");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        printPower(x, n);
    }
}
    
