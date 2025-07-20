
// in function overloading we can use same name but different parameters 

public class overloading {
    public static void somil() {
      System.out.println("Hello Somil");
    }
    public static void somil(int a){
        System.out.println("Hello Somil " +a );
    }

    public static void main(String[] args) {
        somil();
        somil(3000);
    }
}
