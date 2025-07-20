import java.util.Scanner;

public class lengta{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
       
        System.out.print("Enter Your Name = " );
        String a = s.nextLine();
       
        String n = a ;
        System.out.print(n.length());
    }
}