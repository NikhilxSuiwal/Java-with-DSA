// Make a function to print the table of a given number n.
import java.util.*;
public class function5 {
    public static int printTable(int a){
        int table=a;
        for(int i=1; i<=10; i++){
            int x= a*i;
            System.out.println(x);
        }
        return table;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        printTable(a);
    }
    
}
