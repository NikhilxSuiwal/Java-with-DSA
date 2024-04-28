import java.sql.SQLOutput;
import java.util.*; // <-- Packages

public class Inputs {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        //String name= sc.next(); //it will take only one token like we give input tony stark but it can only give output tony
        String name= sc.nextLine();
        //nextInt for Integer | nextFloat for floating values and many functions are there.
        System.out.println(name);
    }
}
