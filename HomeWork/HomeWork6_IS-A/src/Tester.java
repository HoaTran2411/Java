import java.util.Scanner;

public class Tester extends Employees {
    // số lỗi phát hiện được
    private int bugsCount;

    // contructor
    public Tester(long id, String name, int age, String phoneNumber, String email, long basicSalary, int bugsCount) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.bugsCount = bugsCount;
    }

    public Tester() {
    }

    // getter-setter
    public int getBugsCount() {
        return bugsCount;
    }

    public void setBugsCount(int bugsCount) {
        this.bugsCount = bugsCount;
    }

    // phương thức tính lương
    public long getSalary() {
        return basicSalary + (bugsCount * 50000);
    }

    // Thực hiện nhập vào danh sách nhân viên (Sử dụng Scanner)
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lỗi phát hiện được: ");
        bugsCount = Integer.parseInt(sc.nextLine());
    }

    // In thông tin các nhân viên ra màn hình
    @Override
    public String toString() {
        return super.toString() + " - " + bugsCount + " bugs" + " - " + "lương " + formatCurrency(getSalary()) + " VND";
    }

}
