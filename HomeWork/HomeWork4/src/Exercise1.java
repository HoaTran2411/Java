import java.util.Scanner;

public class Exercise1 {
    // Bài 1: Tạo mảng chuỗi gồm n phần tử (n nhập vào từ bàn phím)
    // Nhập thông tin cho các phần tử
    // In thông tin ra màn hình
    // Đếm số lần “Java” xuất hiện trong mảng
    // Nhập vào từ bàn phím chuỗi bất kỳ, kiểm tra chuỗi đó ở vị trí nào của mảng

    public void checkArrEle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước của mảng chuỗi 1 chiều: ");
        int size = Integer.parseInt(sc.nextLine());

        String array1[] = new String[size];

        System.out.println("Nhập vào các phần tử của mảng chuỗi 1 chiều: ");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextLine();
        }
        // in thông tin ra màn hình
        for (int i = 0; i < size; i++) {
            System.out.printf("phần tử thứ %d của dãy là %s %n", i, array1[i]);
        }

        // Đếm số lần “Java” xuất hiện trong mảng, không phân biệt chữ hoa chữ thường:
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array1[i].equalsIgnoreCase("java")) {
                count++;
            }
        }
        System.out.println("số lần “Java” xuất hiện trong mảng chuỗi là: " + count);

        // Nhập vào từ bàn phím chuỗi bất kỳ, kiểm tra chuỗi đó ở vị trí nào của mảng
        System.out.println("Nhập vào 1 chuỗi bất kỳ: ");
        String str1 = sc.nextLine();

        // kiểm tra chuỗi đó có thuộc mảng không (không phân biệt chữ hoa và thường)
        Boolean isArrEle = false;
        for (int i = 0; i < size; i++) {
            if (array1[i].equalsIgnoreCase(str1)) {
                isArrEle = true;
                break;
            }
        }

        // in ra vị trí chuỗi
        if (isArrEle) {
            System.out.printf("Vị trí của chuỗi \"%s\" ở trong mảng: ", str1);
            for (int i = 0; i < size; i++) {
                if (array1[i].equalsIgnoreCase(str1)) {
                    System.out.print(i + "  ");
                }
            }
            System.out.println();
        } else {
            System.out.printf("Chuỗi \"%s\" không tồn tại trong mảng", str1);
        }
    }
}
