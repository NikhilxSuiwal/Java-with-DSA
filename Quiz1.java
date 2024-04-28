 // Ques] Make a menu driven program related to marks
import java.util.*;
public class Quiz1 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        switch (button){
            case 0:
                System.out.println("Stops");
                break;
            case 1: int marks=sc.nextInt();
            if(marks>=90){
                System.out.println("This is good");
            }
            else if(marks>=60){
                System.out.println("This is also good");
            }
            else if(marks>=0){
                System.out.println("This is good as well");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}


