
public class Student {
    private String name;
    private String Rollno;

    public Student(String name, String Rollno){
        this.name = name;
        this.Rollno = Rollno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    public void setRollno(String Rollno) {
        this.Rollno = Rollno;
    }
    public String getRollno(){
        return Rollno;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Roll no: "+Rollno;
    }
}
