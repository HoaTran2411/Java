import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Bài 1: Tính cạnh huyền của tam giác vuông:
        double a = 3;
        double b = 4;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Cạnh huyền của tam giác vuông bằng: " + c);


        // Bài 2: Viết chương trình tính chỉ số BMI, với cân nặng và
        // chiều cao nhập từ bàn phím. Trong đó:
        // Cân nặng tính theo kg
        // Chiều cao tính theo met
        // In ra màn hình chỉ số BMI

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cân nặng của bạn (kg): ");
        double weight = sc.nextDouble();

        System.out.println("Nhập chiều cao của bạn (m): ");
        double height = sc.nextDouble();  

        double BMI = weight/ Math.pow(height, 2);
        System.out.printf("Chỉ số BMI của bạn là: %.1f", BMI);

    }
}
