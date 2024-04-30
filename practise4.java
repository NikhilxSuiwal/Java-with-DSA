import java.util.*;
public class practise4 {
    public static int printCircumference(int r){
        double pi= 3.14;
        double circum= 2*pi*r;
        System.out.println("Circumfernce of a circle is "+circum);
        return r;      
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        
        printCircumference(r);
    }
    
}
