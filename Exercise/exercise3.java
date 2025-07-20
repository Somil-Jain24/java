import java.util.*;

public class exercise3 {
    class game{
        Random r = new Random();
        int computer = r.nextInt(100);
        int user;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        game(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your guess between 0 to 100");
           
        }
        play(){
             user = sc.nextInt();
            check();
        }
        void check(){
            if(user == computer){
                System.out.println("You guessed it right");
                System.out.println("You took " + count + " attempts");
            }
            else if(user > computer){
                System.out.println("Your guess is too high");
                count++;
                play();
            }
            else{
                System.out.println("Your guess is too low");
                count++;
                play();
            }
        }
    }

    public static void main(String[] args) {
        exercise3 obj = new exercise3();
        obj.new Game();
    }
}




// import java.util.*;

// public class Exercise3 {
//     class Game {
//         Random r = new Random();
//         int computer = r.nextInt(100);
//         int user;
//         int count = 0;
//         Scanner sc = new Scanner(System.in); // Use a single Scanner instance

//         Game() {
//             System.out.println("Enter your guess between 0 to 100");
//             play();
//         }

//         void play() {
//             user = sc.nextInt();
//             check();
//         }

//         void check() {
//             count++;
//             if (user == computer) {
//                 System.out.println("You guessed it right!");
//                 System.out.println("You took " + count + " attempts");
//             } else if (user > computer) {
//                 System.out.println("Your guess is too high. Try again:");
//                 play();
//             } else {
//                 System.out.println("Your guess is too low. Try again:");
//                 play();
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Exercise3 obj = new Exercise3();
//         Game gameInstance = obj.new Game(); // Instantiate the inner class
//     }
// }