import java.util.Scanner;

public class ques6 {
    public static int average(int ...arr){
        int r=0;
        for(int a : arr){
            r += a;
        }
        return r;
    }

    public static int array(int n ){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers :- ");
        int[] array = new int[n];
        for (int i = 0 ; i>=n ; i++ ){
            array[i] = s.nextInt(); 
            
        }

        return average(array(n));
    }

    public static void main(String[] args) {
        array(5);
    }
}
