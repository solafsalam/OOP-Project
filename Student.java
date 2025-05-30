package Registration_system;

import java.util.ArrayList;

public class Student extends Person {
    private static int idCount = 0;
    private String student_ID;
    private double account_Balance ;// رصيد الحساب
    private String certificate_Source; // مصدر الشهادة
    private String certificate_Date;


    private ArrayList<Subject>assignSubject ;
    private ArrayList<Payment>payments=new ArrayList<>(); // قائمة الدفع

    public Student(String name, int age, String gender, String email, String phone, String address, String password, String student_ID, double account_Balance, String certificate_Source, String certificate_Date) {
        super(name, age, gender, email, phone, address, password);
        this.student_ID = "02025"+(++idCount);
        this.account_Balance = account_Balance;
        this.certificate_Source = certificate_Source;
        this.certificate_Date = certificate_Date;
        this.assignSubject = new ArrayList<>();
    }

     // تسجيل مادة
    public void assignSubject(Subject subject) {
        assignSubject.add(subject);
        System.out.println(getName() + " has registered for " + subject.getName());
    }

    // إضافة عملية دفع
    public void addPayment(double amount) {
        Payment payment = new Payment(amount, java.time.LocalDate.now());
        payments.add(payment);
    }

    // طباعة سجل الدفعات
    public void printPayments() {
        if (payments.isEmpty()) {
            System.out.println("لا توجد دفعات مسجلة.");
        } else {
            for (Payment p : payments) {
                System.out.println("💵 دفع: " + p.getAmount() + " في " + p.getDate());
            }
        }
    }

    public String getStudentID() {
        return student_ID;
    }

    public double getAccount_Balance() {
        return account_Balance;
    }
//    public List<Payment> getPayments() {
//        return payments;
//    }

    public ArrayList<Subject> getAssignedSubjects() {
        return assignSubject;
    }

    public void setAccount_Balance(double account_Balance) {
        this.account_Balance = account_Balance;
    }

                          // محذوف
//    @Override
//    public String toString() {
//        return super.toString() +
//                "\nRegistration_system.Student ID: " + student_ID +
//                "\nBalance: " + account_Balance +
//                "\nCertificate Source: " + certificate_Source +
//                "\nCertificate Date: " + certificate_Date;
//    }
}
