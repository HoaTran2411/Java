import java.io.InputStream;
import java.util.Scanner;

public class Scanner {
    public Scanner(InputStream in) {
    }

    public static void main(String[] args){
        System.out.println("Hello world!");

        //ép kiểu: sẽ bị mất mát dữ liệu
        //không thể ép kiểu string sang int, muốn ép phải dùng kiểu.valueOf()
        String s = "5";
        //int number = Integer.valueOf(s);
        int number = Integer.parseInt(s);

        double dNum = Double.valueOf(s);
        System.out.println(number + " " + dNum);

        //valueOf là phương thức dùng để chuyển đổi kiểu dữ liệu khác thành chuỗi
        //parseInt là để chuyển từ chuỗi String thành số, kiểu int

        //ép kiểu các trường hợp string sang number: dùng valueOf hoặc parseInt, ParseDouble,...


        




        
    }

    private int nextInt() {
        return 0;
    }

    private String nextLine() {
        return null;
    }
}
