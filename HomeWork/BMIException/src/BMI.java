import java.util.Scanner;

public class BMI {
    //Tính chỉ số BMI, với chiều cao và cân nặng nhập vào từ bàn phím (Có xử lý exception)

    Scanner sc = new Scanner(System.in);

    public void calculateBMI() {
        double weight = getANumber("cân nặng (kg)", 1000);
        double height = getANumber("chiều cao (m)", 5);

        double BMI = weight / Math.pow(height, 2);
        System.out.printf("Chỉ số BMI của bạn là: %.1f %n", BMI);
    }

    public double getANumber(String infor, int max) {
        double result = 0.00;
        Boolean isCheck = false;
        while (!isCheck) {
            try {
                System.out.println("Vui lòng nhập vào " + infor + ": ");
                result = Double.parseDouble(sc.nextLine());
                if (result <= 0 || result > max) {
                    throw new ArithmeticException();
                }
                isCheck = true;
            } catch (ArithmeticException ex2) {
                System.err.println(infor + " không được nhỏ hơn hoặc bằng 0 hoặc lớn hơn " + max);

            } catch (NumberFormatException ex3) {
                System.err.println(infor + " phải là 1 số!");
            }
        }
        return result;
    }

}
