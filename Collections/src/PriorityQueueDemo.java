import java.util.PriorityQueue;
//dùng ctrl, kích vào keyword trong java sẽ có file giải thích về keyword đó

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> names = new PriorityQueue<>();

        // thêm phần tử (được phép phần tử trùng lặp)
        names.add("Mai");
        names.add("Ngát");
        names.add("Quân");
        names.add("Bảo");
        names.add("Mai");
        System.out.println("Danh sách ban đầu: ");
        System.out.println(names);

        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(1);
        number.add(20);
        number.add(10);
        System.out.println("Danh sách ban đầu: ");
        System.out.println(number);

        System.out.println("Phần tử ở vị trí đầu tiên: ");
        System.out.println(number.peek());

        System.out.println("Phần tử ở vị trí đầu tiên: " + number.poll());
        System.out.println("Danh sách sau khi xóa");
        System.out.println(number);

        number.offer(6);
        number.offer(2);
        number.offer(13);
        System.out.println("Danh sách sau khi thêm: ");
        System.out.println(number);

        //đưa phần tử được ưu tiên đẩy lên đầu danh sách, k phải sắp xếp theo tăng dần hay giảm dần
        System.out.println("Phần tử đầu tiên: " + number.element());

        //nếu số phần tử bằng giống: element sẽ ném ra ngoại lệ, còn poll trả về "null";
        //đây là cách phân biệt element và pull khi đều trả về phần tử đầu tiên
        

    }
}
