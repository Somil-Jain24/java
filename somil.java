import java.util.Scanner;

public class somil {
    public static void main(String[] args){
        System.out.println("Somil");
        Scanner S = new Scanner(System.in);
        System.out.print("Enter 1 = ");
        int a = S.nextInt();

        System.out.print("Enter 2 = ");
        int b = S.nextInt();

        System.out.print("Enter 3 = ");
        int c = S.nextInt();

        int z = a+b+c;
        System.out.print(z);
    }
}