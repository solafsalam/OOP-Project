public class Person {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private String address;
    private String password;

    public Person(String name, int age, String gender, String email, String phone, String address,String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password=password;
    }
    public Person(){
        this.name="No name";
        this.age=0;
        this.gender="male";
        this.email="";
        this.phone="";
        this.password="";
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 17)
            this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
    public void setPassword(String password) {
        if (password.length() >= 6)
            this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Address: " + address;
    }
}
