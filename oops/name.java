    class edit{
    int age;
    String name ;
    public void getdetails(){
        System.out.println("My name is " +name );
        System.out.println("My age is " +age );
    }
}

public class name{
    public static void main(String[] args) {
        edit somil = new edit ();
        somil.age = 18;
        somil.name = "Somil Jain";
        // System.out.println(somil.id);
        // System.out.println(somil.name);
        somil.getdetails();
    }
}