import java.util.Scanner;

class Employee {
    int salary;
    String name;

    public void getData() {
        System.out.println("Your name is: " + name);
        System.out.println("Your salary is: " + salary);
    }
}

public class practice01 {

    public static void repeat(int n) {
        Scanner s = new Scanner(System.in);
        Employee[] arr = new Employee[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = new Employee();
            System.out.println("Enter the name of person " + (i + 1) + ": ");
            arr[i].name = s.nextLine();
            arr[i].salary = 500;
        }
        
        for (int i = 0; i < n; i++) {
            arr[i].getData();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int n = s.nextInt();
        s.nextLine();  
        repeat(n);
    }
}
