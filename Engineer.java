package Registration_system;

import java.util.ArrayList;

public class Engineer extends Teacher {
    private String specialization; //الاختصاص
    //private ArrayList<Registration_system.Subject>subjects;//  teacher لا نحتاج له لانه يرث من
    private String certificateSource; // مصدر الشهادة

    public Engineer(String name, int age, String gender, String email, String phone, String address, String password,
                    String department, ArrayList<Subject> subjects, String specialization, String certificateSource) {
        super(name, age, gender, email, phone, address, password, department, subjects);
        this.specialization = specialization;
        this.certificateSource=certificateSource;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getCertificateSource() {
        return certificateSource;
    }

    public void setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
    }

                      // محذوف
//    @Override
//    public String toString() {
//        return super.toString() +
//                "\nspecialization: " + specialization;
//    }

                         // محذوف
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nspecialization: ").append(specialization);
        sb.append("\nCertificate Source: ").append(certificateSource);
        return sb.toString();
    }
}
