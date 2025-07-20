
import java.util.Scanner;

public class practiceset02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = s.nextInt();
        
        int sum=0 , i = 0;
        while(i <n ){
            sum = sum + (2*i ); 
            i++;   
        }
        System.out.println("Sum of number is = " + i);
        System.out.println("Sum of number is = " + sum); 
    }
    
}
