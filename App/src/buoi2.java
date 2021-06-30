import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

enum Season{
    SPRING, SUMMER, FALL, WINTER;
}  //khai báo enum trong hoặc ngoài class đều dc
//theo quy chuẩn viết từng phần tử in hoa, để phân biệt đây là hằng


public class buoi2 {
    // enum Season{
    //     SPRING, SUMMER, FALL, WINTER;
    // }   //có thể khai báo enum trong class
    static final int MAX = 500;
    public static void main(String[] args){
        Season summer = Season.SUMMER;
        System.out.println(summer);

        //weekday
        // WeekDay1 monday = WeekDay1.MONDAY;  //sẽ báo lỗi vì gọi enum trong file weekday bên trong class, phải tạo file riêng chỉ chứa enum thôi,
        //tên enum cần trùng tên file java, tạm thời hiểu thế nhé, sau học class vs phương thức thì tìm hiểu lại :V
        // System.out.println(monday);

        
        //local date: lấy ngày
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println("Tháng theo số: " + today.getYear());
        System.out.println("Thêm 7 ngày: " + today.plusDays(7));
        System.out.println("Giảm đi 7 ngày: " + today.minusDays(7));
        System.out.println("Ngày mai là: " + today.plusDays(1));

        //local time: để lấy giờ
        LocalTime currentTime = LocalTime.now();
        System.out.println("Bây giờ là " + currentTime);

        LocalTime localTime = LocalTime.of(12,30, 12); //có thể chỉ cần truyền 2 tham số
        System.out.println("Giờ nghỉ trưa: " + localTime);
        System.out.println("Hour: " + currentTime.getHour());

        //local datetime: để lấy cả giờ, cả ngày
        LocalDateTime today1 = LocalDateTime.now();
        System.out.println(today1);
        LocalDateTime today2 = LocalDateTime.of(2020, 6, 12, 12, 15, 45);
        System.out.println(today2);

        //datetime formatted
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yy");
        //HH-mm: là viết giờ phút
        String date = today.format(myFormat);
        System.out.println("Ngày sau khi đã format: "+date);
        //lưu ý: M và m (in hoa in thường khác nhau)
        //d-ngày
        //M-tháng
        //y-Năm
        //H-giờ
        //m-phút
        //s-giây

        //khai báo hằng PI: cục bộ, MAX là toàn cục, khai ngoài main
        final double PI = 3.14;  
        System.out.println("Giá trị lớn nhất: " + MAX);
        System.out.println(PI);
        

        //ép kiểu, diễn ra hiện tượng mất dữ liệu ví dụ 10.5 ép sang int chỉ còn 10
        int a = 5;
        double b = a;
        System.out.println(b);

        double d = 10.5;
        int i = (int) d;
        System.out.println(i);

        //lưu ý: ép kiểu string, phải dùng Integer, Double và Float.
        String s = "5";
        int number = Integer.valueOf(s);
        System.out.println(number);
        double dNum = Double.valueOf(s);
        System.out.println(dNum);
        float fNum = Float.valueOf(s);
        System.out.println(fNum);

        







    }
}
