import java.util.Scanner;

public class Person {

    // dùng biến private để đảm bảo tính đóng gói, chỉ dùng trong class Person
    private String name;
    private int age;
    private String address;
    static String school = "CNTT"; // thuộc tính chung dùng biến static đỡ tốn bộ nhớ
    // nếu thay đổi biến school bên hàm main, sẽ thay đổi tất cả person1, 2 và 3
    // khối static được tải trước main;

    // tạo phương thức getter và setter cho biến private

    static void setSchool() {
        school = "Techmaster";
        // name = "Hoa"; biến name k phải static sẽ k thể gọi dc trong phương thức
        // static này
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // tạo phương thức
    public void study(String subject) {
        System.out.println(name + " study " + subject);
    }

    // tạo phương thức Scanner
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println(("Nhập địa chỉ: "));
        address = sc.nextLine();
    }

    public Person() {
        // System.out.println("Đây là contructor mặc định");
    } // mỗi lần gọi bên hàm main, sẽ chạy đầu tiên
      // tên contructor trùng tên class

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age + 10;
        this.address = address;
    }

    // tạo phương thức in toàn bộ thông tin
    @Override
    public String toString() {
        return name + "-" + age + "-" + address + "-" + school;

    }

    // hoặc có thể dùng phương thức như dưới để in thông tin
    public void show() {
        System.out.println(("Name: " + name));
        System.out.println(("Age: " + age));
        System.out.println(("Address: " + address));
        System.out.println(("School: " + school));

    }

    public void sleep(){
        System.out.println(name + " sleep at 8PM");
    }

}
