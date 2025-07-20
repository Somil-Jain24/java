
import  java.util.*;

public class flipcoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0 for heads, 1 for tails");
        int user = sc.nextInt();
        
        Random R = new  Random();
        int computer = R.nextInt(2);
        // System.out.println("Result is:- " + computer);
        if(computer == 0) {
            System.out.println("Hence comes heads");
        } else {
            System.out.println("Hence comes tails");
        }
        if (user == computer) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

    }
}
