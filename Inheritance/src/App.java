import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // // Tính kế thừa: subclass (lớp con) - supperclass (lớp cha)
        // // kế thừa: dùng từ khóa extends

        // // tạo arrayList của teacher
        // ArrayList<Teacher> list = new ArrayList<>();
        // // dùng hàm tạo new Teacher(....) --> đã tạo trong teacher
        // list.add(new Teacher("Ngọc", 25, "Hà Giang", 5000000));

        // // in ra dùng for each
        // for (Teacher teacher : list) {
        //     System.out.println(teacher);
        // }

        // Teacher teacher = new Teacher();
        // teacher.setName("Hoa");
        // teacher.setAge(25);
        // teacher.setAddress("HN");
        // teacher.show();
        // System.out.println("In thông tin tên: ");
        // System.out.println(teacher.getName());

        // // phương thức sleep ở Person có, trong Teacher không cần gọi lại vẫn dùng dc
        // teacher.sleep();

        // //đa kế thừa trong java, không hỗ trợ phải dùng interfaces
        // //đa kế thừa: là 1 thằng con kế thừa từ nhiều cha: nó sẽ làm code trở nên mơ hồ
        // //vì tính chất ở thằng cha sẽ có thể xung đột vs nhau
        // //ví dụ: cha 1 chỉ đi ngủ lúc 9h, cha 2 chỉ ngủ lúc 10h. nếu con mà kế thừa từ cả cha 1 và cha 2
        // //thì con sẽ ngủ lúc 9h hay 10h??? vì vậy java k hỗ trợ đa kế thừa
        // //vấn đề này gọi là diamond problem
        // //JAVA dc thiết kế vs nhiều cải tiến trong đó sự đơn giản là 1 trong những điều quan trọng

        // //tạo class student kế thừa teacher: thêm thuộc tính là điểm lý thuyết và thực hành
        // //double theoryPoint;
        // //double practicePoint;

        // //gọi ra arrayStudent
        // ArrayList<Student> studentList = new ArrayList<>();
        // studentList.add(new Student("Hoa", 25, "HN", 5000000, 9.2, 8.7));

        // //in ra 
        // for(Student value: studentList){
        //     System.out.println(value);
        // }

        // System.out.println("in ra phương thức của lớp cụ là Person");
        // //gọi ra sleep ở lớp cha Person là cha của Teacher
        // Student student = new Student();
        // student.setName("Hoa");
        // student.sleep();

        // //HAS-A: làm tăng tính tái sử dụng của code
        // //IS-A: là quan hệ kế thừa trong Java

        // //muốn gọi dc class hoa chứa address, phải gọi cả 2 cái
        // Address address = new Address("Hoàng Mai", "hà nội", "VN");
        // Hoa hoet = new Hoa(26,"Hoa",  address);
        // hoet.display();
        

        //chương trình quản lý thư viện
        //tạo arraylist schoolBook

        Scanner sc = new Scanner(System.in);
        ArrayList<SchoolBook> listSchoolBook = new ArrayList<>();
        System.out.println("Nhập vào số lượng sách: ");
        int size = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < size; i++){
            SchoolBook schoolBook = new SchoolBook();
            schoolBook.input();
            listSchoolBook.add(schoolBook);
            System.out.println("Kết quả là: ");
        }

        for (SchoolBook value : listSchoolBook){
            System.out.println(value);
        }

        //lớp object là lớp cha lớn nhất, k kế thừa của bất cứ class nào cả
        













    }

}
