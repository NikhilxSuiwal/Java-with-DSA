// Write a program to enter the numbers till the user wants & at the end it should display the count of +ive, -ive, & zeroes entered.

import java.util.*;
public class practise7 {
    public static void main(String[]args){
        int positive=0, negative=0, zeroes=0;
        System.out.println("Press 1 to continue or 0 to stop");
        Scanner sc= new Scanner(System.in);
        int input= sc.nextInt();
        while(input>0){
            System.out.println("Enter your number: ");
            int number= sc.nextInt();
            if(number<0){
                negative++;
            }
            else if(number>0){
                positive++;
            }
            else{
                zeroes++;
            }
            System.out.println("Press 1 to continue or 0 to stop");
            input=sc.nextInt();
        }
        System.out.println("Positive number: "+ positive);
        System.out.println("Negative number are: "+ negative);
        System.out.println("Zeroes are: "+ zeroes);
           
    }
    
}
