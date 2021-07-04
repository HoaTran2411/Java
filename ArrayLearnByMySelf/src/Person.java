import java.util.Scanner;

public class Person {
    String name;
    int age;
    String address;

    
    //lớp này thuộc lớp object;
    //phương pháp toString để trả về chuỗi đại diện của đối tượng

    @Override
    public String toString() {
        return name + " " + age + " " + address;
    }

    //tạo 1 method riêng để nhập dữ liệu cho từng phần tử
    public void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        name = sc.nextLine();

        System.out.println("Nhập vào tuổi: ");
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập vào địa chỉ: ");
        address = sc.nextLine();
    }

    //tạo contructor, tên contructor phải trùng vs tên class: 
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }
}
