public class varags {
    public static int sum(int ...arr){
        int r = 0 ;
        for(int a : arr ){
        r += a;
        }
        return r ;
    }

    public static void main(String[] args) {
        System.out.println("Sum is :- "+ sum( 1 , 3 , 7 , 9));
    }
}
