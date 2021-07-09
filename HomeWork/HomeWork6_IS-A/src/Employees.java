import java.util.Scanner;
import java.text.DecimalFormat;

public class Employees {

    // mã nhân viên, họ tên, tuổi, số điện thoại, email, lương cơ bản
    protected int id;
    protected String name;
    protected int age;
    protected String phoneNumber, email;
    protected long basicSalary;

    // tạo contructor
    public Employees(int id, String name, int age, String phoneNumber, String email, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public Employees() {
    }

    // tạo getter và setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Thực hiện nhập vào danh sách nhân viên (Sử dụng Scanner)
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập họ tên nhân viên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số điện thoại của nhân viên: ");
        phoneNumber = sc.nextLine();
        System.out.println("Nhập email của nhân viên: ");
        email = sc.nextLine();
        System.out.println("Nhập mức lương cơ bản: ");
        basicSalary = Long.parseLong(sc.nextLine());
    }

    // định dạng số tiền
    public String formatCurrency(long money) {
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
        return df.format(money);
    }

    // In thông tin các nhân viên ra màn hình
    @Override
    public String toString() {
        return "id: " + id + " - " + name + " - " + age + " tuổi" + " - " + "SĐT " + phoneNumber + " - " + email + " - "
                + "lương CB " + formatCurrency(basicSalary) + " VND";
    }

}
