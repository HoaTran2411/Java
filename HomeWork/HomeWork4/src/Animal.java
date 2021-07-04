import java.util.Scanner;

public class Animal {
    // Bài 2: Tạo mảng quản lý thông tin động vật bao gồm: tên, màu lông, số chân
    String name, color;
    int numberOfFeets;

    // tạo contructor
    public Animal(String name, String color, int numberOfFeets) {
        this.name = name;
        this.color = color;
        this.numberOfFeets = numberOfFeets;
    }

    public Animal() {
    }

    // nhập thông tin từ bàn phím:
    Scanner sc = new Scanner(System.in);

    public void scanAnimal() {
        System.out.println("Nhập tên con vật: ");
        name = sc.nextLine();

        System.out.println("Nhập màu lông của con vật");
        color = sc.nextLine();

        System.out.println("Nhập số chân của con vật: ");
        numberOfFeets = Integer.parseInt(sc.nextLine());
    }

    // in mảng object bằng toString
    @Override
    public String toString() {
        return name + " - " + color + " - " + numberOfFeets;
    }

}
