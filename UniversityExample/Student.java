public class Student {
    private String fname;
    private String lname;
    //set-metodi eli Setter
    public void setFname(String value){
        this.fname=value;
    }
    //get-metodi eli Getter
    public String getFname(){
        return this.fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }

    public void printStudentData(){
        System.out.println("Hei,");
        System.out.print("nimeni on ");
        System.out.print(fname);
        System.out.print(" ");
        System.out.println(lname);
    }
    

    //uusi muodostin eli konstruktori
    public Student(String fn, String ln){
        fname=fn;
        lname=ln;
    }
    //jos tarvitaan myös tyhjä muodostin, se on kirjoitettava
    public Student(){}
}
