import java.util.Scanner;


public class ques4 {

    public static int pattern(int a ){
        for(int i= a ; i>=1 ; i--){
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


