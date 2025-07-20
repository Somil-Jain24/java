import java.util.Scanner;


public class pattern {
    public static int pattern(int a ){
        for(int i= 1 ; i<=a ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Number = ");
        int z = s.nextInt();
        pattern(z);
    }
}
