import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Person person1 = new Person(); // tạo đối tượng person1
        // person1.name = "John";
        // person1.age = 22;
        // person1.address = "USA";
        // person1.study("math");
        // // person1.school = "NEU"; //gán lại sẽ thay đổi toàn bộ dữ liệu trong person,
        // // ảnh hưởng cả person1, 2 và 3

        // //gọi trong trường hợp đóng gói
        // person1.setName("John");
        // person1.setAge(22);
        // person1.setAddress("USA");

        // System.out.println("Name: " + person1.getName());
        // System.out.println("Age: " + person1.getAge());
        // System.out.println("Address: " + person1.getAddress());


        // Person person2 = new Person();
        // person2.name = "Lily";
        // person2.study("English");

        // // tên lớp: thường dùng danh từ
        // // tên phương thức: thường dùng động từ

        // // dùng contructor có tham số
        // Person person3 = new Person("Jane", 25, "Ha Noi");
        // System.out.println(person3.age);

        // System.out.println(person3.toString());
        // System.out.println(person1.toString());
        // System.out.println(person2.toString());

        // Person.setSchool();

        // Viết chương trình quản lý học viên của Techmaster, thực hiện
        // các công việc sau:
        //  Tạo class Student chứa các thuộc tính: id, tên, điểm lý
        // thuyết, điểm thực hành, trường
        //  Tạo phương thức để nhập thông tin các học viên
        //  Tạo phương thức để tính điểm trung bình (biết điểm trung
        // bình = điểm lý thuyết + điểm thực hành)
        //  Tạo phương thức để in thông tin ra màn hình


        // //array cho person
        // Person arrPerson[] = new Person[2];
        // for(int i=0; i<arrPerson.length; i++){
        //     Person person = new Person();
        //     person.input(); 
        //     arrPerson[i] = person;
        //     System.out.println(arrPerson[i].toString());   
        // }

        // //arr cho class student
        // student[] arrStudents = new student[2];
        // for(int i = 0; i < arrStudents.length; i++){
        //     student student = new student();
        //     System.out.println("Nhập thông tin cho học viên thứ: "+ (i+1));
        //     student.input();
        //     arrStudents[i] = student;

        // }
        // System.out.println("Thông tin học viên: ");
        // for(student student : arrStudents){
        //     System.out.println(student);
        // }

        // //arrayList
        // ArrayList<String> listName = new ArrayList<>(); //khai báo list arr
        // listName.add("Mai");
        // listName.add("Trang");
        // listName.add("Hoa");

        // // for (String s : listName){
        // //     System.out.println(s);
        // // }

        // listName.add(1,"Hùng");  //chèn thêm phần tử mới vào vị trí chỉ định
        // for (String s : listName){
        //     System.out.println(s);
        // }
        
        // //quản lý student bằng arraylist
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhập số lượng học sinh: ");
        // int size = sc.nextInt();
        // ArrayList<student> listStudents = new ArrayList<>();
        // for(int i=0; i < size; i++){
        //     student student = new student();
        //     System.out.println("Nhập thông tin học sinh thứ " + (i+1));
        //     student.input();
        //     listStudents.add(student);
        // }

        // System.out.println("Danh sách học sinh: ");
        // for(student student : listStudents){
        //     System.out.println(student);
        // }

        // //xóa dữ liệu theo tên
        // sc.nextLine();
        // System.out.println("nhập tên muốn tìm kiếm: ");
        // String name = sc.nextLine();

        // for(int i = 0; i < size; i++){
        //     if(listStudents.get(i).getName().equalsIgnoreCase(name)){
        //         System.out.println(listStudents.get(i));
        //         listStudents.remove(i); //chỉ cần truyền vào i, k cần truyền listStudents.get(i);
        //     }
        // }
        // System.out.println("Danh sách sau khi xóa: ");
        // for(student student : listStudents){
        //     System.out.println(student);
        // }

        //listStudents.add(new Student(5, " Hoang", 8, 9))

        //khác package phải import class của package cần dùng
        // student student1 = new student();
        // student1.input();
        // System.out.println(student1.toString());
        
        //access modifiers: private, protected, public, default

    

        


    }
}
