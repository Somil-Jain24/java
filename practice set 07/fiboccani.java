public class fiboccani{

   public static int series(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            int a = series(n-1) + series(n-2); //recursion
            return a; 
        }
    }
    
    /* 
    Example: fib(5)
    Call: fib(5)
    
    Not 1 or 2, so it calls fib(4) + fib(3).
    Call: fib(4)
    
    Not 1 or 2, so it calls fib(3) + fib(2).
    Call: fib(3)
    
    Not 1 or 2, so it calls fib(2) + fib(1).
    Call: fib(2)
    
    This is 2, so it returns 1.
    Call: fib(1)
    
    This is 1, so it returns 0.
    Now, we can substitute back:
    
    fib(3) = fib(2) + fib(1) = 1 + 0 = 1
    Returning to fib(4):
    
    fib(4) = fib(3) + fib(2) = 1 + 1 = 2
    Finally, substituting back to fib(5):
    
    fib(5) = fib(4) + fib(3) = 2 + 1 = 3
    So, fib(5) returns 3.
     */
    public static void main(String[] args) {
        System.out.println("Series is :- " + series(5));
    }
}

    

