import java.util.ArrayList;

public class Student extends Person {
    private String student_ID;
    private double account_Balance ;
    private String certificate_Source;
    private String certificate_Date;

    private ArrayList<Subject>assignSubject ;


    public Student(String name, int age, String gender, String email, String phone, String address, String password, String student_ID, double account_Balance, String certificate_Source, String certificate_Date) {
        super(name, age, gender, email, phone, address, password);
        this.student_ID = student_ID;
        this.account_Balance = account_Balance;
        this.certificate_Source = certificate_Source;
        this.certificate_Date = certificate_Date;
        this.assignSubject = new ArrayList<>();
    }
    public void assignSubject(Subject subject)
    {
       double subjectCost = subject.getCredit_Hour()*subject.getPricePerHour();
       if (account_Balance>=subjectCost)
       {
            account_Balance -=subjectCost;
            assignSubject.add(subject);
           System.out.println(getName() +" has assign for "+subject.getName());
       }
       else {
           System.out.println("Insufficient balance to register for "+ subject.getName());
       }
    }
    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + student_ID +
                "\nBalance: " + account_Balance +
                "\nCertificate Source: " + certificate_Source +
                "\nCertificate Date: " + certificate_Date;
    }
}
