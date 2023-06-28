import com.mycompany.mypackage.Person;
public class Exercise1 {
    public static void main(String args[]){
        Person pe = new Person();
        pe.setAge(25);
        pe.setName("Aino Virta");
        //System.out.println(pe.getName()+" on "+pe.getAge()+" vuotias");
        pe.welcome();
    }
}
