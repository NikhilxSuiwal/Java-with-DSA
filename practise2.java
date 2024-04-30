// Write a function to print the sum of all odd numbers from 1 to n
import java.util.*;
public class practise2{
    public static int printOdd(int a){
        int sum=0;
         for(int i=1; i<=a; i++){
            if(i%2!=0){
                System.out.print(i+" ");
                sum=sum+i;
            }
         }
         System.out.println("= "+sum);
        return a;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
       int a= sc.nextInt();
    printOdd(a);
    }
}
