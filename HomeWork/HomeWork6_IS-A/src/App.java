import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // nhập vào thông tin lập trình viên
        ArrayList<Developer> listDeveloper = new ArrayList<>();
        System.out.println("--------------Nhập vào số lượng lập trình viên: --------------");
        int sizeDeveloper = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < sizeDeveloper; i++) {
            System.out.println("Nhập vào thông tin lập trình viên thứ " + (i + 1));
            Developer developer = new Developer();
            developer.input();
            listDeveloper.add(developer);
        }

        // nhập vào thông tin kiểm chứng viên
        ArrayList<Tester> listTester = new ArrayList<>();
        System.out.println("--------------Nhập vào số lượng tester: --------------");
        int sizeTester = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < sizeTester; i++) {
            System.out.println("Nhập vào thông tin tester thứ " + (i + 1));
            Tester tester = new Tester();
            tester.input();
            listTester.add(tester);
        }

        System.out.println();

        // in thông tin ra ngoài màn hình
        System.out.println("Danh sách lập trình viên: ");
        for (int i = 0; i < sizeDeveloper; i++) {
            System.out.println((i + 1) + ". " + listDeveloper.get(i));
        }

        System.out.println();

        System.out.println("Danh sách tester: ");
        for (int i = 0; i < sizeTester; i++) {
            System.out.println((i + 1) + ". " + listTester.get(i));
        }
        System.out.println();

    }
}
