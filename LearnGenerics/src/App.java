import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // //array kiểu String
        // //bước 1: tạo 1 array
        // // String [] name = new String[3];
        // // name[0] = "Hoa";
        // // name[1] = "Mai";
        // // name[2] = "Thắng";
        // String [] name = {"Hoa", "Mai", "Thắng" };
        
        // //bước 2: gắn vào class generic để dùng các method của class
        // //tạo đối tượng class generic
        // ClassGenerics<String> demo01 = new ClassGenerics<String>(name); //contructor đã dc tạo bên classGeneric: trong () là 1 array
        // demo01.printArr();

        // Integer [] number = {2,7,8,10}; //kiểu in cơ mà phải truyền vào interger// truyền vào int là lỗi
        // ClassGenerics<Integer> demo02 = new ClassGenerics<Integer>(number);
        // demo02.printArr();

        //bài toán arrayList
        ArrayList<String> listString = new ArrayList<String>();
        GenericArrList<String> demo03 = new GenericArrList<String>(listString);
        demo03.addEle("Java");
        demo03.addEle("Python");
        demo03.addEle("PHP");
        demo03.addEle("Ruby");
        demo03.addEle("JS");
        demo03.addEle("C++");

        demo03.printArrList();
        demo03.removeEle(0);
        System.out.println("danh sách sau khi remove: ");
        demo03.printArrList();

        demo03.setList(0, "Hoét");
        System.out.println("Danh sách sau khi thay thế phần tử: ");
        demo03.printArrList();
        
        







    }
}
