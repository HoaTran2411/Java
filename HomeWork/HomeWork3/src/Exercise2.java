import java.util.Scanner;

public class Exercise2 {
    // Câu 2: Nhập 1 chuỗi bất kỳ và kiểm tra xem chuỗi đó có là chuỗi palindrome không
    public void checkPalindrome() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi bất kỳ (không dấu): ");
        String str2 = sc.nextLine();

        Boolean check = true;
        
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
                check = false;
                break;
            }
        }

        if (check == false) {
            System.out.println("Đây không phải là chuỗi palindrome");
        } else {
            System.out.println("Đây là chuỗi palindrome");
        }

    }

}
