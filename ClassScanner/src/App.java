import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.next();
        System.out.println("Tên của bạn: " + name);

        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Đây là tuổi của bạn: " + age);

        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi", name, age, age, name);
        sc.close();
        //%f.1 --> chỉ lấy 1 chữ số sau dấu phẩy
    
    //xử lý trôi lệnh:
    //cách 1: dùng câu lệnh sc.nextLine() ở chỗ bị trôi lệnh;

    //cách 2: ép kiểu: float point = Float.valueOf(sc.nextLine())
    //cách 3: ép kiểu: double point = Double.parseDouble(sc.nextLine())
    }

    

    
}
