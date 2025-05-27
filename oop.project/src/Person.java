public class Person {
    String name;
    int  age;
    String gender;
    String email;
    String phone;
    String address;
    String password;
    public Person(String name,int age,String gender,String email,String phone,String address,String password){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.email=email;
        this.phone=phone;
        this.address=address;
        this.password=password;
    }
    public Person(){
        this.name="No name";
        this.age=0;
        this.gender="male";
        this.email="";
        this.phone="";
        this.address="";
        this.password="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
