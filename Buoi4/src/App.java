import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhập tên: ");
        // String name = sc.nextLine();
        // System.out.println("Tên sau khi chuẩn hóa: ");

        // // tên chuẩn hóa: loại bỏ khoảng trắng dư thừa, viết hoa chữ cái đầu tiên mỗi từ

        // System.out.println(normalization(name));

        // // bài toán check 3 số có tạo thành 3 cạnh của 1 tam giác
        // // a, b, c: nếu a+ b > c và a+c > b và b+c > a thì là tam giác
        // // không thì thôi
        // System.out.println(checkTriangle(3, 4, 5));

        // //gọi ra lottery
        // Lottery lottery = new Lottery();
        // System.out.println(lottery);

        //bài array
        LocalDate arrayDate[] = new LocalDate[5]; //khởi tạo mảng
        LocalDate date = LocalDate.of(2021,7,1); //tạo đối tượng date
        for (int i=0; i< arrayDate.length; i++){
            date = date.plusDays(1);
            arrayDate[i] = date;
        }
        
        for(LocalDate localDate : arrayDate){
            System.out.println(localDate);
        }











    }

    // tạo function riêng, bắt buộc phải return, để chuẩn hóa tên
    public static String normalization(String name) {
        name = name.trim().toLowerCase();
        name = name.replaceAll("\\s+", " ");

        // check lại có nhất thiết phải có bước sửa khoảng trắng thừa trên không,
        // hay dùng split thay thế được
        String arr[] = name.split(" ");
        String newName = new String();

        for (int i = 0; i < arr.length; i++) {
            // lấy ra từng từ, sau đó viết in hoa chữ cái đầu
            String str = String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1) + " ";
            newName += str;
        }
        // return newName.substring(0, newName.length()-1);
        return newName.trim(); // loại bỏ khoảng trắng đầu và cuối chuỗi
    }

    // có thể dùng boolean cho checkTriangle, trả về true, false
    public static String checkTriangle(double a, double b, double c) {
        String result = "";
        if (a + b > c && a + c > b && c + b > a) {
            result = "đây là 3 cạnh 1 tam giác";
        } else {
            result = "không phải";
        }
        return result;
    }
}
