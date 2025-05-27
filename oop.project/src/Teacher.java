import java.util.ArrayList;
public class Teacher extends Person {
    private String department;
    private ArrayList<String>subjects=new ArrayList<>();


    public Teacher(String name, int age, String gender, String email, String phone, String address, String password, String department, ArrayList<String> subjects) {
        super(name, age, gender, email, phone, address, password);
        this.department = department;
        this.subjects = subjects;
    }

    public Teacher() {
        this.department =null;
        this.subjects = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void addSubject(String subject){
        subjects.add(subject);
    }
    public ArrayList<String> getSubjects(){
        return subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "department='" + getDepartment() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", email='" + getEmail()+ '\'' +
                ", phone='" + getPhone() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
