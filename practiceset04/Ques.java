import java.util.Scanner;

public class Ques{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter 1st subject no. = ");
        float a = s.nextFloat();
        
        System.out.print("Enter 2nd subject no. = ");
        float b = s.nextFloat();

        System.out.print("Enter 3rd subject no. = ");
        float c = s.nextFloat();

        float z = (a+b+c)/3.0f;

        System.out.print("Your Percentage is = ");
        System.out.println(z);

        if ( z>=40 && a>= 33 && b>=33 && c>= 33 ) {
            System.out.println("Congralution you are pass ");
            
        }
        else 
        System.out.println("better luck next time");
    }
}