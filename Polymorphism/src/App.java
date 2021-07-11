import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    //lớp trừu tượng: lớp bị hạn chế, k dùng để tạo đối tượng (để truy cập nó phải kế thừa từ lớp khác)
    
    ArrayList<Waiter> listWaiter = new ArrayList<>();
    listWaiter.add(new Waiter(1256, "Đạt", 25, 5000000, 2500000));
    listWaiter.add(new Waiter(0456, "Mai", 23, 4000000, 2000000));
    listWaiter.add(new Waiter(7895, "Thành", 20, 5000000, 1500000));

    for (Waiter waiter : listWaiter) {
        waiter.calculatorSalary();
        System.out.println(waiter);
    }

    //Employee employee = new Employee(1256, "Đạt", 25, 5000000);
    //do class Employee đã đc trừu tượng: dùng abstract nên k truy cập dc từ lớp main
    


    }
}
