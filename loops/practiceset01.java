import java.util.Scanner;

public class practiceset01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = s.nextInt();

        for(int i=n ; i!=0 ; i-- ){
            for(int j=1 ; j<=i ; j++){
            System.out.print(" * ");
        }
        System.out.println("\n");
    }
    }
    
}
