import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    static final double PI = 3.14;// khai báo hằng bên ngoài main phải thêm static

    enum Season {
        SPRING, SUMMER, FALL, WINTER;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(PI);
        // // khai báo hằng số:
        // final int MY_AGE = 25;
        // // MY_AGE = 50; --> Hằng số sẽ không thể gán lại giá trị, nếu cố tình sẽ báo
        // lỗi
        // // lưu ý: hằng số phải viết in hoa kiểu underscores
        // System.out.println(MY_AGE);

        // // tìm số lớn nhất trong 3 số:
        // int num1 = 125;
        // int num2 = 12;
        // int num3 = 45;
        // // lưu ý hàm max chỉ dành cho 2 số
        // int max = Math.max(Math.max(num1, num2), num3);
        // System.out.println(max);

        // // phát sinh STN ngẫu nhiên nằm trong khoảng từ 14 đến 19;
        // int randomNum1 = (int) (Math.random() * (19 - 14 + 1)); // random tạo ra số
        // từ 0 tới nhỏ hơn 1
        // // lưu ý khi ép kiểu về int --> tức là làm tròn, tương đương dùng floor (làm
        // // tròn xuống, giữ nguyên phần chữ số nguyên, bỏ hết phần thập phân)
        // int randomNum2 = 14 + randomNum1;
        // System.out.println(randomNum2);
        // int a = (int) 5.05;
        // System.out.println(a);

        // //in ra bảng cửu chương:
        // for (int i = 0; i < 10; i++){
        // System.out.printf("%d * %d = %d %n", 5, i, 5*i );
        // }

        // bảng cửu chương nâng cao
        // for (int i = 1; i < 5; i++) {
        // System.out.printf("Bảng cửu chương %d",i);
        // System.out.println();
        // for (int j = 1; j < 5; j++) {
        // System.out.printf("%d * %d = %d %n", i, j, j * i);
        // }
        // }

        // enum: có thể khai báo trong lớp hoặc bên ngoài lớp,
        // trường của enum viết in hoa, quy chuẩn
        // enum Season {
        // SPRING, SUMMER, FALL, WINTER;
        // }

        // Season summer = Season.SUMMER;
        // System.out.println(summer);

        // Season winter = Season.WINTER;
        // System.out.println(winter);

        // //enum của Month có sẵn
        // System.out.println(Month.APRIL);
        // System.out.println(Month.JULY);

        // //GỌI TỚI ENUM WEEKDAY
        // WeekDay monday = WeekDay.MONDAY;
        // System.out.println(monday);

        // for(WeekDay day: WeekDay.values()){
        // System.out.println(day);
        // }

        // lấy ra value của từng phần tử trong enum;
        // WeekDay monday = WeekDay.MONDAY;
        // System.out.println(monday);
        // System.out.println(monday.getValue());

        LocalDate toDay = LocalDate.now();
        System.out.println(toDay);

        // DateTimeFormatter
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yy");
        String toDayFormat = toDay.format(formatDate);

        System.out.println(toDayFormat);

        // scanner
        // scanner
        Scanner sc = new Scanner(System.in);
        // nếu trong cùng 1 package mà có 2 file main, phải tự tạo contructor
        // nhập vào từ bàn phím và in ra tên,tuổi, điểm, địa chỉ
        System.out.println("Nhập vào tên của bạn: ");
        String name = sc.nextLine();

        System.out.println("Nhập vào tuổi của bạn: ");
        int age = Integer.valueOf(sc.nextLine());

        System.out.println("Nhập vào điểm của bạn: ");
        Double score = Double.parseDouble(sc.nextLine());

        System.out.println("Nhập vào địa chỉ của bạn: ");
        String address = sc.nextLine();

        System.out.println("Tên của bạn là: " + name);
        System.out.println("Tuổi của bạn là: " + age);
        System.out.println("Điểm của bạn là: " + score);
        System.out.println("Địa chỉ của bạn là: " + address);

        // nhập dạng số chuyển sang string sẽ bị trôi lệnh, vì khi ấn enter, nó sẽ hiểu
        // đấy là lệnh nhập rỗng cho phần string tiếp theo

        // tạo ra các string liên tiếp hoặc thêm 1 next string rỗng

    }
}
