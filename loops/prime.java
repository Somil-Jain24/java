import java.util.Scanner;
public class prime {
 public static void main(String[] args) {
     Scanner S = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n = S.nextInt();

    //for find the prime number we have to use loop with if else

    for(int i= 2 ; i<=n ; i++){
        boolean prime = true;
        for(int j= 2; j*j<=i;j++ ){
            if(i%j ==0){
                prime = false;
            
            }

        }
        if(prime){
            System.out.print(  i+"  "  );
        }
    }
 }
}
