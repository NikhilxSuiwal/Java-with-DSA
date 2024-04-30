// Make a function to check the given number n is even or not

import java.util.*;
public class function4 {
    public static int printEven(int n){
        if(n%2==0){
            System.out.print(n+" is Even number");
        }
        else{
            System.out.print(n+" is Odd number");
        }
        int even=n%2;
        return even;
    }
    public static void  main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printEven(n);
    }
    
}
