class animal{
   public void sound(){
        System.out.println("Speak");
    }
}
class dog extends animal {

}

public class ani {
    public static void main(String[] args) {
        
        dog d = new dog();
        d.sound();
    }
}