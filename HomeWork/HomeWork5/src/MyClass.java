public class MyClass {

    //Viết chương trình liệt kê danh sách lớp bao gồm tên, tuổi, địa chỉ, sử dụng ArrayList

    private String name;
    private int age;
    private Address address;

    public MyClass(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " - " + age + " tuổi" + " - " + address;
    }
    
}
