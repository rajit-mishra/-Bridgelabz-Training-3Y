
import java.util.ArrayList;

class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department){
        this.departments.add(department);
    }

    public void removeAllDepartments(){
        this.departments.clear();
        System.out.println("All departments removed due to company deletion.");
    }

    public void displayCompany(){
        System.out.println("Company: "+name);
        for(Department d : departments){
            d.displayDepartment();
            System.out.println();
        }
    }
}

class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public void displayDepartment(){
        System.out.println("Department: " + name);
        for(Employee e : employees){
            e.displayEmployee();
        }
    }
}

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayEmployee(){
        System.out.println("Employee: "+name+", ID: "+id);
    }
}

public class CompanyTest {
    public static void main(String[] args){
        Company comp = new Company("Tech Corp");

        Department hr = new Department("HR");
        Department dev = new Department("Development");

        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);

        hr.addEmployee(e1);
        dev.addEmployee(e2);
        dev.addEmployee(e3);

        comp.addDepartment(hr);
        comp.addDepartment(dev);

        comp.displayCompany();

        comp.removeAllDepartments();

        comp.displayCompany();
    }
}
