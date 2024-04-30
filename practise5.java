// Write a function that takes in age as input and returns is that person is eligible to vote or not. A person of age >18 is eligible to vote.

import java.util.*;
public class practise5 {
    public static int calculateAge(int a){
        if(a>18){
            System.out.println("Congratulations you are eligible to vote");
        }
        else{
            System.out.println("Sorry you are not eligible to vote");
        }
        return a;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        calculateAge(a);
    }
}
