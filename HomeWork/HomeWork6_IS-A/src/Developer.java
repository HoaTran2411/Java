import java.util.Scanner;

public class Developer extends Employees {

    // số giờ overtime
    private int overTimeHours;

    // contructor
    public Developer(long id, String name, int age, String phoneNumber, String email, long basicSalary,
            int overTimeHours) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.overTimeHours = overTimeHours;
    }

    public Developer() {
    }

    // getter-setter
    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    // phương thức tính lương
    public long getSalary() {
        return basicSalary + (overTimeHours * 200000);
    }

    // Thực hiện nhập vào danh sách nhân viên (Sử dụng Scanner)
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số giờ overtime: ");
        overTimeHours = Integer.parseInt(sc.nextLine());
    }

    // In thông tin các nhân viên ra màn hình
    @Override
    public String toString() {
        return super.toString() + " - " + overTimeHours + "h overtime" + " - " + "lương " + formatCurrency(getSalary())
                + " VND";
    }
}
