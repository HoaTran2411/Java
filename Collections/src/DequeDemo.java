import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();

        names.add("Mai");
        names.add("Huy");
        names.add("Trang");
        names.add("Đức");
        System.out.println(names);

        //thêm vị trí đầu tiên và cuối cùng
        names.addFirst("hêh");
        names.offerFirst("NHi");
        names.addLast("HIIIIIIIII");
        names.offerLast("nulllllll");
        System.out.println("Danh sách sau khi thêm: ");
        System.out.println(names);

        //addFirst nếu thêm thất bại ném ra ngoại lệ
        //còn offerFisrt sẽ return false

        //lấy ra phần tử đầu tiên và cuối cùng:
        System.out.println("Phần tử đầu tiên: " + names.getFirst());
        System.out.println("Phần tử đầu tiên: " + names.peekFirst());
        //nếu danh sách rỗng: getFirst sẽ ném ra ngoại lệ, còn peekFirst sẽ return null
        System.out.println("Phần tử cuối cùng: " + names.getLast());
        System.out.println("Phần tử cuối cùng: " + names.peekLast());

        //xóa phần tử: removeFirst trả về phần tử đầu tiên và xóa phần tử đó khỏi danh sách
        System.out.println("Phần tử ở vị trí đầu tiên: " + names.removeFirst());
        System.out.println("Phần tử ở vị trí cuối cùng: " + names.removeLast());
        
        System.out.println("Danh sách sau khi xóa: ");
        System.out.println(names);


        

    }

}
