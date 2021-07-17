
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //exception khi nhập số phần tử của mảng:
        boolean check = false;
        while(!check){
            try{
                System.out.println("Nhập số phần tử: ");
                int size = Integer.parseInt(sc.nextLine()); //nếu dùng thẳng sc.nextInt(), sẽ chạy vòng lặp vô tận, phải chuyển sang kiểu String
                int[] arrNum = new int[size];
                check = true;
            } catch (NegativeArraySizeException e1){
                System.out.println("Kích thước mảng phải là 1 số dương!");
            } catch (NumberFormatException e2){
                System.out.println("Kích thước mảng phải là 1 số!");
            } 
        }

        //throw và throws
        //checked và unchecked exception
        //tính chỉ số BMI
        //chiều cao và cân nặng nhập từ bàn phím
    }  
}
