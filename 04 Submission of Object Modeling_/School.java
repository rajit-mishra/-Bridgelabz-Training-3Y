
import java.util.ArrayList;

class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student){
        if(!students.contains(student)){
            students.add(student);
        }
    }

    public void showStudents(){
        System.out.println("Students in course "+name+":");
        for(Student s : students){
            System.out.println("- "+s.getName());
        }
        System.out.println();
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        if(!courses.contains(course)){
            courses.add(course);
        }
    }

    public void showCourses(){
        System.out.println(name+" is enrolled in:");
        for(Course c : courses){
            System.out.println("- "+c.name);
        }
        System.out.println();
    }

    public String getName(){
        return name;
    }
}

class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name){
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void showStudents(){
        System.out.println("Students at "+name+":");
        for(Student s : students){
            System.out.println("- "+s.getName());
        }
        System.out.println();
    }
}

public class SchoolTest {
    public static void main(String[] args){
        School school = new School("Greenwood High");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        school.addStudent(alice);
        school.addStudent(bob);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        alice.addCourse(math);
        alice.addCourse(science);
        bob.addCourse(math);

        math.enrollStudent(alice);
        math.enrollStudent(bob);
        science.enrollStudent(alice);

        school.showStudents();

        alice.showCourses();
        bob.showCourses();

        math.showStudents();
        science.showStudents();
    }
}
