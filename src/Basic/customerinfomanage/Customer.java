package Basic.customerinfomanage;

public class Customer {
    private String name;
    private char sex;
    private int age;
    private String phone;
    private String email;

    public Customer(String name, char sex, int age, String phone, String email) {
        setName(name);
        setSex(sex);
        setAge(age);
        setPhone(phone);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
