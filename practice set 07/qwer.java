import java.util.Scanner;

public class qwer {

    public static int multi (int a){
        
        for (int i= 1; i<=10 ; i++){
           int z = a*i;
            System.out.println("Table of given number is "+ z + " "); 
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number :- ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        multi (a);
    }
}
