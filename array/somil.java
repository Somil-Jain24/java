
import java.util.Scanner;

public class somil {
        public static void main(String[] args){    

            Scanner s = new Scanner(System.in);
            
            System.out.print("Enter Numbers:- ");
            
            int a = s.nextInt();      
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            
            int[] marks = {a,b,c,d};
            System.out.println(marks.length);
            System.out.println("after array");
            
            for(int i = 0 ; i<marks.length ; i++){
                
                System.out.println(marks[i]);

            }
        }
}

