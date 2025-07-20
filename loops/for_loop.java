import java.util.Scanner;
public class for_loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = s.nextInt();
        for(int a= 1 ; a<= n ; a++){
            System.out.println(a);
        }
    }
}