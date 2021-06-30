import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // int [] arrNum = new int[5];
        // arrNum[0] = 1;
        // arrNum[1] = 3;
        // arrNum[2] = 8;
        // arrNum[3] = 11;
        // arrNum[4] = 5;
        // for(int i = 0; i < arrNum.length; i++) {
        // System.out.println(arrNum[i]);
        // }
        //sắp xếp theo thứ tự tăng hoặc giảm dần (tự làm nhé)

        //nhập mảng từ bàn phím:
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước mảng: ");
        int size = sc.nextInt();
        int [] arrNum = new int[size];

        System.out.println("nhập phần tử của mảng: ");
        for(int i = 0; i < arrNum.length; i++){
            arrNum[i] = sc.nextInt();
        }
        sc.close();

        //sắp xếp mảng
        for(int i = 0; i < arrNum.length; i++){
            for (int j = i+1; j < arrNum.length; j++){
                if(arrNum[i] > arrNum[j]) {
                    int temp = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = temp;
                }
            }
        }
        show(arrNum);

        
        // for(int i = 0; i < arrNum.length; i++) {
        //     System.out.println(arrNum[i]);
        // } //nếu dùng nhiều lần, tạo ra phương thức sau đó gọi lại cho nhanh
        //ví dụ: show(arrNum);


        //tính tổng các phần tử trong vòng lặp


        // arrNum = new int[5] //cái này không thể làm thay đổi kích thước của mảng cũ,
        // mà nó sẽ tạo ra mảng mới
        // mảng mới này sẽ không còn chứa các phần tử cũ trên kia nữa

        // sửa 1 phần tử của mảng:
        // arrNum[0] = 4;
        // for(int i = 0; i < arrNum.length; i++) {
        // System.out.println(arrNum[i]);
        // }

        // mảng kiểu chuỗi:
        // String[] arrStr = new String[3];
        // arrStr[0] = "Java";
        // arrStr[1] = "PHP";
        // arrStr[2] = "Python";
        // // dòng vòng lặp for để in mảng
        // for (int i = 0; i < arrStr.length; i++) {
        //     System.out.print(arrStr[i] + "\t");
        //     // "\t" để tạo khoảng cách
        // }
        // System.out.println();
        // System.out.println(arrStr[0].endsWith("a"));

        // // split
        // String name = "Trần Thị Thu Hoa";
        // String arrName[] = name.split("\s+");

        // for (int i = 0; i < arrName.length; i++) {
        //     System.out.printf("Phần tử ở vị trí %d: %s", i, arrName[i] + "\n");
        // }

    }
    public static void show(int arr[]){
        for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }}

}
