import java.sql.SQLOutput;
import java.util.*;
public class Ifelse {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int age=  sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Sorry you are Under age");
        }
    }
}
