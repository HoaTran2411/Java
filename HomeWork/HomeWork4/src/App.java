import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // bài 1:
        Exercise1 ex1 = new Exercise1();
        ex1.checkArrEle();
        System.out.println();
        System.out.println("-----------------------Kết thúc bài 1-----------------------");
        

        // Bài 2: Tạo mảng quản lý thông tin động vật bao gồm: tên, màu lông, số chân
        System.out.println("-----------------------Bắt đầu bài 2-----------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số phần tử của mảng động vật: ");
        int sizeAnimal = Integer.parseInt(sc.nextLine());

        Animal arrAnimal[] = new Animal[sizeAnimal];

        // nhập thông tin từ bàn phím:
        for (int i = 0; i < sizeAnimal; i++) {
            Animal animal = new Animal();
            animal.scanAnimal();
            arrAnimal[i] = animal;
        }
        for (int i = 0; i < sizeAnimal; i++) {
            System.out.println(arrAnimal[i]);
        }
        System.out.println("-----------------------Kết thúc bài 2-----------------------");


        // Bài 3 (Nâng cao): Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím.
        System.out.println("-----------------------Bắt đầu bài 3-----------------------");
        Exercise3 ex3 = new Exercise3();
        ex3.twoDimenArr();
        System.out.println();
        System.out.println("-----------------------Kết thúc bài 3-----------------------");

    }
}
