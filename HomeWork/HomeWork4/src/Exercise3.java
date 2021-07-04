import java.util.Scanner;

public class Exercise3 {
    // Bài 3 (Nâng cao): Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím.
    // Thực hiện:
    // Nhập các phần tử mảng
    // In thông tin mảng ra màn hình
    // Liệt kê các phần tử nằm trên đường chéo chính

    public void twoDimenArr() {
        // nhập thông tin mảng 2 chiều từ bàn phím:
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng 2 chiều: ");
        int rowSize = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào số cột của mảng 2 chiều: ");
        int colSize = Integer.parseInt(sc.nextLine());

        int twoDimenArr[][] = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.printf("Nhập vào phần tử vị trí [%d][%d] của mảng: ", i, j);
                twoDimenArr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        // in thông tin mảng ra màn hình
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(twoDimenArr[i][j] + "\t");
            }
            System.out.println();
        }

        // kiểm tra có phải ma trận vuông hay Không, liệt kê các phần tử nằm trên đường chéo chính
        if (rowSize == colSize) {
            System.out.print("Đây là ma trận vuông và có các phần tử nằm trên đường chéo chính là: ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        System.out.print(twoDimenArr[i][j] + " ");
                    }
                }
            }
        } else {
            System.out.println("Đây không phải ma trận vuông, không tồn tại đường chéo chính!");
        }
    }
}
