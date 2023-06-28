import java.util.ArrayList;

public class CollectionExample {
    static ArrayList<Student> studentsCollection;

    public static void main(String args[]) {
        initializeStudentsList();
        printStudents();
    }

    public static void initializeStudentsList() {
        studentsCollection = new ArrayList<>();
        studentsCollection.add(new Student("Lisa", "Smith"));
        studentsCollection.add(new Student("Bob", "Smith"));
        studentsCollection.add(new Student("Jim", "Jones"));
        studentsCollection.add(new Student("Ann", "Williams"));
    }

    public static void printStudents() {
        for (Student stu : studentsCollection) {
            System.out.println(stu.getFname() + " " + stu.getLname());
        }
    }
}
