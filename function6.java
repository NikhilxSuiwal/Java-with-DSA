//Make a program to check a number is prime or not
import java.util.*;
public class function6 {
    public static int calculatePrime(int n){
        int prime=n;
        int div=2;
        while(div<n){
          if(n%div==0){
            System.out.println("Not Prime");
            break;
          }
          else{
            div= div+1;
            System.out.println("Prime");
            break;
          }
        }
        return prime;
    } 
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        calculatePrime(n);
    }   
}
