

//import java.util.Scanner;

public class Sheet2 {
    public static void main(String[] args) {
        // switch case;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhập số bất kỳ: ");
        // int number = sc.nextInt();

        // switch (number) {
        //     case 1:
        //         System.out.println("One");
        //         break;
        //     case 2:
        //         System.out.println("Two");
        //         break;
        //     case 3:
        //         System.out.println("Three");
        //         break;
        //     default:
        //         System.out.println("Thôi đừng nhập nữa");
        //         // java sẽ phân biệt chữ hoa chữ thường, default vs Default sẽ khác nhau
        // }
        

        // //Nhập vào một tháng bất kỳ và in ra màn hình thông tin tháng đó có bao nhiêu ngày.
        // System.out.println("Nhập vào tháng bất kỳ: ");
        // int month = sc.nextInt();
        // switch(month) {
        //     case 1, 3, 5, 7, 8, 10, 12:
        //         System.out.println("tháng " + month + " có 31 ngày");
        //         break;
        //     case 2:
        //         System.out.println("tháng " + month + " có 28 hoặc 29 ngày");
        //         break;
        //     case 4, 6, 9, 11:
        //         System.out.println("tháng " + month + " có 30 ngày");
        //         break;
        //     default:
        //         System.out.println("Không phải tháng");
        // }
        // sc.close();

        //vòng lặp for
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("in ra số: " + i);
        // }
        // for (int i = 0; i < 5; i+=2) {
        //     System.out.println("in ra số chẵn: " + i);
        // }
        // for (int i = 0; i < 10; i++) {
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }

        //vòng lặp while:
        // int number = 0;
        // while(number <10) {
        //     System.out.println(number);
        //     number++;
        // }

        // for(int i = 0; i < 10; i++){
        //     if(i == 5) {
        //         break;
        //     }
        //     System.out.print(i+"\t");  // \t: định dạng cách in ra
        // }
        // for(int i = 1; i< 101; i++) {
        //     if(i%15==0){
        //         System.out.println("FizzBuzz");
        //     } else if(i%5 ==0) {
        //         System.out.println("Buzz");
        //     } else if(i%3==0) {
        //         System.out.println("Fizz");
        //     } else {
        //         System.out.println(i);
        //     }
        // }

        //đảo ngược chữ:
        String str = "Hello";
        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'l'){
                count++;
            }
        }
        System.out.println((count));
    }
}
