public class University {
    public static void main(String args[]){
        System.out.println("Student esimerkki");
        Student object1Student=new Student();
        object1Student.setFname("Lisa");
        object1Student.setLname("Smith");
        object1Student.printStudentData();
        //System.out.println("Etunimi="+ objectStudent.getFname());
        //System.out.println("Sukunimi="+ objectStudent.getLname());

        Student object2Student=new Student("Teppo","Testi");
        object2Student.printStudentData();
    }
}
