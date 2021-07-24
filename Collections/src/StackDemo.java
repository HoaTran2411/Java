
import java.util.Stack;

public class StackDemo {
    // truy cập và lưu trữ theo cơ chế last in first out (LIFO);
    Stack<String> names = new Stack<>();

    public void add() {
        names.push("Mai");
        names.push("Trang");
        names.push("Vy");
        names.push("Hải");
        names.push("Nga");
    }

    // không thể chèn phần tử vs stack, vì cơ chế LIFO
    public void set() {
        names.set(0, "hức");
    }

    public void getFirst() {
        System.out.println(names.peek());
    }

    public void print() {
        for (String string : names) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        StackDemo demo = new StackDemo();
        demo.add();
        demo.print();
        demo.set();
        System.out.println("Danh sách sau sửa: ");
        demo.print();
        System.out.println("Phần tử ở phía trên cùng: " + demo.names.peek());
        System.out.println("phần tử ở trên cùng: " + demo.names.pop());
        demo.print();
        //pop trả về phần tử phía trên cùng, xóa phần tử ấy ở stack;

        System.out.println("Vị trí của phần tử Quang: " + demo.names.search("Quang"));
        System.out.println("Vị trí của phần tử Hải: " + demo.names.search("Hải"));
        //search trả về vị trí phần tử, chứ không phải index
        //nếu phần tử không tồn tại trong stack, sẽ trả về "-1";

        System.out.println("Danh sách có rỗng không: " + demo.names.empty());
        //false: không rỗng, true là stack rỗng

        System.out.println("Phần tử Hải có index là: " + demo.names.lastIndexOf("Hải"));
        //lastIndexOf: trả về vị trí của phần tử, đếm từ trên xuống dưới, giống vs array và list


    }
}
























