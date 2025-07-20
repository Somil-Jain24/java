import java.util.Scanner;
public class do_While {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = s.nextInt();
        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z<=n);
    }
    
}