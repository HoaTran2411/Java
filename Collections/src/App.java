public class App {
    public static void main(String[] args) throws Exception {
        ListDemo list = new ListDemo();
        list.add();
        list.print();
        list.set();
        System.out.println("danh sách sau khi sửa: ");
        list.print();
        list.delete();
        System.out.println("DS SAU KHI XÓA: ");
        list.print();

        //set không chứa các phần tử trùng lặp
    }
}
