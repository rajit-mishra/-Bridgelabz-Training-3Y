
import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class Department {
    private String name;
    private ArrayList<Faculty> faculties;

    public Department(String name){
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }

    public void displayDepartment(){
        System.out.println("Department: "+name);
        System.out.println("Faculties:");
        for(Faculty f : faculties){
            System.out.println("- "+f.getName());
        }
        System.out.println();
    }
}

class University {
    private String name;
    private ArrayList<Department> departments;

    public University(String name){
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept){
        departments.add(dept);
    }

    public void removeDepartments(){
        departments.clear();
        System.out.println("All departments removed.");
    }

    public void displayUniversity(){
        System.out.println("University: "+name);
        for(Department d : departments){
            d.displayDepartment();
        }
    }
}

public class UniversityTest {
    public static void main(String[] args){
        University uni = new University("Global University");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");
        Faculty f3 = new Faculty("Dr. Lee");

        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        dept1.addFaculty(f1);
        dept1.addFaculty(f2);

        dept2.addFaculty(f3);

        uni.addDepartment(dept1);
        uni.addDepartment(dept2);

        uni.displayUniversity();

        uni.removeDepartments();

        uni.displayUniversity();
    }
}
