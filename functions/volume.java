import java.util.*;

public class volume {
    
    public static int volume(int x , int y , int z){
        
        int a = x* y*z;
        return a ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length Width and Height of the box respectively :-  ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = volume(a, b, c);
        System.out.println("The Volume of The Box is :- "+d );
    }
}
