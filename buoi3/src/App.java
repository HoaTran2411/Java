import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //câu điều kiện if-else;
        int a = 5;
        int b = 6;
        int c = 2;
        if (a<b) {
            System.out.println("a nhỏ hơn b");
        } else if (a==b) {
            c = a+b;
            System.out.println("a bằng b");
        } else {
            System.out.println("a lớn hơn b");
        }
        System.out.println(c);  //nhảy vào trường hợp a = b, sẽ ra kết quả c = a+b;
        //nếu các trường hợp còn lại c sẽ bằng đúng 2;


        //so sánh chuỗi: equals và equalsIgnoreCase
        String s1 = "java";
        String s2 = new String("java");
        String s3 = "java";
        //cách 1: dùng equals
        if(s1.equals(s2)){
            System.out.println("Hai chuỗi giống nhau");
        } else {
            System.out.println("khác nhau");
        }
        //cách 2: dùng toán tử so sánh ==
        if(s1 == s2){
            System.out.println("Hai chuỗi giống nhau");
        } else {
            System.out.println("khác nhau");
        }
        //equal: so sánh nội dung, còn toán tử "==" so sánh địa chỉ;

        //so sánh s1 vs s3: s1 và s3 cùng địa chỉ:
        if(s1 == s3){
            System.out.println("Hai chuỗi giống nhau");
        } else {
            System.out.println("khác nhau");
        }
    
        //else if nhiều quá thì dùng swift case nhóe:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ: ");
        int number = sc.nextInt();
        if (number == 5) {
            System.out.println("Bạn vừa nhập 5");
        }
        else if (number == 6) {
            System.out.println("Bạn vừa nhập 6");
        }
        else if (number == 7) {
            System.out.println("Bạn vừa nhập 7");
        } else {
            System.out.println("Mệt quá, đừng nhập nữa");
        }

        //bài tập tính chỉ số BMI 
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn (kg): ");
        double weight = sc1.nextDouble();

        System.out.println("Nhập chiều cao của bạn (m): ");
        double height = sc1.nextDouble();  

        double BMI = weight/ Math.pow(height, 2);
        System.out.printf("Chỉ số BMI của bạn là: %.1f", BMI);
        if(BMI < 18.5) {
            System.out.println(" Thiếu cân");
        } else if (BMI > 24.9) {
            System.out.println(" Thừa cân");
        } else {
            System.out.println(" cân đối");
        }
        sc.close();
        sc1.close();
    }
}
