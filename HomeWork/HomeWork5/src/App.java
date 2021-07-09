import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        //Viết chương trình liệt kê danh sách lớp bao gồm tên, tuổi, địa chỉ, sử dụng ArrayList
        ArrayList<MyClass> listStudent = new ArrayList<>();
        
        listStudent.add(new MyClass("Trịnh Anh Cương", 21, new Address("Hậu Lộc", "Thanh Hóa")));
        listStudent.add(new MyClass("Nguyễn Hòa Khiêm", 22, new Address("Hoàn Kiếm", "Hà Nội")));
        listStudent.add(new MyClass("Hoa Trần", 26, new Address("Tiên Lữ", "Hưng Yên")));
        listStudent.add(new MyClass("Chính Vũ", 21, new Address("Hoàng Mai", "Hà Nội")));
        listStudent.add(new MyClass("Mai Duy Hưng Thành", 26, new Address("Xuân Trường", "Nam Định")));
        listStudent.add(new MyClass("Đinh Thế Vũ", 26, new Address("Nho Quan", "Ninh Bình")));
        listStudent.add(new MyClass("Đào Ngọc Tùng", 23, new Address("Nam Từ Liêm", "Hà Nội")));
        listStudent.add(new MyClass("Lê Vũ Anh", 29, new Address("TP Bắc Ninh", "Bắc Ninh")));
        listStudent.add(new MyClass("Trịnh Công Mạnh", 22, new Address("Cầu Giấy", "Hà Nội")));
        listStudent.add(new MyClass("Mai Văn Phán", 21, new Address("Lục Ngạn", "Bắc Giang")));
        listStudent.add(new MyClass("Trịnh Công Mạnh", 27, new Address("Văn Giang", "Hưng Yên")));

        System.out.println("Danh sách học viên: ");

        for(int i = 0; i < listStudent.size(); i++){
            System.out.println("STT" + " " + (i+1) + ": " + listStudent.get(i));
        }
        
    }
}
