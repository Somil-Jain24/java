import java.util.Scanner;

public class som {

    public static void main (String[] args){
        System.out.println("somil");
        Scanner S = new Scanner(System.in);
        System.out.print("Enter no. 1 = ");
        int a = S.nextInt();

        System.out.print("Enter no. 2 = ");
        int b = S.nextInt();
        
        System.out.print("Enter no. 3 = ");
        int c = S.nextInt();

        int z = a+b+c;
        System.out.print(z);
    }
}