import java.util.*;

public class guess {
    class game{
        Random r = new Random();
        int computer = r.nextInt(100);
        int user;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        game(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your guess between 0 to 100");
            play();
           
        }
        void play(){
             user = sc.nextInt();
            check();
        }
        void check(){
            if(user == computer){
                System.out.println("You guessed it right");
                System.out.println("You took " + count + " attempts");
            }
            else if(user > computer){
                System.out.println("Your guess is too high. Try again:");
                count++;
                play();
            }
            else{
                System.out.println("Your guess is too low. Try again:");
                count++;
                play();
            }
            
        }
    }

    public static void main(String[] args) {
        guess obj = new guess();
        game g = obj.new game();
    }
}

