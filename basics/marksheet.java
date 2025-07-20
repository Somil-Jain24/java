import java.util.Scanner;

public class marksheet {
    public static void main ( String[] args ){
        Scanner S = new Scanner (System.in);
        System.out.print("Enter FIrst subject number = ");
        int a = S.nextInt();

        System.out.print("Enter Second subject number = ");
        int b = S.nextInt();
        
        System.out.print("Enter Third subject number = ");
        int c = S.nextInt();
        
        System.out.print("Enter Fourth subject number = ");
        int d = S.nextInt();
        
        System.out.print("Enter Fifth subject number = ");
        int e = S.nextInt();

        int z = (a+b+c+d+e)/5;

        System.out.print("Your Percentage Is ");
        System.out.print(z);
        System.out.print("%");

    }
}
