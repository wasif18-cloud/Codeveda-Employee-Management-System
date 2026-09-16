import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name, department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
        void display() {
        System.out.println(id + " | " + name + " | " + department + " | " + salary);
    }
}
public class EmployeeManagementSystem {
    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("\n");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("\n");   
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                add();
            } 
            else if (choice == 2) {
                view();
            } 
            else if (choice == 3) {
                update();
            } 
            else if (choice == 4) {
                delete();
            } 
            else if (choice == 5) {
                System.out.println("Thank You!");
                break;
            } 
            else {
                System.out.println("Invalid Choice!");
            }
        }
    }
    static void add() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        list.add(new Employee(id, name, dept, salary));

        System.out.println("Employee Added!");
    }
    static void view() {
        if (list.isEmpty()) {
            System.out.println("No Employee Found!");
            return;
        }

        System.out.println("\nID | Name | Department | Salary");

        for (Employee e : list) {
            e.display();
        }
    }
    static void update() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.print("New Name: ");
                e.name = sc.nextLine();

                System.out.print("New Department: ");
                e.department = sc.nextLine();

                System.out.print("New Salary: ");
                e.salary = sc.nextDouble();

                System.out.println("Employee Updated!");
                return;
            }
        }
        System.out.println("Employee Not Found!");
    }
    static void delete() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                list.remove(e);
                System.out.println("Employee Deleted!");
                return;
            }
        }
        System.out.println("Employee Not Found!");
    }
}