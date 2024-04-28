// Ques} Print the greeting when press 1 print Hello, 2 press Namaste, 3 press Bonjour

import java.util.*;
public class Ques5 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("Namaste");
        }
        else if(button==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Button");
        }
    }
}
