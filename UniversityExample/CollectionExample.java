import java.util.ArrayList;

public class CollectionExample {
    static ArrayList<Student> studentsCollection;

    public static void main(String args[]) {
        initializeStudentsList();
        printStudents();
        printFirstStudent();
        
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
    public static void printFirstStudent(){
        System.out.println("Ensimmäinen");
        System.out.println(studentsCollection.get(0).getFname() + " " + studentsCollection.get(0).getLname());
    }
}
