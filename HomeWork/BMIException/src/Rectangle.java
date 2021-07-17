import java.util.Scanner;

public class Rectangle {
    // Vẽ hình chữ nhật sao với chiều dài và chiều rộng nhập vào từ bàn phím (Có xử
    // lý exception)
    Scanner sc = new Scanner(System.in);
    int length, width;

    public void printRectangle() {
        Boolean isCheck = false;

        while (!isCheck) {
            try {
                // nhập từ bàn phím chiều dài hình chữ nhật:
                System.out.println("Vui lòng nhập vào chiều dài của hình chữ nhật sao: ");
                length = Integer.parseInt(sc.nextLine());
                if (length <= 0) {
                    throw new ArithmeticException();
                }
                isCheck = true;

                // nhập từ bàn phím chiều rộng hình chữ nhật:
                getWidth();

            } catch (ArithmeticException ex2) {
                System.err.println("Chiều dài không được nhỏ hơn hoặc bằng 0!");

            } catch (NumberFormatException ex3) {
                System.err.println("Chiều dài phải là 1 số nguyên!");
            }
        }

        System.out.printf("Hình chữ nhật sao có chiều dài %d và chiều rộng %d: %n", length, width);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public int getWidth() {
        while (true) {
            try {
                System.out.println("Vui lòng nhập vào chiều rộng của hình chữ nhật sao: ");
                width = Integer.parseInt(sc.nextLine());
                if (width <= 0 || width > length) {
                    throw new ArithmeticException();
                }
                break;

            } catch (ArithmeticException ex2) {
                System.err
                        .println("Chiều rộng không được nhỏ hơn hoặc bằng 0 hoặc lớn hơn " + length + " (chiều dài) !");
                continue;

            } catch (NumberFormatException ex3) {
                System.err.println("Chiều rộng phải là 1 số nguyên!");
                continue;
            }
        }
        return width;
    }
}
