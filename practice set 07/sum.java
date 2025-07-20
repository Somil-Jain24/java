public class sum {
    public static int somil (int a ){
        if(a==0){
            return 0;
        }
        int z = a + somil(a-1);
        return z;
    }
    public static void main(String[] args) {
    System.out.println(somil (15));
    }
}