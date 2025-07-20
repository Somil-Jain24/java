
class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getname(){
        return name;
    }
    public String setname( String n){
        name = n;
        return name;
    }
}

public class question1 {
    public static void main(String[] args) {
        Employee Somil = new Employee();
        Somil.salary =100000;
        Somil.name = "Somil";
        System.out.println(Somil.getname());
        System.out.println(Somil.getSalary());
        System.out.println(Somil.setname("Ravi"));
        System.out.println(Somil.getname());


    }
}
